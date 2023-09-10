package me.TaikiFnit.SpigotPlugin1;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FnitEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final String playerName;

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public FnitEvent(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public String getPlayerName() {
        return this.playerName;
    }
}
