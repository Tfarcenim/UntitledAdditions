package tfar.untitledadditions.datagen.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import tfar.untitledadditions.UntitledAdditions;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        blastingRecipes(pWriter);
        smokingRecipes(pWriter);
        stonecuttingRecipes(pWriter);
    }

    protected void blastingRecipes(Consumer<FinishedRecipe> writer) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTags.SMELTS_TO_GLASS), RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS.asItem(), 0.1F, 100)
                .unlockedBy("has_smelts_to_glass", has(ItemTags.SMELTS_TO_GLASS)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"glass"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, Blocks.STONE.asItem(), 0.1F, 100)
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"stone"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.COBBLED_DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, Blocks.DEEPSLATE, 0.1F, 100)
                .unlockedBy("has_cobbled_deepslate", has(Blocks.COBBLED_DEEPSLATE)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"deepslate"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemTags.LOGS_THAT_BURN), RecipeCategory.MISC, Items.CHARCOAL, 0.15F, 100)
                .unlockedBy("has_log", has(ItemTags.LOGS_THAT_BURN)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"charcoal"));
    }

    protected void stonecuttingRecipes(Consumer<FinishedRecipe> writer) {
        stonecutterResultFromBase2(writer, RecipeCategory.BUILDING_BLOCKS, Items.STRING, Blocks.WHITE_WOOL, 4);

        tag_to_multiple_items(ItemTags.OAK_LOGS,Blocks.OAK_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.SPRUCE_LOGS,Blocks.SPRUCE_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.BIRCH_LOGS,Blocks.BIRCH_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.JUNGLE_LOGS,Blocks.JUNGLE_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.ACACIA_LOGS,Blocks.ACACIA_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.DARK_OAK_LOGS,Blocks.DARK_OAK_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.CRIMSON_STEMS,Blocks.CRIMSON_PLANKS,6,writer);
        tag_to_multiple_items(ItemTags.WARPED_STEMS,Blocks.WARPED_PLANKS,6,writer);

        item_to_item(Blocks.OAK_LOG,Blocks.STRIPPED_OAK_LOG,writer);
        item_to_item(Blocks.SPRUCE_LOG,Blocks.STRIPPED_SPRUCE_LOG,writer);
        item_to_item(Blocks.BIRCH_LOG,Blocks.STRIPPED_BIRCH_LOG,writer);
        item_to_item(Blocks.JUNGLE_LOG,Blocks.STRIPPED_JUNGLE_LOG,writer);
        item_to_item(Blocks.ACACIA_LOG,Blocks.STRIPPED_ACACIA_LOG,writer);
        item_to_item(Blocks.DARK_OAK_LOG,Blocks.STRIPPED_DARK_OAK_LOG,writer);
        item_to_item(Blocks.CRIMSON_STEM,Blocks.STRIPPED_CRIMSON_STEM,writer);
        item_to_item(Blocks.WARPED_STEM,Blocks.STRIPPED_WARPED_STEM,writer);

        item_to_item(Blocks.OAK_LOG,Blocks.OAK_WOOD,writer);
        item_to_item(Blocks.SPRUCE_LOG,Blocks.SPRUCE_WOOD,writer);
        item_to_item(Blocks.BIRCH_LOG,Blocks.BIRCH_WOOD,writer);
        item_to_item(Blocks.JUNGLE_LOG,Blocks.JUNGLE_WOOD,writer);
        item_to_item(Blocks.ACACIA_LOG,Blocks.ACACIA_WOOD,writer);
        item_to_item(Blocks.DARK_OAK_LOG,Blocks.DARK_OAK_WOOD,writer);
        item_to_item(Blocks.CRIMSON_STEM,Blocks.CRIMSON_HYPHAE,writer);
        item_to_item(Blocks.WARPED_STEM,Blocks.WARPED_HYPHAE,writer);

        item_to_item(Blocks.STRIPPED_OAK_LOG,Blocks.STRIPPED_OAK_WOOD,writer);
        item_to_item(Blocks.STRIPPED_SPRUCE_LOG,Blocks.STRIPPED_SPRUCE_WOOD,writer);
        item_to_item(Blocks.STRIPPED_BIRCH_LOG,Blocks.STRIPPED_BIRCH_WOOD,writer);
        item_to_item(Blocks.STRIPPED_JUNGLE_LOG,Blocks.STRIPPED_JUNGLE_WOOD,writer);
        item_to_item(Blocks.STRIPPED_ACACIA_LOG,Blocks.STRIPPED_ACACIA_WOOD,writer);
        item_to_item(Blocks.STRIPPED_DARK_OAK_LOG,Blocks.STRIPPED_DARK_OAK_WOOD,writer);
        item_to_item(Blocks.STRIPPED_CRIMSON_STEM,Blocks.STRIPPED_CRIMSON_HYPHAE,writer);
        item_to_item(Blocks.STRIPPED_WARPED_STEM,Blocks.STRIPPED_WARPED_HYPHAE,writer);

        tag_to_multiple_items(ItemTags.PLANKS, Items.STICK,4,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_STAIRS,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_STAIRS,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_STAIRS,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_STAIRS,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_STAIRS,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_STAIRS,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_STAIRS,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_STAIRS,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_BUTTON,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_BUTTON,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_BUTTON,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_BUTTON,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_BUTTON,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_BUTTON,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_BUTTON,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_BUTTON,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_FENCE_GATE,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_FENCE_GATE,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_FENCE_GATE,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_FENCE_GATE,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_FENCE_GATE,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_FENCE_GATE,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_FENCE_GATE,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_FENCE_GATE,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_SIGN,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_SIGN,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_SIGN,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_SIGN,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_SIGN,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_SIGN,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_SIGN,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_SIGN,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_DOOR,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_DOOR,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_DOOR,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_DOOR,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_DOOR,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_DOOR,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_DOOR,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_DOOR,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_TRAPDOOR,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_TRAPDOOR,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_TRAPDOOR,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_TRAPDOOR,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_TRAPDOOR,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_TRAPDOOR,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_TRAPDOOR,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_TRAPDOOR,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_PRESSURE_PLATE,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_PRESSURE_PLATE,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_PRESSURE_PLATE,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_PRESSURE_PLATE,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_PRESSURE_PLATE,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_PRESSURE_PLATE,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_PRESSURE_PLATE,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_PRESSURE_PLATE,writer);

        item_to_item(Blocks.OAK_PLANKS,Blocks.OAK_FENCE,writer);
        item_to_item(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_FENCE,writer);
        item_to_item(Blocks.BIRCH_PLANKS,Blocks.BIRCH_FENCE,writer);
        item_to_item(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_FENCE,writer);
        item_to_item(Blocks.ACACIA_PLANKS,Blocks.ACACIA_FENCE,writer);
        item_to_item(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_FENCE,writer);
        item_to_item(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_FENCE,writer);
        item_to_item(Blocks.WARPED_PLANKS,Blocks.WARPED_FENCE,writer);

        item_to_items(Blocks.OAK_PLANKS,Blocks.OAK_SLAB,2,writer);
        item_to_items(Blocks.SPRUCE_PLANKS,Blocks.SPRUCE_SLAB,2,writer);
        item_to_items(Blocks.BIRCH_PLANKS,Blocks.BIRCH_SLAB,2,writer);
        item_to_items(Blocks.JUNGLE_PLANKS,Blocks.JUNGLE_SLAB,2,writer);
        item_to_items(Blocks.ACACIA_PLANKS,Blocks.ACACIA_SLAB,2,writer);
        item_to_items(Blocks.DARK_OAK_PLANKS,Blocks.DARK_OAK_SLAB,2,writer);
        item_to_items(Blocks.CRIMSON_PLANKS,Blocks.CRIMSON_SLAB,2,writer);
        item_to_items(Blocks.WARPED_PLANKS,Blocks.WARPED_SLAB,2,writer);
    }

    public static void item_to_item(ItemLike input, ItemLike output, Consumer<FinishedRecipe> consumer) {
        item_to_items(input,output,1,consumer);
    }

    public static void tag_to_multiple_items(TagKey<Item> input, ItemLike output, int count, Consumer<FinishedRecipe> consumer) {
        stonecutterResultFromBase1(consumer,RecipeCategory.BUILDING_BLOCKS,output, input,count);
    }

    protected static void stonecutterResultFromBase1(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, TagKey<Item> pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), pCategory, pResult, pResultCount).unlockedBy(pMaterial.location().getPath(), has(pMaterial))
                .save(pFinishedRecipeConsumer, new ResourceLocation(UntitledAdditions.MODID,getConversionRecipeName1(pResult, pMaterial) + "_stonecutting"));
    }

    protected static void stonecutterResultFromBase2(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), pCategory, pResult, pResultCount).unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, new ResourceLocation(UntitledAdditions.MODID,getConversionRecipeName(pResult, pMaterial) + "_stonecutting"));
    }

    protected static String getConversionRecipeName1(ItemLike pResult, TagKey<Item> pIngredient) {
        return getItemName(pResult) + "_from_" + pIngredient.location().getPath();
    }

    public static void item_to_items(ItemLike input, ItemLike output, int count, Consumer<FinishedRecipe> consumer) {
        stonecutterResultFromBase2(consumer,RecipeCategory.BUILDING_BLOCKS,output, input,count);
    }

    protected void smokingRecipes(Consumer<FinishedRecipe> writer) {
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Blocks.CACTUS.asItem()), RecipeCategory.MISC, Items.GREEN_DYE, 1.0F, 100)
                .unlockedBy("has_cactus", has(Blocks.CACTUS)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"green_dye"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER, 1.0F, 100)
                .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH)).save(writer,new ResourceLocation(UntitledAdditions.MODID,"leather"));
    }
}
