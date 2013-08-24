package elemental_constructs.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import elemental_constructs.Elemental_constructs_core;


public class Items 
{
	public static Item RefinedObsidianIngot;
	public static Item StoneRod;
	

	
	public static void init()
	{
		RefinedObsidianIngot = new ItemRefinedObsidianIngot(ItemInfo.REFINED_OBSIDIAN_INGOT_ID);
		StoneRod = new ItemStoneRod(ItemInfo.STONE_ROD_ID);
	}
	
	public static void registerNames()
	{
		LanguageRegistry.addName(RefinedObsidianIngot, ItemInfo.REFINED_OBSIDIAN_INGOT_NAME);
		LanguageRegistry.addName(StoneRod, ItemInfo.STONE_ROD_NAME);
	}

	public static void registerRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(Elemental_constructs_core.ObsidianSword, 1), new Object[]{
			"*",
			"*",
			"X",
			'X', StoneRod, '*', RefinedObsidianIngot
			
		});
		
			GameRegistry.addRecipe(new ItemStack(Elemental_constructs_core.ObsidianPickaxe, 1), new Object[]{
				"***",
				" X ",
				" X ",
				'X', StoneRod, '*', RefinedObsidianIngot
			
		});
		
			GameRegistry.addRecipe(new ItemStack(Elemental_constructs_core.ObsidianAxe, 1), new Object[]{
				"**",
				"*X",
				" X",
				'X', StoneRod, '*', RefinedObsidianIngot
		});
		
			GameRegistry.addRecipe(new ItemStack(Elemental_constructs_core.ObsidianShovel, 1), new Object[]{
				"*",
				"X",
				"X",
				'X', StoneRod, '*', RefinedObsidianIngot
		});
		
			GameRegistry.addRecipe(new ItemStack(Elemental_constructs_core.ObsidianHoe, 1), new Object[]{
				"**",
				" X",
				" X",
				'X', StoneRod, '*', RefinedObsidianIngot
		});
		
		
			GameRegistry.addRecipe(new ItemStack(StoneRod, 4), new Object[]{
				"S",
				"S",
				'S', Block.cobblestone
		});
		
			GameRegistry.addRecipe(new ItemStack(StoneRod, 4), new Object[]{
				" X ",
				" X ",
				'X', Block.stone
		});
	
		FurnaceRecipes.smelting().addSmelting(Block.obsidian.blockID, new ItemStack(RefinedObsidianIngot), 0.5F);
	}
	
}