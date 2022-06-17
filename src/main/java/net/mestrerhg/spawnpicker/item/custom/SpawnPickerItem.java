package net.mestrerhg.spawnpicker.item.custom;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SpawnerBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.State;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpawnPickerItem extends Item {
    public SpawnPickerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            Block blockClicked = context.getWorld().getBlockState(positionClicked).getBlock();

            if (blockClicked.getClass() == SpawnerBlock.class)
            {
                //LootTableEvents.Replace(blockClicked.getDefaultState(), );

               //extracted(context, positionClicked, blockClicked);
            }
        }
        return super.useOnBlock(context);
    }

    private void extracted(ItemUsageContext context, BlockPos positionClicked, Block blockClicked) {
        BlockState blockClickedState = blockClicked.getDefaultState();
        World world = context.getWorld();

        blockClicked.afterBreak(world, context.getPlayer(), positionClicked, blockClickedState,
                ((SpawnerBlock) blockClicked).createBlockEntity(positionClicked, blockClickedState),
                blockClicked.getPickStack(world, positionClicked, blockClickedState));
    }
}
