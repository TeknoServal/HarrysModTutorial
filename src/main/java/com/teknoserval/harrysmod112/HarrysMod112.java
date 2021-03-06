package com.teknoserval.harrysmod112;

import com.teknoserval.harrysmod112.proxy.CommonProxy;
import com.teknoserval.harrysmod112.tabs.TutorialTab;
import com.teknoserval.harrysmod112.util.Reference;
import com.teknoserval.harrysmod112.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class HarrysMod112 {
	
	@Instance
	public static HarrysMod112 instance;
	
	public static final CreativeTabs TUTORIAL = new TutorialTab("tutorialtab");
	
	@SidedProxy(clientSide = Reference.CLIENT)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		RegistryHandler.preInitRegistries();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		RegistryHandler.initRegistries();
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
