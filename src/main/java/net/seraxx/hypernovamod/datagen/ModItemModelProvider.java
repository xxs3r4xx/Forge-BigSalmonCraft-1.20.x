package net.seraxx.hypernovamod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HypernovaMod.MOD_ID, existingFileHelper);

    }



    @Override
    protected void registerModels() {
        withExistingParent(ModItems.ALIEN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
