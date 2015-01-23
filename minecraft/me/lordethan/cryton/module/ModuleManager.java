package me.lordethan.cryton.module;

import java.util.ArrayList;

import me.lordethan.cryton.module.modules.Sprint;

public class ModuleManager {
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	public ModuleManager(){
		this.activeModules.add(new Sprint());
	}

}
