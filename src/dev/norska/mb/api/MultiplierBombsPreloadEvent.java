package dev.norska.mb.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import dev.norska.mb.items.MultiplierBombItem;

public class MultiplierBombsPreloadEvent extends Event implements Cancellable{

    private final Player player;
    private final MultiplierBombItem multiplierBombItem;
    private boolean isCancelled;

    public MultiplierBombsPreloadEvent(Player player, MultiplierBombItem multiplierBombItem) {
        this.player = player;
        this.multiplierBombItem = multiplierBombItem;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public MultiplierBombItem getMultiplierBombItem() {
        return this.multiplierBombItem;
    }

}
