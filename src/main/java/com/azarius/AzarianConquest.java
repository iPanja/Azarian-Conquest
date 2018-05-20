package com.azarius;

import com.azarius.command.CommandDirt;
import com.azarius.command.CommandGetLevel;
import com.azarius.command.CommandGetMana;
import com.azarius.command.CommandGetXP;
import com.azarius.command.CommandSetMana;
import com.azarius.command.CommandSetXP;
import com.azarius.init.CapabilityInit;
import com.azarius.init.ItemInit;
import com.azarius.proxy.CommonProxy;
import com.azarius.utils.ACEventHandler;
import com.azarius.utils.Reference;
import com.azarius.utils.data.ACProfessions;
import com.azarius.utils.experimental.TestCapabilities;

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
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
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
	
    @SuppressWarnings("deprecation") //Yeah I know I just can't be bothered to code it the other way...
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	TestCapabilities.registerCapabilities();
    	CapabilityInit.registerCapabilites();
    	ACProfessions.register();
    	
    	FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
    }
	@EventHandler
    public void init(FMLInitializationEvent e){
		proxy.init();
    }
	
	@EventHandler
	public void onStartUp(FMLServerStartingEvent e) {
		e.registerServerCommand(new CommandDirt());
		e.registerServerCommand(new CommandSetXP());
		e.registerServerCommand(new CommandGetXP());
		e.registerServerCommand(new CommandSetMana());
		e.registerServerCommand(new CommandGetMana());
		e.registerServerCommand(new CommandGetLevel());
	}
	
    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
    	
    }
    
}

