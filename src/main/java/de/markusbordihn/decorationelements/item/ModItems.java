/**
 * Copyright 2021 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.decorationelements.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DyeColor;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import de.markusbordihn.decorationelements.Constants;
import de.markusbordihn.decorationelements.block.ModBlocks;
import de.markusbordihn.decorationelements.tabs.DecorativeElementsTab;
import de.markusbordihn.decorationelements.Annotations.TemplateEntryPoint;

public class ModItems {

  protected ModItems() {

  }

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  @TemplateEntryPoint("Register Items")

  @TemplateEntryPoint("Register Block Items")

  // Plate with single Rod
  public static final RegistryObject<Item> OAK_PANEL_WITH_COPPER_ROD = ITEMS.register(
      "oak_panel_with_copper_rod", () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_COPPER_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_COPPER_ROD =
      ITEMS.register("acacia_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_COPPER_ROD =
      ITEMS.register("dark_oak_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_COPPER_ROD =
      ITEMS.register("jungle_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_COPPER_ROD =
      ITEMS.register("birch_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_COPPER_ROD =
      ITEMS.register("spruce_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_COPPER_ROD =
      ITEMS.register("crimson_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_COPPER_ROD =
      ITEMS.register("warped_panel_with_copper_rod",
          () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_COPPER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Plate with Gold Rod
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_GOLD_ROD =
      ITEMS.register("dark_oak_panel_with_gold_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_GOLD_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> OAK_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "oak_panel_with_gold_rod", () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "acacia_panel_with_gold_rod", () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "jungle_panel_with_gold_rod", () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "birch_panel_with_gold_rod", () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "spruce_panel_with_gold_rod", () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_GOLD_ROD =
      ITEMS.register("crimson_panel_with_gold_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_GOLD_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_GOLD_ROD = ITEMS.register(
      "warped_panel_with_gold_rod", () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_GOLD_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));


  // Iron
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_IRON_ROD =
      ITEMS.register("dark_oak_panel_with_iron_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_IRON_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> OAK_PANEL_WITH_IRON_ROD = ITEMS.register(
      "oak_panel_with_iron_rod", () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_IRON_ROD = ITEMS.register(
      "acacia_panel_with_iron_rod", () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_IRON_ROD = ITEMS.register(
      "jungle_panel_with_iron_rod", () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_IRON_ROD = ITEMS.register(
      "birch_panel_with_iron_rod", () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_IRON_ROD = ITEMS.register(
      "spruce_panel_with_iron_rod", () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_IRON_ROD =
      ITEMS.register("crimson_panel_with_iron_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_IRON_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_IRON_ROD = ITEMS.register(
      "warped_panel_with_iron_rod", () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_IRON_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Steel
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_STEEL_ROD =
      ITEMS.register("dark_oak_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> OAK_PANEL_WITH_STEEL_ROD = ITEMS.register(
      "oak_panel_with_steel_rod", () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_STEEL_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_STEEL_ROD =
      ITEMS.register("acacia_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_STEEL_ROD =
      ITEMS.register("jungle_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_STEEL_ROD = ITEMS.register(
      "birch_panel_with_steel_rod", () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_STEEL_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_STEEL_ROD =
      ITEMS.register("spruce_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_STEEL_ROD =
      ITEMS.register("crimson_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_STEEL_ROD =
      ITEMS.register("warped_panel_with_steel_rod",
          () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_STEEL_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Silver
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_SILVER_ROD =
      ITEMS.register("dark_oak_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> OAK_PANEL_WITH_SILVER_ROD = ITEMS.register(
      "oak_panel_with_silver_rod", () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_SILVER_ROD.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_SILVER_ROD =
      ITEMS.register("acacia_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_SILVER_ROD =
      ITEMS.register("jungle_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_SILVER_ROD =
      ITEMS.register("birch_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_SILVER_ROD =
      ITEMS.register("spruce_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_SILVER_ROD =
      ITEMS.register("crimson_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_SILVER_ROD =
      ITEMS.register("warped_panel_with_silver_rod",
          () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_SILVER_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Netherite
  public static final RegistryObject<Item> DARK_OAK_PANEL_WITH_netherite_ROD =
      ITEMS.register("dark_oak_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.DARK_OAK_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> OAK_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("oak_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.OAK_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> ACACIA_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("acacia_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.ACACIA_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> JUNGLE_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("jungle_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.JUNGLE_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> BIRCH_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("birch_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.BIRCH_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> SPRUCE_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("spruce_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.SPRUCE_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> CRIMSON_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("crimson_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.CRIMSON_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));
  public static final RegistryObject<Item> WARPED_PANEL_WITH_NETHERITE_ROD =
      ITEMS.register("warped_panel_with_netherite_rod",
          () -> new BlockItem(ModBlocks.WARPED_PANEL_WITH_NETHERITE_ROD.get(),
              new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Terracotta Items
  public static final RegistryObject<Item> CUP_TERRACOTTA =
      ITEMS.register("cup_terracotta", () -> new BlockItem(ModBlocks.CUP_TERRACOTTA.get(),
          new Item.Properties().tab(DecorativeElementsTab.MAIN)));

  // Concrete Block
  public static final RegistryObject<Item> CLAY_WITH_YELLOW =
      ITEMS.register("clay_with_yellow", () -> new BlockItem(ModBlocks.CLAY_WITH_YELLOW.get(),
          new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
