package elemental_constructs.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elemental_constructs.ModInformation;
import elemental_constructs.items.ItemInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockrefinedobsidianblock extends Block
{

	public blockrefinedobsidianblock(int id, Material material) 
	{
		super(id, material);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		blockIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.REFINED_OBSIDIAN_BLOCK_ICON);
		
	}

}
