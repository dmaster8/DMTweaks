package com.dmaster.dmtweaks.Blocks;

import com.dmaster.dmtweaks.Main;
import com.dmaster.dmtweaks.Tab;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ccWolf extends Block
{

@SideOnly(Side.CLIENT)
private IIcon field_150116_a;
@SideOnly(Side.CLIENT)
private IIcon field_150115_b;

        public ccWolf(){
            super(Material.cloth);
            setCreativeTab(Tab.tabDMTweaks);
            setBlockName("ccWolf");
            setBlockTextureName(Main.MODID + ":/ccWolf");
            setHardness(1);
            setStepSound(soundTypeCloth);
        }

    @SideOnly(Side.CLIENT)
public IIcon getIcon(int p_149691_1_, int p_149691_2_)
        {
        return p_149691_1_ == 0 ? this.field_150115_b : (p_149691_1_ == 1 ? this.field_150116_a : this.blockIcon);
        }

        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister p_149651_1_)
        {
            this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
            this.field_150116_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
            this.field_150115_b = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
        }


    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
        TileEntity tile = par1World.getTileEntity(par2, par3, par4);
        par1World.spawnParticle("heart", par2 + minX + Math.random() * (maxX - minX), par3 + maxY, par4 + minZ + Math.random() * (maxZ - minZ), 0, 0, 0);
        par1World.playSound(par2 + 0.5F, par3 + 0.5F, par4 + 0.5F, "mob.wolf.bark", 1.0F, 0.7F + 0.3F, false);
        return true;
    }
}
