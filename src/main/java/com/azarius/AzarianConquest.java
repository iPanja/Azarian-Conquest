package com.azarius;

import com.azarius.proxy.CommonProxy;
import com.azarius.utils.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class AzarianConquest
{
    
    @Instance
	public static AzarianConquest instance = new AzarianConquest();;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	
    }
	@EventHandler
    public void init(FMLInitializationEvent e){
 
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
    }
}
