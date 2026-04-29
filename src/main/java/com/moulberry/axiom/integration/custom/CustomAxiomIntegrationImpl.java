package com.moulberry.axiom.integration.custom;

import com.moulberry.axiom.event.AxiomCustomIntegrationEvent;import com.moulberry.axiom.event.AxiomCustomIntegrationEvent;
import com.moulberry.axiom.event.AxiomCustomRestrictionsEvent;import com.moulberry.axiom.event.AxiomCustomRestrictionsEvent;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class CustomAxiomIntegrationImpl {

    static boolean canBreakBlock(Player player, Block block) {
        AxiomCustomIntegrationEvent event = new AxiomCustomIntegrationEvent(player, block.getLocation());
        Bukkit.getPluginManager().callEvent(event);
        return !event.isCancelled();
    }

    static boolean canPlaceBlock(Player player, org.bukkit.Location loc) {
        AxiomCustomIntegrationEvent event = new AxiomCustomIntegrationEvent(player, loc);
        Bukkit.getPluginManager().callEvent(event);
        return !event.isCancelled();
    }

    static CustomAxiomPermissions getPermissions(Player player) {
        AxiomCustomRestrictionsEvent event = new AxiomCustomRestrictionsEvent(player);
        Bukkit.getPluginManager().callEvent(event);
        return new CustomAxiomPermissions(event.isCanEdit(), event.getFirstBound(), event.getSecondBound());
    }
}