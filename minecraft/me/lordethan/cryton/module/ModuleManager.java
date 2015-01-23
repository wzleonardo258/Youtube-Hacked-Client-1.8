package me.lordethan.cryton.module;

import java.util.ArrayList;

import me.lordethan.cryton.module.modules.*;

public class ModuleManager {
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	public ModuleManager(){
		this.activeModules.add(new Sprint());
		this.activeModules.add(new FullBright());
		this.activeModules.add(new KillAura());
		this.activeModules.add(new Flight());
	}

}
