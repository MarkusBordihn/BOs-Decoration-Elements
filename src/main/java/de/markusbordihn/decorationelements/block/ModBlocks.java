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

package de.markusbordihn.decorationelements.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import de.markusbordihn.decorationelements.Constants;
import de.markusbordihn.decorationelements.Annotations.TemplateEntryPoint;

public class ModBlocks {

  protected ModBlocks() {

  }

  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

  @TemplateEntryPoint("Register Blocks")

  // Panel with single Rod

  // copper
  public static final RegistryObject<Block> OAK_PANEL_WITH_COPPER_ROD =
      BLOCKS
          .register("oak_panel_with_copper_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("acacia_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("dark_oak_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("jungle_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("birch_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("spruce_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("crimson_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_COPPER_ROD =
      BLOCKS.register("warped_panel_with_copper_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  // Gold

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("dark_oak_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> OAK_PANEL_WITH_GOLD_ROD =
      BLOCKS
          .register("oak_panel_with_gold_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("acacia_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("jungle_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("birch_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("spruce_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("crimson_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_GOLD_ROD =
      BLOCKS.register("warped_panel_with_gold_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));


  // Iron

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_IRON_ROD =
      BLOCKS.register("dark_oak_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> OAK_PANEL_WITH_IRON_ROD =
      BLOCKS
          .register("oak_panel_with_iron_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_IRON_ROD =
      BLOCKS.register("acacia_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_IRON_ROD =
      BLOCKS.register("jungle_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_IRON_ROD =
      BLOCKS.register("birch_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_IRON_ROD =
      BLOCKS.register("spruce_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_IRON_ROD =
      BLOCKS.register("crimson_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_IRON_ROD =
      BLOCKS.register("warped_panel_with_iron_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  // Steel

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("dark_oak_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> OAK_PANEL_WITH_STEEL_ROD =
      BLOCKS
          .register("oak_panel_with_steel_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("acacia_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("jungle_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("birch_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("spruce_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("crimson_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_STEEL_ROD =
      BLOCKS.register("warped_panel_with_steel_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  // Silver

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("dark_oak_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> OAK_PANEL_WITH_SILVER_ROD =
      BLOCKS
          .register("oak_panel_with_silver_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("acacia_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("jungle_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("birch_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("spruce_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("crimson_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_SILVER_ROD =
      BLOCKS.register("warped_panel_with_silver_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  // Netherite

  public static final RegistryObject<Block> DARK_OAK_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("dark_oak_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> OAK_PANEL_WITH_NETHERITE_ROD =
      BLOCKS
          .register("oak_panel_with_netherite_rod",
              () -> new PanelWithSingleRod(BlockBehaviour.Properties
                  .of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
                  .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("acacia_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> JUNGLE_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("jungle_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> BIRCH_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("birch_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> SPRUCE_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("spruce_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> CRIMSON_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("crimson_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));

  public static final RegistryObject<Block> WARPED_PANEL_WITH_NETHERITE_ROD =
      BLOCKS.register("warped_panel_with_netherite_rod",
          () -> new PanelWithSingleRod(BlockBehaviour.Properties
              .of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(1.5F, 3.0F)
              .sound(SoundType.WOOD)));
  // Item

  public static final RegistryObject<Block> CUP_TERRACOTTA = BLOCKS.register("cup_terracotta",
      () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED)));

  // Concrete Block

  public static final RegistryObject<Block> CLAY_WITH_YELLOW = BLOCKS.register("clay_with_yellow",
      () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
          .strength(3.0F, 6.0F).sound(SoundType.METAL)));
}
