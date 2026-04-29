package com.moulberry.axiom.integration;

import com.moulberry.axiom.integration.custom.CustomAxiomIntegration;
import com.moulberry.axiom.integration.custom.CustomAxiomPermissions;
import com.moulberry.axiom.integration.plotsquared.PlotSquaredIntegration;
import com.moulberry.axiom.integration.worldguard.WorldGuardIntegration;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Integration {

    public static boolean canBreakBlock(Player player, Block block) {
        return CustomAxiomIntegration.canBreakBlock(player, block);
    }

    public static boolean canPlaceBlock(Player player, org.bukkit.Location loc) {
        return CustomAxiomIntegration.canPlaceBlock(player, loc);
    }

    public static SectionPermissionChecker checkSection(Player player, World world, int cx, int cy, int cz) {
        SectionPermissionChecker plotSquared = PlotSquaredIntegration.checkSection(player, world, cx, cy, cz);
        if (plotSquared.noneAllowed()) {
            return SectionPermissionChecker.NONE_ALLOWED;
        }

        SectionPermissionChecker worldGuard = WorldGuardIntegration.checkSection(player, world, cx, cy, cz);
        if (worldGuard.noneAllowed()) {
            return SectionPermissionChecker.NONE_ALLOWED;
        }

        return SectionPermissionChecker.combine(plotSquared, worldGuard);
    }

}
