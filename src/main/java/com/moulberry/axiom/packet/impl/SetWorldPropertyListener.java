package com.moulberry.axiom.packet.impl;

import com.moulberry.axiom.AxiomPaper;
import com.moulberry.axiom.VersionHelper;
import com.moulberry.axiom.integration.plotsquared.PlotSquaredIntegration;
import com.moulberry.axiom.packet.PacketHandler;
import com.moulberry.axiom.restrictions.AxiomPermission;
import com.moulberry.axiom.world_properties.server.ServerWorldPropertiesRegistry;
import com.moulberry.axiom.world_properties.server.ServerWorldPropertyHolder;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import net.kyori.adventure.text.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.resources.Identifier;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class SetWorldPropertyListener implements PacketHandler {

    private final AxiomPaper plugin;
    public SetWorldPropertyListener(AxiomPaper plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onReceive(Player player, RegistryFriendlyByteBuf friendlyByteBuf) {

    }
}
