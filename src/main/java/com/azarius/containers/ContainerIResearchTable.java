package com.azarius.containers;


import com.azarius.role.professions.processing.smithing.tileentity.TileEntityIResearchTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerIResearchTable extends Container{
public static final int ONE = 0, TWO = 1, THREE = 2, FOUR = 3, FIVE = 4, SIX = 5, OUTPUT = 6, BOOK = 7;
	
	@SuppressWarnings("unused")
	private TileEntityIResearchTable te;
	
	public ContainerIResearchTable(IInventory playerInv, TileEntityIResearchTable te) {
		this.te = te;
		IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		// Upper 6 slots 																			
		this.addSlotToContainer(new SlotItemHandler(handler, ONE, 30, 27));	//		| 1 | 2 | 3 |
		this.addSlotToContainer(new SlotItemHandler(handler, TWO, 48, 27));	//		| 4 | 5 | 6 |
		this.addSlotToContainer(new SlotItemHandler(handler, THREE, 66, 27));
		this.addSlotToContainer(new SlotItemHandler(handler, FOUR, 30, 45));
		this.addSlotToContainer(new SlotItemHandler(handler, FIVE, 48, 45));
		this.addSlotToContainer(new SlotItemHandler(handler, SIX, 66, 45));
		
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
