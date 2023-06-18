package ad_astra_giselle_addon.client.screen;

import java.awt.Rectangle;
import java.util.List;

import ad_astra_giselle_addon.common.AdAstraGiselleAddon;
import ad_astra_giselle_addon.common.block.entity.FuelLoaderBlockEntity;
import ad_astra_giselle_addon.common.menu.FuelLoaderMenu;
import ad_astra_giselle_addon.common.util.TranslationUtils;
import earth.terrarium.ad_astra.client.screen.GuiUtil;
import earth.terrarium.botarium.common.fluid.base.FluidHolder;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class FuelLoaderScreen extends AddonMachineScreen<FuelLoaderBlockEntity, FuelLoaderMenu>
{
	public static final ResourceLocation TEXTURE = AdAstraGiselleAddon.rl("textures/gui/container/fuel_loader.png");

	public static final int TANK_LEFT = 67;
	public static final int TANK_TOP = 27;

	public FuelLoaderScreen(FuelLoaderMenu menu, Inventory inventory, Component title)
	{
		super(menu, inventory, title, TEXTURE);
		this.imageWidth = 176;
		this.imageHeight = 182;
		this.inventoryLabelY = this.imageHeight - 94;
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY)
	{
		super.renderBg(guiGraphics, partialTicks, mouseX, mouseY);

		FluidHolder fluid = this.getFluid();
		long capacity = this.getCapacity();
		Rectangle bounds = this.getFluidTankBounds();
		GuiUtil.drawFluidTank(guiGraphics, bounds.x, bounds.y, capacity, fluid);
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta)
	{
		super.render(guiGraphics, mouseX, mouseY, delta);

		if (GuiUtil.isHovering(this.getFluidTankBounds(), mouseX, mouseY))
		{
			if (shouldShowRecipeTooltip())
			{
				guiGraphics.renderComponentTooltip(this.font, this.getFluidTankTooltip(), mouseX, mouseY);
			}

		}

	}

	public Rectangle getFluidTankBounds()
	{
		return GuiUtil.getFluidTankBounds(this.leftPos + TANK_LEFT, this.topPos + TANK_TOP);
	}

	public List<Component> getFluidTankTooltip()
	{
		FluidHolder fluid = this.getFluid();
		long capacity = this.getCapacity();
		return TranslationUtils.fluid(fluid, capacity);
	}

	public FluidHolder getFluid()
	{
		return this.getMenu().getFluids().get(0);
	}

	public long getCapacity()
	{
		return this.getMenu().getMachine().getFluidContainer().getTankCapacity(0);
	}

}
