package me.lordethan.cryton.module.modules;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class FullBright extends Module {

	public FullBright() {
		super("FullBright", Keyboard.KEY_V, Category.WORLD);
	}

	public void onUpdate() {
		if (this.getState()) {
			Wrapper.mc.gameSettings.gammaSetting = 10f;
		} else {
			Wrapper.mc.gameSettings.gammaSetting = 1f;
		}
	}

}
