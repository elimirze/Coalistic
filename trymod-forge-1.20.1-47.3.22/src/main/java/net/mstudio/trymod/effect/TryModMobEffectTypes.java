package net.mstudio.trymod.effect;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;

public class TryModMobEffectTypes {
    public static class EmptyEffect extends MobEffect
    {
        protected EmptyEffect(MobEffectCategory pCategory, int pColor) {
            super(pCategory, pColor);
        }
    }

}
