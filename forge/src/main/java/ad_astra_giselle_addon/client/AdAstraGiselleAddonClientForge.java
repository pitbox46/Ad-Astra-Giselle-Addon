package ad_astra_giselle_addon.client;

import java.util.function.BiConsumer;

import com.mojang.blaze3d.vertex.PoseStack;

import earth.terrarium.ad_astra.client.AdAstraClient.RenderHud;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class AdAstraGiselleAddonClientForge
{
	public AdAstraGiselleAddonClientForge()
	{
		IEventBus fml_bus = FMLJavaModLoadingContext.get().getModEventBus();
		IEventBus forge_bus = MinecraftForge.EVENT_BUS;
		fml_bus.addListener((FMLClientSetupEvent e) -> AdAstraGiselleAddonClient.initializeClient());
		fml_bus.addListener((TextureStitchEvent.Pre e) -> AdAstraGiselleAddonClient.registerBlockAtlas(e::addSprite));
		fml_bus.addListener((EntityRenderersEvent.RegisterRenderers e) -> AdAstraGiselleAddonClient.registerBlockEntityRenderer(e::registerBlockEntityRenderer));
		fml_bus.addListener((RegisterGuiOverlaysEvent e) -> AdAstraGiselleAddonClient.registerOverlay(wrapHUD(e::registerBelowAll)));
		forge_bus.addListener((ItemTooltipEvent e) -> AdAstraGiselleAddonClient.registerItemTooltip(register -> register.accept(e.getItemStack(), e.getFlags(), e.getToolTip())));
		fml_bus.addListener((RegisterClientReloadListenersEvent e) -> AdAstraGiselleAddonClient.registerReloadListeners((id, listener) -> e.registerReloadListener(listener)));

		ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () ->
		{
			return new ConfigScreenHandler.ConfigScreenFactory((client, parent) ->
			{
				return AdAstraGiselleAddonClient.getConfigScreen(parent);
			});
		});

	}

	public static BiConsumer<String, RenderHud> wrapHUD(BiConsumer<String, IGuiOverlay> consumer)
	{
		return (name, hud) -> consumer.accept(name, new IGuiOverlay()
		{
			@Override
			public void render(ForgeGui gui, PoseStack poseStack, float partialTick, int screenWidth, int screenHeight)
			{
				hud.renderHud(poseStack, partialTick);
			}
		});
	}

}
