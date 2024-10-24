package proclient.module.misc;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionEffect;

public class Invinisibilyasd extends Module {
  public Invinisibilyasd () {
    super("Invinisibilyasd ", KeyboardConstants.I, Category.MISC);
  }
  
  public void onEnable() {
    Minecraft.getMinecraft().thePlayer.addPotionEffect(new PotionEffect(21, 999999999, 999));
  }
  
  public void onDisable() {
    Minecraft.getMinecraft().thePlayer.removePotionEffect(21);
  }
}
