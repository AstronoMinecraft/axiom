package com.moulberry.axiom.integration.custom;

import net.minecraft.core.BlockPos;

public record CustomAxiomPermissions(boolean canEdit, BlockPos firstBound, BlockPos secondBound) {
}