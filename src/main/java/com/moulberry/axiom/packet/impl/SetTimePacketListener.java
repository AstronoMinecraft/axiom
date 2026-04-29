package com.moulberry.axiom.packet.impl;

import com.moulberry.axiom.AxiomPaper;
import com.moulberry.axiom.event.AxiomTimeChangeEvent;
import com.moulberry.axiom.integration.plotsquared.PlotSquaredIntegration;
import com.moulberry.axiom.packet.PacketHandler;
import com.moulberry.axiom.restrictions.AxiomPermission;
import io.netty.buffer.Unpooled;
import net.kyori.adventure.text.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.Level;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class SetTimePacketListener implements PacketHandler {

    private final AxiomPaper plugin;
    public SetTimePacketListener(AxiomPaper plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onReceive(Player player, RegistryFriendlyByteBuf friendlyByteBuf) {

    }
}
