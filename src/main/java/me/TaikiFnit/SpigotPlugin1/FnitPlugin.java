package me.TaikiFnit.SpigotPlugin1;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FnitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("久しぶりのSpigot Plugin Development!");
        this.getCommand("fnit").setExecutor(new CommandKit());

        getServer().getPluginManager().registerEvents(new FnitListener(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("また遊びに来てね！");
    }
}