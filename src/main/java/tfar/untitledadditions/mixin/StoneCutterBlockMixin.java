package tfar.untitledadditions.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StonecutterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(StonecutterBlock.class)
public class StoneCutterBlockMixin extends Block {

    public StoneCutterBlockMixin(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pEntity instanceof LivingEntity) {
            pEntity.makeStuckInBlock(pState, new Vec3(0.8F, 0.75D, 0.8F));
            pEntity.hurt(pLevel.damageSources().thorns(null), 1.0F);
        }
    }
}
