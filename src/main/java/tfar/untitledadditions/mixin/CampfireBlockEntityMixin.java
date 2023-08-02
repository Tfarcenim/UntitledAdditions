package tfar.untitledadditions.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BeaconBlockEntity;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.checkerframework.checker.units.qual.A;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CampfireBlockEntity.class)
public class CampfireBlockEntityMixin {
    @Inject(method = "cookTick",at = @At("HEAD"))
    private static void onCookTick(Level pLevel, BlockPos pPos, BlockState pState, CampfireBlockEntity pBlockEntity, CallbackInfo ci) {
        BeaconBlockEntity.applyEffects(pLevel,pPos, 1,MobEffects.REGENERATION,null);
    }
}
