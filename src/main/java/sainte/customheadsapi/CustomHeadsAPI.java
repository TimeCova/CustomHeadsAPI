package sainte.customheadsapi;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomHeadsAPI extends JavaPlugin implements Listener {
    public HeadManager headManager;
    @Override
    public void onEnable() {
        headManager = new HeadManager();
    }

}
