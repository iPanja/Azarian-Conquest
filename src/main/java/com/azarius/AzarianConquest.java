package com.azarius;

import com.azarius.init.ItemInit;
import com.azarius.proxy.CommonProxy;
import com.azarius.utils.ACEventHandler;
import com.azarius.utils.Reference;
import com.azarius.utils.parser.PlayerInfo;
import com.azarius.utils.worlddata.DataHandler;
import com.azarius.utils.worlddata.WorldData;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.collection.concurrent.Debug;
//TEST
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
	DataHandler dataHandler;
	
    @SuppressWarnings("deprecation") //Yeah I know I just can't be bothered to code it the other way...
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
		
		//Load World Configuration
		WorldData data = new WorldData();
		data = data.getInstance(Minecraft.getMinecraft().world);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("Yeet", 2);
		data.writeToNBT(nbt);
		
    }
	@EventHandler
    public void init(FMLInitializationEvent e){
		proxy.init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
    }
    
    @SubscribeEvent
    public void 
}
