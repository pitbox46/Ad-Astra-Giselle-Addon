package ad_astra_giselle_addon.common.config;

import com.teamresourceful.resourcefulconfig.common.annotations.Category;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;

@Category(id = EnchantmentsConfig.ID, translation = EnchantmentsConfig.PREFIX)
public final class EnchantmentsConfig
{
	public static final String ID = "enchantments";
	public static final String PREFIX = AddonConfigs.PREFIX + "." + ID;

	@ConfigEntry(id = "tooltip_enabled", type = EntryType.BOOLEAN, translation = PREFIX + ".tooltip_enabled")
	public static boolean TOOLTIP_ENABLED = true;
	@ConfigEntry(id = "tooltip_ignore", type = EntryType.BOOLEAN, translation = PREFIX + ".tooltip_ignore")
	public static boolean TOOLTIP_IGNORE = false;

	public static final String SPACE_BREATHING_ID = "space_breathing";
	public static final String SPACE_BREATHING_PREFIX = PREFIX + "." + SPACE_BREATHING_ID;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".energy_using", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".energy_using")
	public static int SPACE_BREATHING_ENERGY_USING = 10;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".energy_duration", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".energy_duration")
	public static int SPACE_BREATHING_ENERGY_DURATION = 4;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".energy_oxygen", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".energy_oxygen")
	public static int SPACE_BREATHING_ENERGY_OXYGEN = 1;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".durabiltiy_using", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".durabiltiy_using")
	public static int SPACE_BREATHING_DURABILITY_USING = 1;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".durability_duration", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".durability_duration")
	public static int SPACE_BREATHING_DURABILITY_DURATION = 60;
	@ConfigEntry(id = SPACE_BREATHING_ID + ".durability_oxygen", type = EntryType.INTEGER, translation = SPACE_BREATHING_PREFIX + ".durability_oxygen")
	public static int SPACE_BREATHING_DURABILITY_OXYGEN = 15;

	public static final String SPACE_FIRE_PROOF_ID = "space_fire_proof";
	public static final String SPACE_FIRE_PROOF_PREFIX = PREFIX + "." + SPACE_FIRE_PROOF_ID;
	@ConfigEntry(id = SPACE_FIRE_PROOF_ID + ".energy_using", type = EntryType.INTEGER, translation = SPACE_FIRE_PROOF_PREFIX + ".energy_using")
	public static int SPACE_FIRE_PROOF_ENERGY_USING = 10;
	@ConfigEntry(id = SPACE_FIRE_PROOF_ID + ".energy_duration", type = EntryType.INTEGER, translation = SPACE_FIRE_PROOF_PREFIX + ".energy_duration")
	public static int SPACE_FIRE_PROOF_ENERGY_DURATION = 1;
	@ConfigEntry(id = SPACE_FIRE_PROOF_ID + ".durabiltiy_using", type = EntryType.INTEGER, translation = SPACE_FIRE_PROOF_PREFIX + ".durabiltiy_using")
	public static int SPACE_FIRE_PROOF_DURABILITY_USING = 1;
	@ConfigEntry(id = SPACE_FIRE_PROOF_ID + ".durability_duration", type = EntryType.INTEGER, translation = SPACE_FIRE_PROOF_PREFIX + ".durability_duration")
	public static int SPACE_FIRE_PROOF_DURABILITY_DURATION = 60;

	public static final String VENUS_ACID_PROOF_ID = "venus_acid_proof";
	public static final String VENUS_ACID_PROOF_PREFIX = PREFIX + "." + VENUS_ACID_PROOF_ID;
	@ConfigEntry(id = VENUS_ACID_PROOF_ID + ".energy_using", type = EntryType.INTEGER, translation = VENUS_ACID_PROOF_PREFIX + ".energy_using")
	public static int VENUS_ACID_PROOF_ENERGY_USING = 10;
	@ConfigEntry(id = VENUS_ACID_PROOF_ID + ".energy_duration", type = EntryType.INTEGER, translation = VENUS_ACID_PROOF_PREFIX + ".energy_duration")
	public static int VENUS_ACID_PROOF_ENERGY_DURATION = 1;
	@ConfigEntry(id = VENUS_ACID_PROOF_ID + ".durabiltiy_using", type = EntryType.INTEGER, translation = VENUS_ACID_PROOF_PREFIX + ".durabiltiy_using")
	public static int VENUS_ACID_PROOF_DURABILITY_USING = 1;
	@ConfigEntry(id = VENUS_ACID_PROOF_ID + ".durability_duration", type = EntryType.INTEGER, translation = VENUS_ACID_PROOF_PREFIX + ".durability_duration")
	public static int VENUS_ACID_PROOF_DURABILITY_DURATION = 60;
}
