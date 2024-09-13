package net.pbradio.listener;

import net.pbradio.PBRadion;
import net.pbradio.process.MainSong;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.RayTraceResult;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PBRadioListiner implements Listener {
    private final PBRadion plugin;
    public PBRadioListiner(PBRadion plugin) {
        this.plugin = plugin;
    }

    private Map<UUID, Long> lastInteractTime = new HashMap<>();

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        Block block = event.getClickedBlock();
        Action action = event.getAction();
        long currentTime = System.currentTimeMillis();

        if (lastInteractTime.containsKey(uuid) && currentTime - lastInteractTime.get(uuid) < 100) {
            return;
        }

        lastInteractTime.put(uuid, currentTime);

        if (event.getClickedBlock().getType() == Material.AMETHYST_CLUSTER) {
            MainSong.PlaySong(block, player, action);
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        if (block.getType() == Material.AMETHYST_CLUSTER) {
            MainSong.Place(block, player);
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.AMETHYST_CLUSTER) {
            MainSong.Break(block);
        }
    }

    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        Block targetBlock = getTargetBlock(player, 4);
        RayTraceResult result = player.rayTraceBlocks(4);
        if (targetBlock != null && targetBlock.getType() == Material.AMETHYST_CLUSTER) {
            int previousSlot = event.getPreviousSlot();
            int newSlot = event.getNewSlot();
            Block block = result.getHitBlock();

            if (newSlot > previousSlot) {
                event.setCancelled(true);
                boolean vec = false;
                MainSong.ChangeWave(player, block, vec); //в минус
            } else if (newSlot < previousSlot) {
                event.setCancelled(true);
                boolean vec = true;
                MainSong.ChangeWave(player, block, vec); //в плюс
            }
        }
    }

    private Block getTargetBlock(Player player, int range) {
        BlockIterator iterator = new BlockIterator(player, range);
        Block lastBlock = null;
        while (iterator.hasNext()) {
            lastBlock = iterator.next();
            if (lastBlock.getType() != Material.AIR) {
                break;
            }
        }
        return lastBlock;
    }
}
