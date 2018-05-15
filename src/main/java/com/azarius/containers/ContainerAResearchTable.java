package com.azarius.containers;


import com.azarius.init.tileentity.TileEntityAResearchTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerAResearchTable extends Container{
public static final int ONE = 0, TWO = 1, THREE = 2, FOUR = 3, FIVE = 4, SIX = 5, SEVEN = 6, EIGHT = 8, OUTPUT = 9, BOOK = 10;
	
	@SuppressWarnings("unused")
	private TileEntityAResearchTable te;
	
	public ContainerAResearchTable(IInventory playerInv, TileEntityAResearchTable te) {
		this.te = te;
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		// Upper 6 slots
		this.addSlotToContainer(new SlotItemHandler(handler, ONE, 12, 27));	//		| 1 | 2 | 3 | 4 |
		this.addSlotToContainer(new SlotItemHandler(handler, TWO, 30, 27));//		| 5 | 6 | 7 | 8 |
		this.addSlotToContainer(new SlotItemHandler(handler, THREE, 48, 27));
		this.addSlotToContainer(new SlotItemHandler(handler, FOUR, 66, 27));
		this.addSlotToContainer(new SlotItemHandler(handler, FIVE, 12, 45));
		this.addSlotToContainer(new SlotItemHandler(handler, SIX, 30, 45));
		this.addSlotToContainer(new SlotItemHandler(handler, SEVEN, 48, 45));
		this.addSlotToContainer(new SlotItemHandler(handler, EIGHT, 66, 45));
		
		this.addSlotToContainer(new SlotItemHandler(handler, OUTPUT, 124, 36));
		this.addSlotToContainer(new SlotItemHandler(handler, BOOK, 152, 63));
		
		
		//PLAYER INVENTORY
		int xPos = 7;
		int yPos = 83;
				
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos+1 + x * 18, yPos+2 + y * 18));
			}
		}
				
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, xPos+1 + x * 18, yPos+2 + 58));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		// TODO Auto-generated method stub
		return !player.isSpectator();
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = inventorySlots.get(index);
	
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
	
			int containerSlots = inventorySlots.size() - player.inventory.mainInventory.size();
				if (index < containerSlots) {
					if (!this.mergeItemStack(itemstack1, containerSlots, inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else if (!this.mergeItemStack(itemstack1, 0, containerSlots, false)) {
					return ItemStack.EMPTY;
				}
		
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
		
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
		
				slot.onTake(player, itemstack1);
			}
	
		return itemstack;
	}

}
