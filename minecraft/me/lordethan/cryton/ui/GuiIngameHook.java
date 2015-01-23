package me.lordethan.cryton.ui;

import java.awt.Color;

import me.lordethan.cryton.Cryton;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class GuiIngameHook extends GuiIngame{

	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	
	@Override
	public void func_175180_a(float p_175180_1_){
		super.func_175180_a(p_175180_1_);
		
		Wrapper.fr.drawString(Cryton.getClient_Name() + " Version:" + Cryton.getClient_Vesion(), 1, 1, 0xffffffff);
		renderArrayList();
	}
	
	private void renderArrayList(){
		int yCount = 10;
		for(Module m : Cryton.theClient.moduleManager.activeModules){
			m.onRender();
			
			if(m.getState()){
				Wrapper.fr.drawString(m.getName(), 2, yCount, 0x00ff7f);
				yCount ++;
			}
		}
	}
	
	

}
