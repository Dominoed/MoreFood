package net.minecraft.src;

import java.util.Random;

public class BlockBlueberryBush extends Block
{
    protected boolean graphicsLevel;
    public static final String[][] dfield_94396_b = new String[][] {{"blueberryBush"}, {"blueberryBush_opaque"}};
    private int dfield_94394_cP;
    protected BlockBlueberryBush(int par1)
    {
        super(par1, Material.leaves);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    Random dbbr = new Random();
    public int quantityDropped(Random par1Random)
    {
      return dbbr.nextInt(5);
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.blueberry.itemID;
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockId(par2, par3, par4);
        return (var5 == 0 || Block.blocksList[var5].blockMaterial.isReplaceable()) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
}
