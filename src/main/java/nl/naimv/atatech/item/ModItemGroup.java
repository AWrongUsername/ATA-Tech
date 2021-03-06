package nl.naimv.atatech.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import nl.naimv.atatech.ATATech;
import nl.naimv.atatech.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup ATATECH = FabricItemGroupBuilder.build(new Identifier(ATATech.MOD_ID, "atatech"),
            () -> new ItemStack(ModBlocks.WORMHOLE_FRAME));
}
