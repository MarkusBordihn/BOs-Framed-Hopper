/**
 * Copyright 2023 Markus Bordihn
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

package de.markusbordihn.minecraft.framedhopper.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import de.markusbordihn.minecraft.framedhopper.Constants;
import de.markusbordihn.minecraft.framedhopper.block.ModBlocks;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.AcaciaFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.BirchFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.CrimsonFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.DarkOakFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.JungleFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.MangroveFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.OakFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.SpruceFramedHopper;
import de.markusbordihn.minecraft.framedhopper.block.framedhopper.WarpedFramedHopper;

public class ModItems {

  protected ModItems() {}

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  // Wooden framed Hoppers
  public static final RegistryObject<Item> OAK_FRAMED_HOPPER = ITEMS.register(OakFramedHopper.NAME,
      () -> new BlockItem(ModBlocks.OAK_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> SPRUCE_FRAMED_HOPPER =
      ITEMS.register(SpruceFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.SPRUCE_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> BIRCH_FRAMED_HOPPER =
      ITEMS.register(BirchFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.BIRCH_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> JUNGLE_FRAMED_HOPPER =
      ITEMS.register(JungleFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.JUNGLE_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> ACACIA_FRAMED_HOPPER =
      ITEMS.register(AcaciaFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.ACACIA_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> DARK_OAK_FRAMED_HOPPER =
      ITEMS.register(DarkOakFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.DARK_OAK_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> CRIMSON_FRAMED_HOPPER =
      ITEMS.register(CrimsonFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.CRIMSON_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> WARPED_FRAMED_HOPPER =
      ITEMS.register(WarpedFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.WARPED_FRAMED_HOPPER.get(), new Item.Properties()));
  public static final RegistryObject<Item> MANGROVE_FRAMED_HOPPER =
      ITEMS.register(MangroveFramedHopper.NAME,
          () -> new BlockItem(ModBlocks.MANGROVE_FRAMED_HOPPER.get(), new Item.Properties()));
}
