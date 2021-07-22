package me.FatihUlu.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class TestGui extends GuiScreen {

	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		Minecraft mc = Minecraft.getMinecraft();
		ScaledResolution sr = new ScaledResolution(mc);
        int i = (this.width - 248) / 2;
        int j = (this.height - sr.getScaledHeight() / 2) / 2;
		this.drawRect(i, j, i+248, j+166, 0xFF262626);
		
		this.drawCenteredString(mc.fontRendererObj, "Bu client FatihUlu tarafýndan,", this.width / 2, this.height / 2 - 25, -1);
		this.drawCenteredString(mc.fontRendererObj, "Lanc Craft için yapýlmýþtýr.", this.width / 2, this.height / 2 - 10, -1);
	
		mc.getTextureManager().bindTexture(new ResourceLocation("textures/lanccraft/logo.png"));
        int w = 160;
		int h = 35;
		int fw = 160;
		int fh = 35;
		float u = 0;
		float v = 0;
		this.drawModalRectWithCustomSizedTexture(this.width / 2 - 80, this.height / 2 + 25, u, v, w, h, fw, fh);
	}
	
}
