package elemental_constructs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import elemental_constructs.blocks.blockobsidianbrick;
import elemental_constructs.blocks.blockrefinedobsidianblock;
import elemental_constructs.config.ConfigHandler;
import elemental_constructs.items.ItemInfo;
import elemental_constructs.items.ItemObsidianAxe;
import elemental_constructs.items.ItemObsidianHoe;
import elemental_constructs.items.ItemObsidianPickaxe;
import elemental_constructs.items.ItemObsidianShovel;
import elemental_constructs.items.ItemObsidianSword;
import elemental_constructs.items.Items;
import elemental_constructs.proxies.CommonProxy;
import elemental_constructs.network.PacketHandler;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {"suspiciousmuffec"}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Elemental_constructs_core 

{
	@Instance("Suspicious Muffin Elemental Constructs")
	public static Elemental_constructs_core instance;
	
	@SidedProxy(clientSide = "elemental_constructs.proxies.ClientProxy", serverSide = "elemental_constructs.proxies.CommonProxy")
	public static CommonProxy proxy;
	
		//EnumToolMaterial
	public static EnumToolMaterial toolRefinedObsidian = EnumHelper.addToolMaterial("REFINEDOBSIDIAN", 2, 10000, 7.0F, 2.0F, 50);
	
	//Registration
	public static Block RefinedObsidianBlock = new blockrefinedobsidianblock(501, Material.rock).setUnlocalizedName("Refined Obsidian Block");
	
	public static Block ObsidianBrick =  new blockobsidianbrick(502, Material.iron).setUnlocalizedName("Obsidian Brick");
	
	public static Item ObsidianSword = new ItemObsidianSword(5003, toolRefinedObsidian).setUnlocalizedName("Obsidian Sword");
	
	public static Item ObsidianAxe = new ItemObsidianAxe(5004, toolRefinedObsidian).setUnlocalizedName("Obsidian Axe");
	
	public static Item ObsidianPickaxe = new ItemObsidianPickaxe(5005, toolRefinedObsidian).setUnlocalizedName("Obsidian Pickaxe");
	
	public static Item ObsidianShovel = new ItemObsidianShovel(5006, toolRefinedObsidian).setUnlocalizedName("Obsidian Shovel");
	
	public static Item ObsidianHoe = new ItemObsidianHoe(5007, toolRefinedObsidian).setUnlocalizedName ("Obsidian Hoe");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		
		proxy.initSounds();
		proxy.initRenderers();
		
		Items.registerNames(); 
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)	
	{
		
		Items.registerRecipes();
		
		GameRegistry.registerBlock(RefinedObsidianBlock, ModInformation.ID + RefinedObsidianBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ObsidianBrick, ModInformation.ID + ObsidianBrick.getUnlocalizedName().substring(5));

		LanguageRegistry.addName(ObsidianSword, "Obsidian Sword");
		LanguageRegistry.addName(ObsidianAxe, "Obsidian Axe");
		LanguageRegistry.addName(ObsidianPickaxe, "Obsidian Pickaxe");
		LanguageRegistry.addName(ObsidianHoe, "Obsidian Hoe");
		LanguageRegistry.addName(ObsidianShovel,"Obsidian Shovel");	
		LanguageRegistry.addName(RefinedObsidianBlock, "Refined Obsidian Block");
		LanguageRegistry.addName(ObsidianBrick, "Obsidian Brick");
		
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
