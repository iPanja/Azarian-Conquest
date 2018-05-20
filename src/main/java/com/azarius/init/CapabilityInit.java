package com.azarius.init;

import com.azarius.api.profession.Profession;
import com.azarius.init.capabilities.IProfession;
import com.azarius.utils.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityInit {
	@CapabilityInject(IProfession.class)
	public static Capability<IProfession> CAPABILITY_PROFESSION = null;
	
	@SuppressWarnings("deprecation")
	public static void registerCapabilites() {
		System.out.println("Capabilities Initiated!");
		CapabilityManager.INSTANCE.register(IProfession.class, new CapabilityProfession(), Profession.class);
		//FMLCommonHandler.instance().bus().register(new CapabilityInit());
		MinecraftForge.EVENT_BUS.register(new CapabilityInit());
	}

	 
    // Allows the provider to be attatched to a target entity.
    @SubscribeEvent
    public void attachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        
        if (event.getObject() instanceof EntityPlayer)
            event.addCapability(new ResourceLocation(Reference.MODID, Reference.NAME), new Provider());
    }
    
    // Allows for the capability to persist after death.
    @SubscribeEvent
    public void clonePlayer(PlayerEvent.Clone event) {
        
        final IProfession original = getHandler(event.getOriginal());
        final IProfession clone = getHandler(event.getEntity());
        clone.setXP(original.getXP("WV"), "WV");
        clone.setXP(original.getXP("CL"), "CL");
        clone.setXP(original.getXP("BS"), "BS");
        clone.setXP(original.getXP("AS"), "AS");
        clone.setXP(original.getXP("LH"), "LH");
        clone.setXP(original.getXP("CA"), "CA");
    }
    
    // Simple wrapper to get the handler from an entity. 
    public static IProfession getHandler(Entity entity) {

        if (entity.hasCapability(CAPABILITY_PROFESSION, EnumFacing.DOWN))
            return entity.getCapability(CAPABILITY_PROFESSION, EnumFacing.DOWN);
        
        return null;
    }

	public static class CapabilityProfession implements IStorage<IProfession> {

	@Override
	public NBTBase writeNBT(Capability<IProfession> capability, IProfession instance, EnumFacing side) {
		final NBTTagCompound tag = new NBTTagCompound();           
        tag.setInteger("WVexp", instance.getXP("WV"));   
        tag.setInteger("CLexp", instance.getXP("CL"));
        tag.setInteger("BSexp", instance.getXP("BS"));
        tag.setInteger("ASexp", instance.getXP("AS"));
        tag.setInteger("LHexp", instance.getXP("LH"));
        tag.setInteger("CAexp", instance.getXP("CA"));
        return tag;
	}

	@Override
	public void readNBT(Capability<IProfession> capability, IProfession instance, EnumFacing side, NBTBase nbt) {
		final NBTTagCompound tag = (NBTTagCompound) nbt;
        instance.setXP(tag.getInteger("WVexp"), "WV");
        instance.setXP(tag.getInteger("CLexp"), "CL");
        instance.setXP(tag.getInteger("BSexp"), "BS");
        instance.setXP(tag.getInteger("ASexp"), "AS");
        instance.setXP(tag.getInteger("LHexp"), "LH");
        instance.setXP(tag.getInteger("CAexp"), "CA");
	}
	}
	
public static class Provider implements ICapabilitySerializable<NBTTagCompound> {
        
        IProfession instance = CAPABILITY_PROFESSION.getDefaultInstance();

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
            
            return capability == CAPABILITY_PROFESSION;
        }

        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
            
            return hasCapability(capability, facing) ? CAPABILITY_PROFESSION.<T>cast(instance) : null;
        }

        @Override
        public NBTTagCompound serializeNBT() {
            
            return (NBTTagCompound) CAPABILITY_PROFESSION.getStorage().writeNBT(CAPABILITY_PROFESSION, instance, null);
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt) {
            
            CAPABILITY_PROFESSION.getStorage().readNBT(CAPABILITY_PROFESSION, instance, null, nbt);
        }
    }
  
}
