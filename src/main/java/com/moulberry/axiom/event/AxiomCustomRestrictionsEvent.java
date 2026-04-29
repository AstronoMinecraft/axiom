package com.moulberry.axiom.event;

import net.minecraft.core.BlockPos;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AxiomCustomRestrictionsEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private boolean canEdit = false;
    private BlockPos firstBound = BlockPos.ZERO;
    private BlockPos secondBound = BlockPos.ZERO;


    public AxiomCustomRestrictionsEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public BlockPos getFirstBound() {
        return firstBound;
    }

    public void setFirstBound(BlockPos firstBound) {
        this.firstBound = firstBound;
    }

    public BlockPos getSecondBound() {
        return secondBound;
    }

    public void setSecondBound(BlockPos secondBound) {
        this.secondBound = secondBound;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}