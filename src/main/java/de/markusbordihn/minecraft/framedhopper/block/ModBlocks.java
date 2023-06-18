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

package de.markusbordihn.minecraft.framedhopper.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import de.markusbordihn.minecraft.framedhopper.Constants;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.AcaciaFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.BirchFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.CrimsonFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.DarkOakFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.JungleFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.OakFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.SpruceFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.WarpedFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.AcaciaFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.BirchFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.CrimsonFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.DarkOakFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.JungleFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.OakFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.SpruceFramedHopperEntity;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.entity.WarpedFramedHopperEntity;

public class ModBlocks {

  protected ModBlocks() {

  }

  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

  public static final DeferredRegister<BlockEntityType<?>> ENTITIES =
      DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Constants.MOD_ID);

  // Wooden framed Hoppers
  public static final RegistryObject<Block> OAK_FRAMED_HOPPER =
      BLOCKS.register(OakFramedHopper.NAME, OakFramedHopper::new);
  public static final RegistryObject<Block> SPRUCE_FRAMED_HOPPER =
      BLOCKS.register(SpruceFramedHopper.NAME, SpruceFramedHopper::new);
  public static final RegistryObject<Block> BIRCH_FRAMED_HOPPER =
      BLOCKS.register(BirchFramedHopper.NAME, BirchFramedHopper::new);
  public static final RegistryObject<Block> JUNGLE_FRAMED_HOPPER =
      BLOCKS.register(JungleFramedHopper.NAME, JungleFramedHopper::new);
  public static final RegistryObject<Block> ACACIA_FRAMED_HOPPER =
      BLOCKS.register(AcaciaFramedHopper.NAME, AcaciaFramedHopper::new);
  public static final RegistryObject<Block> DARK_OAK_FRAMED_HOPPER =
      BLOCKS.register(DarkOakFramedHopper.NAME, DarkOakFramedHopper::new);
  public static final RegistryObject<Block> CRIMSON_FRAMED_HOPPER =
      BLOCKS.register(CrimsonFramedHopper.NAME, CrimsonFramedHopper::new);
  public static final RegistryObject<Block> WARPED_FRAMED_HOPPER =
      BLOCKS.register(WarpedFramedHopper.NAME, WarpedFramedHopper::new);

  // Wooden framed Hoppers
  public static final RegistryObject<BlockEntityType<OakFramedHopperEntity>> OAK_HOPPER_ENTITY =
      ENTITIES.register(OakFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(OakFramedHopperEntity::new, OAK_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<SpruceFramedHopperEntity>> SPRUCE_HOPPER_ENTITY =
      ENTITIES.register(SpruceFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(SpruceFramedHopperEntity::new, SPRUCE_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<BirchFramedHopperEntity>> BIRCH_HOPPER_ENTITY =
      ENTITIES.register(BirchFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(BirchFramedHopperEntity::new, BIRCH_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<JungleFramedHopperEntity>> JUNGLE_HOPPER_ENTITY =
      ENTITIES.register(JungleFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(JungleFramedHopperEntity::new, JUNGLE_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<AcaciaFramedHopperEntity>> ACACIA_HOPPER_ENTITY =
      ENTITIES.register(AcaciaFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(AcaciaFramedHopperEntity::new, ACACIA_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<DarkOakFramedHopperEntity>> DARK_OAK_HOPPER_ENTITY =
      ENTITIES.register(DarkOakFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(DarkOakFramedHopperEntity::new, DARK_OAK_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<CrimsonFramedHopperEntity>> CRIMSON_HOPPER_ENTITY =
      ENTITIES.register(CrimsonFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(CrimsonFramedHopperEntity::new, CRIMSON_FRAMED_HOPPER.get()).build(null));
  public static final RegistryObject<BlockEntityType<WarpedFramedHopperEntity>> WARPED_HOPPER_ENTITY =
      ENTITIES.register(WarpedFramedHopper.NAME, () -> BlockEntityType.Builder
          .of(WarpedFramedHopperEntity::new, WARPED_FRAMED_HOPPER.get()).build(null));

}
