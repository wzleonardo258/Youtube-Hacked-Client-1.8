package me.lordethan.cryton.module.modules;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class Sprint extends Module {

	public Sprint() {
		super("Sprint", Keyboard.KEY_R, Category.PLAYER);
	}

	public void onUpdate() {
		if (!this.getState()) {
			return;
		}
		if (!(Wrapper.mc.thePlayer.isCollidedHorizontally) && Wrapper.mc.thePlayer.moveForward > 0.0f) {
			Wrapper.mc.thePlayer.setSprinting(true);
		} else {
			Wrapper.mc.thePlayer.setSprinting(false);
		}
	}

}
