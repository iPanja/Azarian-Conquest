package com.azarius;

import com.azarius.init.ItemInit;
import com.azarius.proxy.CommonProxy;
import com.azarius.utils.ACEventHandler;
import com.azarius.utils.Reference;
import com.azarius.utils.worlddata.WorldData;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class AzarianConquest
{
	public static final CreativeTabs tabACFood = new CreativeTabs("tabACFood") { 
		@Override public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.glazedDonut);
		}	
	};
	
	public static ACEventHandler handler = new ACEventHandler();
	
    @Instance
	public static AzarianConquest instance = new AzarianConquest();
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
    
	//Data Handling
	WorldData data;
	
    @SuppressWarnings("deprecation") //Yeah I know I just can't be bothered to code it the other way...
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
		
		data = new WorldData();
    }
	@EventHandler
    public void init(FMLInitializationEvent e){
		proxy.init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
    	
    }
}

