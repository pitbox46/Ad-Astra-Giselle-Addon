package ad_astra_giselle_addon.common.enchantment;

import earth.terrarium.ad_astra.common.item.armor.NetheriteSpaceSuit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EnchantmentHotTemperatureProof extends AddonEnchantment
{
	public EnchantmentHotTemperatureProof()
	{
		super(Rarity.RARE, EnchantmentCategory.ARMOR_CHEST, EquipmentSlot.CHEST);
	}

	@Override
	public boolean canEnchant(ItemStack stack)
	{
		if (stack.getItem() instanceof NetheriteSpaceSuit)
		{
			return false;
		}

		return super.canEnchant(stack);
	}

}
