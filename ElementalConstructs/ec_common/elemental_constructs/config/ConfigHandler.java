package elemental_constructs.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import elemental_constructs.items.ItemInfo;

public class ConfigHandler 
{
	public static void init (File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.REFINED_OBSIDIAN_INGOT_ID = config.getItem(ItemInfo.REFINED_OBSIDIAN_INGOT_KEY, ItemInfo.REFINED_OBSIDIAN_INGOT_DEFAULT).getInt() -256;
		ItemInfo.STONE_ROD_ID = config.getItem(ItemInfo.STONE_ROD_KEY, ItemInfo.STONE_ROD_DEFAULT).getInt() -256;
		
		config.save();
		
	}
}
