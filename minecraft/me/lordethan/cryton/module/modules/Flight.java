package me.lordethan.cryton.module.modules;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class Flight extends Module{

	public Flight() {
		super("Flight", Keyboard.KEY_F, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(!this.getState()){
			return;
		}
		Wrapper.mc.thePlayer.capabilities.isFlying = true;
	}
	
	public void onDisable(){
		Wrapper.mc.thePlayer.capabilities.isFlying = false;
	}

}
