package tfar.untitledadditions.mixin;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.TridentImpalerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TridentImpalerEnchantment.class)
public class ImpalingEnchantMixin {

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public float getDamageBonus(int pLevel, MobType pCreatureType) {
		return pLevel * 2.5F;
	}
}
