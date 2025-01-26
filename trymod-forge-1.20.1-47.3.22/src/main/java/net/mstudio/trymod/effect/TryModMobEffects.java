package net.mstudio.trymod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mstudio.trymod.TryMod;

public class TryModMobEffects {
    public static final DeferredRegister<MobEffect> EFFECTS=DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TryMod.MODID);
    public static final RegistryObject<MobEffect> BlackEffect= EFFECTS.register("black_effect",() -> new TryModMobEffectTypes.EmptyEffect(MobEffectCategory.NEUTRAL,0x000000));
    public static final RegistryObject<MobEffect> WhiteEffect= EFFECTS.register("white_effect",() -> new TryModMobEffectTypes.EmptyEffect(MobEffectCategory.NEUTRAL,0xffffff));
    public static final RegistryObject<MobEffect> TAMEffect= EFFECTS.register("tam_effect",() -> new TryModMobEffectTypes.EmptyEffect(MobEffectCategory.NEUTRAL,0x808080));
    public static void registerMobEffects(IEventBus eventBus)
    {
        EFFECTS.register(eventBus);
    }
}
