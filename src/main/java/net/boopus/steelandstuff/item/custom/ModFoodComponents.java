package net.boopus.steelandstuff.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;

public class ModFoodComponents {


    public static final FoodComponent WARPED_STEW = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1), 0.1f)
            .build();

    public static final FoodComponent CRIMSON_STEW = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(5)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1), 1f)
            .build();

}
