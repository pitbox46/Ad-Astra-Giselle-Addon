package ad_astra_giselle_addon.common.registry;

import ad_astra_giselle_addon.common.AdAstraGiselleAddon;
import ad_astra_giselle_addon.common.item.NetheriteOxygenCanItem;
import ad_astra_giselle_addon.common.item.OxygenCanItem;
import ad_astra_giselle_addon.common.item.SlidingDoorKeyItem;
import net.minecraft.world.item.Item;

public class AddonItems
{
	public static final ItemRegistryCollection ITEMS = new ItemRegistryCollection(AdAstraGiselleAddon.MOD_ID);
	public static final ObjectRegistryHolder<OxygenCanItem> OXYGEN_CAN = ITEMS.add("oxygen_can", () -> new OxygenCanItem(getMainItemProperties()));
	public static final ObjectRegistryHolder<NetheriteOxygenCanItem> NETHERITE_OXYGEN_CAN = ITEMS.add("netherite_oxygen_can", () -> new NetheriteOxygenCanItem(getMainItemProperties()));
	public static final ObjectRegistryHolder<SlidingDoorKeyItem> SLIDING_DOOR_KEY = ITEMS.add("sliding_door_key", () -> new SlidingDoorKeyItem(getMainItemProperties().stacksTo(1)));

	public static Item.Properties getMainItemProperties()
	{
		return new Item.Properties().tab(AddonTabs.tab_main);
	}

	private AddonItems()
	{

	}

}
