package me.TaikiFnit.SpigotPlugin1;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FnitListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("世界の声「にゃーん」");
        FnitEvent fnitEvent = new FnitEvent(event.getPlayer().getName());
        Bukkit.getPluginManager().callEvent(fnitEvent);
        event.getPlayer().sendMessage(fnitEvent.getPlayerName());
    }

    @EventHandler
    public void onFnitEvent(FnitEvent event) {
        Bukkit.getLogger().info("My original event was called.");
    }
}
