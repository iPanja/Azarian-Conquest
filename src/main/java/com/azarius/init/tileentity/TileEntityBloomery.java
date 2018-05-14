package com.azarius.init.tileentity;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityBloomery extends TileEntity implements ITickable, ICapabilityProvider{
	private ItemStackHandler handler;
	private int cooldown;
	@SuppressWarnings("unused")
	private boolean isRunning;
	
	@SuppressWarnings("unused")
	private boolean hasBloom;
	
	public TileEntityBloomery() {
		this.cooldown = 0;
		this.hasBloom=false;
		this.isRunning=false;
		this.handler = new ItemStackHandler(2);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.cooldown = nbt.getInteger("Cooldown");
		this.deserializeNBT(nbt.getCompoundTag("ItemStackHandler"));
		super.readFromNBT(nbt);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("Cooldown", this.cooldown);
		nbt.setTag("ItemStackHandler", this.handler.serializeNBT());
		return super.writeToNBT(nbt);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		this.cooldown++;
		this.cooldown %= 100;

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return (T) this.handler;
		}
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return true;
		}
		return super.hasCapability(capability, facing);
	}
	
	
	public boolean isUsableByPlayer(EntityPlayer player)
    {
        if (this.world.getTileEntity(this.pos) != this)
        {
            return false;
        }
        else
        {
            return player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
        }
    }
}
