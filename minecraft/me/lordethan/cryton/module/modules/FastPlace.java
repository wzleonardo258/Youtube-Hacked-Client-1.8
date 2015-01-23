package me.lordethan.cryton.module.modules;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class FastPlace extends Module {
	public FastPlace() {
		super("Fastplace", Keyboard.KEY_PERIOD, Category.PLAYER);
	}

	public void onUpdate() {
		if (this.getState()) {
			Wrapper.mc.rightClickDelayTimer = 0;
		}
	}

	public void onDisable() {
		Wrapper.mc.rightClickDelayTimer = 6;
	}
}
