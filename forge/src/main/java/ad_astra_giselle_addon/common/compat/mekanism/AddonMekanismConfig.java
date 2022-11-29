package ad_astra_giselle_addon.common.compat.mekanism;

import com.teamresourceful.resourcefulconfig.common.annotations.Category;
import com.teamresourceful.resourcefulconfig.common.annotations.Comment;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;

import ad_astra_giselle_addon.common.config.CompatsConfig;

@Category(id = AddonMekanismConfig.ID, translation = AddonMekanismConfig.PREFIX)
public final class AddonMekanismConfig
{
	public static final String ID = MekanismCompat.MODID;
	public static final String PREFIX = CompatsConfig.PREFIX + "." + ID;
	public static final String MODULES_ID = "modules";

	public static final String MODULES_SPACE_BREATHING_ID = MODULES_ID + ".space_breathing";
	public static final String MODULES_SPACE_BREATHING_PREFIX = PREFIX + "." + MODULES_SPACE_BREATHING_ID;
	@ConfigEntry(id = MODULES_SPACE_BREATHING_ID + ".oxygen_duration", type = EntryType.INTEGER, translation = MODULES_SPACE_BREATHING_PREFIX + ".oxygen_duration")
	@Comment("Duration of provided oxygen (oxygen provide interval)")
	public static int MODULES_SPACE_BREATHING_OXYGEN_DURATION = 4;
	@ConfigEntry(id = MODULES_SPACE_BREATHING_ID + ".energy_using_provide", type = EntryType.INTEGER, translation = MODULES_SPACE_BREATHING_PREFIX + ".energy_using_provide")
	@Comment("Energy usage when provide Ad Astra oxygen to player in space")
	public static int MODULES_SPACE_BREATHING_ENERGY_USING_PROVIDE = 40;
	@ConfigEntry(id = MODULES_SPACE_BREATHING_ID + ".energy_using_produce", type = EntryType.INTEGER, translation = MODULES_SPACE_BREATHING_PREFIX + ".energy_using_produce")
	@Comment("Energy usage per mb when produce Mekanism oxygen to player in water, rain")
	public static int MODULES_SPACE_BREATHING_ENERGY_USING_PRODUCE = 200;

	public static final String MODULES_SPACE_FIRE_PROOF_ID = MODULES_ID + ".space_fire_proof";
	public static final String SPACE_FIRE_MODULES_PROOF_PREFIX = PREFIX + "." + MODULES_SPACE_FIRE_PROOF_ID;
	@ConfigEntry(id = MODULES_SPACE_FIRE_PROOF_ID + ".energy_using", type = EntryType.INTEGER, translation = SPACE_FIRE_MODULES_PROOF_PREFIX + ".energy_using")
	@Comment("Energy usage when prevent fire every tick in Ad Astra hot planets (e.g. Venus, Mercury)")
	public static int MODULES_SPACE_FIRE_PROOF_ENERGY_USING = 10;

	public static final String MODULES_VENUS_ACID_PROOF_ID = MODULES_ID + ".venus_acid_proof";
	public static final String MODULES_VENUS_ACID_PROOF_PREFIX = PREFIX + "." + MODULES_VENUS_ACID_PROOF_ID;
	@ConfigEntry(id = MODULES_VENUS_ACID_PROOF_ID + ".energy_using", type = EntryType.INTEGER, translation = MODULES_VENUS_ACID_PROOF_PREFIX + ".energy_using")
	@Comment("Energy usage when prevent acid rain damage every tick in Ad Astra Venus")
	public static int MODULES_VENUS_ACID_PROOF_ENERGY_USING = 10;
}
