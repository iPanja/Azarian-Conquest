package com.azarius.utils.bases;

import com.azarius.AzarianConquest;
import com.azarius.init.BlockInit;
import com.azarius.init.ItemInit;
import com.azarius.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String unloc, String registry, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(unloc);
		setRegistryName("ac", registry);
		setHardness(5.0f);
		setResistance(20.0f);

		BlockInit.BLOCKS.add(this);
	    ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String unloc, String registry, Material materialIn, float hard, float resist) {
		super(materialIn);
		setUnlocalizedName(unloc);
		setRegistryName(registry);
		setHardness(hard);
		setResistance(resist);
		
		BlockInit.BLOCKS.add(this);
	    ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		AzarianConquest.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
