import org.bukkit.plugin.java.JavaPlugin;

public class FnitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("久しぶりのSpigot Plugin Development!");
    }

    @Override
    public void onDisable() {
        getLogger().info("また遊びに来てね！");
    }
};