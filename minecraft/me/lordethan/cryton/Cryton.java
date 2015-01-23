package me.lordethan.cryton;

import me.lordethan.cryton.module.ModuleManager;

import org.lwjgl.opengl.Display;

public class Cryton {

	private static String Client_Name = "Cryton";
	private static double Client_Vesion = 1.0;

	public static final Cryton theClient = new Cryton();

	public static ModuleManager moduleManager;

	public static void StartClient() {
		moduleManager = new ModuleManager();
		Display.setTitle(getClient_Name() + " (rel-" + getClient_Vesion() + ")");
	}

	public static String getClient_Name() {
		return Client_Name;
	}

	public static void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}

	public static double getClient_Vesion() {
		return Client_Vesion;
	}

	public static void setClient_Vesion(double client_Vesion) {
		Client_Vesion = client_Vesion;
	}

}
