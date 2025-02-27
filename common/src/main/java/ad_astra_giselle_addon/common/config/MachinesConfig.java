package ad_astra_giselle_addon.common.config;

import com.teamresourceful.resourcefulconfig.common.annotations.Category;
import com.teamresourceful.resourcefulconfig.common.annotations.Comment;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigSeparator;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;

import ad_astra_giselle_addon.common.fluid.FluidHooks2;

@Category(id = MachinesConfig.ID, translation = MachinesConfig.PREFIX)
public final class MachinesConfig
{
	public static final String ID = "machines";
	public static final String PREFIX = AddonConfigs.PREFIX + "." + ID;

	public static final String FUEL_LOADER_ID = "fuel_loader";
	public static final String FUEL_LOADER_PREFIX = PREFIX + "." + FUEL_LOADER_ID;
	@ConfigSeparator(translation = FUEL_LOADER_PREFIX)
	@ConfigEntry(id = FUEL_LOADER_ID + "_fluid_capacity", type = EntryType.LONG, translation = FUEL_LOADER_PREFIX + "_fluid_capacity")
	public static long FUEL_LOADER_FLUID_CAPACITY = FluidHooks2.BUCKET * 8;
	@ConfigEntry(id = FUEL_LOADER_ID + "_fluid_transfer", type = EntryType.LONG, translation = FUEL_LOADER_PREFIX + "_fluid_transfer")
	public static long FUEL_LOADER_FLUID_TRANSFER = FluidHooks2.BUCKET / 4;
	@ConfigEntry(id = FUEL_LOADER_ID + "_working_range", type = EntryType.INTEGER, translation = FUEL_LOADER_PREFIX + "_working_range")
	@Comment(value = "Blocks from Fuel Loader to each direction", translation = FUEL_LOADER_PREFIX + "_working_range.comment")
	public static int FUEL_LOADER_WORKING_RANGE = 2;

	public static final String AUTOMATION_NASA_WORKBENCH_ID = "automation_nasa_workbench";
	public static final String AUTOMATION_NASA_WORKBENCH_PREFIX = PREFIX + "." + AUTOMATION_NASA_WORKBENCH_ID;
	@ConfigSeparator(translation = AUTOMATION_NASA_WORKBENCH_PREFIX)
	@ConfigEntry(id = AUTOMATION_NASA_WORKBENCH_ID + "_energy_capacity", type = EntryType.LONG, translation = AUTOMATION_NASA_WORKBENCH_PREFIX + "_energy_capacity")
	public static long AUTOMATION_NASA_WORKBENCH_ENERGY_CAPACITY = 9600L;
	@ConfigEntry(id = AUTOMATION_NASA_WORKBENCH_ID + "_energy_usage", type = EntryType.LONG, translation = AUTOMATION_NASA_WORKBENCH_PREFIX + "_energy_usage")
	public static long AUTOMATION_NASA_WORKBENCH_ENERGY_USAGE = 24L;
	@ConfigEntry(id = AUTOMATION_NASA_WORKBENCH_ID + "_cook_time", type = EntryType.INTEGER, translation = AUTOMATION_NASA_WORKBENCH_PREFIX + "_cook_time")
	public static int AUTOMATION_NASA_WORKBENCH_COOK_TIME = 200;

	public static final String GRAVITY_NORMALIZER_ID = "gravity_normalizer";
	public static final String GRAVITY_NORMALIZER_PREFIX = PREFIX + "." + GRAVITY_NORMALIZER_ID;
	@ConfigSeparator(translation = GRAVITY_NORMALIZER_PREFIX)
	@ConfigEntry(id = GRAVITY_NORMALIZER_ID + "_energy_capacity", type = EntryType.LONG, translation = GRAVITY_NORMALIZER_PREFIX + "_energy_capacity")
	public static long GRAVITY_NORMALIZER_ENERGY_CAPACITY = 9600L;
	@ConfigEntry(id = GRAVITY_NORMALIZER_ID + "_energy_per_blocks", type = EntryType.DOUBLE, translation = GRAVITY_NORMALIZER_PREFIX + "_energy_per_blocks")
	@Comment(value = "Blocks = x * y * z", translation = GRAVITY_NORMALIZER_PREFIX + "_energy_per_blocks.comment")
	public static double GRAVITY_NORMALIZER_ENERGY_PER_BLOCKS = 0.5D;
	@ConfigEntry(id = GRAVITY_NORMALIZER_ID + "_max_length", type = EntryType.INTEGER, translation = GRAVITY_NORMALIZER_PREFIX + "_max_length")
	public static int GRAVITY_NORMALIZER_MAX_LENGTH = 31;
	@ConfigEntry(id = GRAVITY_NORMALIZER_ID + "_proof_duration", type = EntryType.INTEGER, translation = GRAVITY_NORMALIZER_PREFIX + "_proof_duration")
	public static int GRAVITY_NORMALIZER_PROOF_DURATION = 10;

	public static final String ROCKET_SENSOR_ID = "rocket_sensor";
	public static final String ROCKET_SENSOR_PREFIX = PREFIX + "." + ROCKET_SENSOR_ID;
	@ConfigSeparator(translation = ROCKET_SENSOR_PREFIX)
	@ConfigEntry(id = ROCKET_SENSOR_ID + "_working_range", type = EntryType.INTEGER, translation = ROCKET_SENSOR_PREFIX + "_working_range")
	@Comment(value = "Blocks from Rocket Sensor to each direction", translation = ROCKET_SENSOR_PREFIX + "_working_range.comment")
	public static int ROCKET_SENSOR_WORKING_RANGE = 2;
}
