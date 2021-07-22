package me.FatihUlu.client;

import me.FatihUlu.client.event.EventManager;
import me.FatihUlu.client.event.EventTarget;
import me.FatihUlu.client.event.impl.ClientTickEvent;
import net.minecraft.client.Minecraft;

public class Client {

	private static final Client INSTANCE = new Client();
	
	public static final Client getInstance() { 
		return INSTANCE; 
	}
	
	public void init() {
		System.out.println("Initialising client...");
		System.out.println("Registering events...");
		EventManager.register(this);
	}
	
	public void start() {
		
	}
	
	@EventTarget
	public void onTick(ClientTickEvent e) {
		Minecraft mc = Minecraft.getMinecraft();
		if (mc.gameSettings.TestGuiKey.isPressed()) {
			if (!(mc.currentScreen instanceof TestGui))
				mc.displayGuiScreen(new TestGui());
			}
		}
	}
	
}
