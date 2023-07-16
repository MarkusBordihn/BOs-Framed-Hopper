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

package de.markusbordihn.minecraft.framedhopper.tabs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Output;

import net.minecraftforge.event.CreativeModeTabEvent;

import de.markusbordihn.minecraft.framedhopper.Constants;
import de.markusbordihn.minecraft.framedhopper.item.ModItems;

public class FramedHopperTab {

  protected static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  protected FramedHopperTab() {}

  public static CreativeModeTab TAB_FRAMED_HOPPERS;

  public static void handleCreativeModeTabRegister(CreativeModeTabEvent.Register event) {

    log.info("{} creative mod tabs ...", Constants.LOG_REGISTER_PREFIX);

    TAB_FRAMED_HOPPERS = event.registerCreativeModeTab(
        new ResourceLocation(Constants.MOD_ID, "framed_hoppers"), builder -> {
          builder.icon(() -> ModItems.OAK_FRAMED_HOPPER.get().getDefaultInstance())
              .displayItems(FramedHopperTab::addFramedHoppersTabItems)
              .title(Component.translatable("itemGroup.framed_hoppers")).build();
        });
  }

  private static void addFramedHoppersTabItems(FeatureFlagSet featureFlagSet, Output outputTab,
      boolean hasPermissions) {
    outputTab.accept(ModItems.OAK_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.SPRUCE_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.BIRCH_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.JUNGLE_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.ACACIA_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.DARK_OAK_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.CRIMSON_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.WARPED_FRAMED_HOPPER.get());
    outputTab.accept(ModItems.MANGROVE_FRAMED_HOPPER.get());
  }

}
