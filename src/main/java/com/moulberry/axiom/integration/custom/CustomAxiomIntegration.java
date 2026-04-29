package com.moulberry.axiom.integration.custom;

import net.minecraft.core.BlockPos;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Set;

public class CustomAxiomIntegration {

    public record BoundingBox(BlockPos min, BlockPos max) {
    }

    public record RegionBounds(Set<BoundingBox> boxes, String worldName) {
    }

    public static boolean canBreakBlock(Player player, Block block) {
        return CustomAxiomIntegrationImpl.canBreakBlock(player, block);
    }

    public static boolean canPlaceBlock(Player player, org.bukkit.Location loc) {
        return CustomAxiomIntegrationImpl.canPlaceBlock(player, loc);
    }

    public static CustomAxiomPermissions getPermissions(Player player) {
        return CustomAxiomIntegrationImpl.getPermissions(player);
    }
    public static boolean canEdit(Player player) {
        return CustomAxiomIntegrationImpl.getPermissions(player).canEdit();
    }
}