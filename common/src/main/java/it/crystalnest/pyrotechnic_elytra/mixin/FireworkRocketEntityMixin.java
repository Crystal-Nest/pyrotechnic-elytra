package it.crystalnest.pyrotechnic_elytra.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Injects into {@link FireworkRocketEntity} to prevent firework boost damage when flying.
 */
@Mixin(FireworkRocketEntity.class)
public abstract class FireworkRocketEntityMixin {
  /**
   * Redirects the call to {@link LivingEntity#hurt(DamageSource, float)} in the method {@link FireworkRocketEntity#dealExplosionDamage()}.<br />
   * Prevents firework damage when boosting one's flight.
   *
   * @param instance entity owning the redirected method.
   * @param source damage source.
   * @param amount damage amount.
   * @return {@code false} as no damage is being dealt.
   */
  @Redirect(method = "dealExplosionDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", ordinal = 0))
  private boolean redirectHurt(LivingEntity instance, DamageSource source, float amount) {
    return false;
  }
}
