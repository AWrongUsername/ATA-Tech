package nl.naimv.atatech.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.rmi.registry.Registry;
import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ILMENITE_ORE_PLACED = PlacedFeatures.register("ilmenite_ore_placed",
            ModConfiguredFeatures.ILMENITE_ORE,modifiersWithCount(7,HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80),YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> BAUXITE_PLACED = PlacedFeatures.register("bauxite_placed",
            ModConfiguredFeatures.BAUXITE,modifiersWithCount(1,HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80),YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> BAUXITE_ORE_PLACED = PlacedFeatures.register("bauxite_ore_placed",
            ModConfiguredFeatures.BAUXITE_ORE,modifiersWithCount(100,HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80),YOffset.fixed(80))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
