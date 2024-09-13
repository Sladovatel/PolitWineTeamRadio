package net.pbradio.process;

import net.kyori.adventure.sound.SoundStop;
import net.pbradio.PBRadion;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import org.bukkit.event.block.Action;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MainSong {
    private static final Map<Block, Double> SeePlayer = new HashMap<>();
    private static final Map<Block, Block> Radio = new HashMap<>();
    private static final Map<Block, Block> Active = new HashMap<>();
    private static final Map<Block, Block> Radio1 = new HashMap<>();
    private static final Map<Block, Block> Radio2 = new HashMap<>();
    private static final Map<Block, Block> Radio3 = new HashMap<>();
    public static String RetroFM = "1musicnassvizala";
    public static String RetroFMa = "Музыка нас вязала - Мираж";
    public static double RetroFMb = 82.4;
    public static String RodinaFM = "2ivnivprodolzaetsaboy";
    public static String RodinaFMa = "И вновь продолжается бой! - Иосиф Кобзон";
    public static double RodinaFMb = 102.2;
    public static String GrusnoRadio = "3peremen";
    public static String GrusnoRadioa = "Перемен - КИНО";
    public static double GrusnoRadiob = 96.6;
    public static String RadioENERGY = "bones";
    public static String RadioENERGYa = "Bones - Imagine Dragons";
    public static double RadioENERGYb = 114.0;
    public static String RadioXIT = "";
    public static String RadioXITa = "";
    public static double RadioXITb = 88.8;
    private final PBRadion plugin;
    public MainSong(PBRadion plugin) {
        this.plugin = plugin;
    }

    public static void PlaySong(Block block, Player player, Action action) {
        double radius = 20;
        if (action == Action.LEFT_CLICK_BLOCK) {
            Block nowblock = Active.get(block);
            if (nowblock != null) {
                Active.remove(block);
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    Location playerLocation = player1.getLocation();
                    Location center = block.getLocation();
                    if (playerLocation.distance(center) <= radius) {
                        player.stopSound(SoundStop.all());
                    }
                }
                Location center = block.getLocation();
                String soundName = "1offradio";
                playSoundInRadius(center, radius, soundName);
            } else if (nowblock == null) {
                Active.put(block, block);
                Location center = block.getLocation();
                String soundName = "1onradio";
                playSoundInRadius(center, radius, soundName);
            }
        }
    }

    public static void StartWave52(Player player, Block block, double nowa) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
            if (nowa == RetroFMb) {
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    Location playerLocation = player1.getLocation();
                    Location center = block.getLocation();
                    if (playerLocation.distance(center) <= radius) {
                        player.stopSound(SoundStop.all());
                    }
                }
                Location center = block.getLocation();
               String soundName = "1changeradio";
                playSoundInRadius(center, radius, soundName);
                StratRetroFM(block, player);
                Radio1.remove(block, block);
                Radio2.put(block, block);
            } else if (nowa == RodinaFMb) {
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    Location playerLocation = player1.getLocation();
                    Location center = block.getLocation();
                    if (playerLocation.distance(center) <= radius) {
                        player.stopSound(SoundStop.all());
                    }
                }
                Location center = block.getLocation();
                 String soundName = "1changeradio";
                playSoundInRadius(center, radius, soundName);
                StratRodinaFM(block, player);
                Radio2.remove(block, block);
                Radio3.put(block, block);
            } else if (nowa == GrusnoRadiob) {
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    Location playerLocation = player1.getLocation();
                    Location center = block.getLocation();
                    if (playerLocation.distance(center) <= radius) {
                        player.stopSound(SoundStop.all());
                    }
                }
                Location center = block.getLocation();
               String soundName = "1changeradio";
                playSoundInRadius(center, radius, soundName);
               StratGrusnoRadio(block, player);
                Radio3.remove(block, block);
                Radio1.put(block, block);
            } else {
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    Location playerLocation = player1.getLocation();
                    Location center = block.getLocation();
                    if (playerLocation.distance(center) <= radius) {
                        player.stopSound(SoundStop.all());
                    }
                }
                Location center = block.getLocation();
                String soundName = "1changeradio";
                playSoundInRadius(center, radius, soundName);
                soundName = "1pomexradio";
                playSoundInRadius(center, radius, soundName);
            }
        }
    }

    //Retro

    public static void StratRetroFM(Block block, Player player) {
        double radius = 20;
        String soundName = RetroFM;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player1.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.sendActionBar(RetroFMa);
            }
        }
    }
    public static void StratRetroFM1(Block block) {
        double radius = 20;
        Location center = block.getLocation();
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.stopSound(SoundStop.all());
                player.sendActionBar(RetroFMa);
            }
        }
        String soundName = RetroFM;
        playSoundInRadius(center, radius, soundName);
    }
    public static void RestartRertoFM() {
        for (Map.Entry<Block, Block> entry : Radio1.entrySet()) {
            Block block = entry.getValue();
            StratRetroFM1(block);
        }
    }

    //Rodina

    public static void StratRodinaFM(Block block, Player player) {
        double radius = 20;
        String soundName = RodinaFM;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player1.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.sendActionBar(RodinaFMa);
            }
        }
    }
    public static void StratRodinaFM1(Block block) {
        double radius = 20;
        String soundName = RodinaFM;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.stopSound(SoundStop.all());
                player.sendActionBar(RodinaFMa);
            }
        }
    }
    public static void RestartRodinaFM() {
        for (Map.Entry<Block, Block> entry : Radio2.entrySet()) {
            Block block = entry.getValue();
            StratRodinaFM1(block);
        }
    }

    //GrusnoRadio

    public static void StratGrusnoRadio(Block block, Player player) {
        double radius = 20;
        String soundName = GrusnoRadio;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player1.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.sendActionBar(GrusnoRadioa);
            }
        }
    }
    public static void StratGrusnoRadio1(Block block) {
        double radius = 20;
        String soundName = GrusnoRadio;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.stopSound(SoundStop.all());
                player.sendActionBar(GrusnoRadioa);
            }
        }
    }
    public static void RestartGrusnoRadio() {
        for (Map.Entry<Block, Block> entry : Radio3.entrySet()) {
            Block block = entry.getValue();
            StratGrusnoRadio1(block);
        }
    }

    //More

    public static void Place(Block block, Player player) {
        Radio.put(block, block);
        Radio1.put(block, block);
        SeePlayer.put(block, 80.0);
    }
    public static void Break(Block block) {
        Block nowblock = Radio.get(block);
        if (nowblock != null) {
            Radio.remove(block, block);
            Radio1.remove(block, block);
            Radio2.remove(block, block);
            Radio3.remove(block, block);
            SeePlayer.remove(block);
        }
    }

    //ChangeWave

    public static void ChangeWave(Player player, Block block, boolean vec) {
        double noww = SeePlayer.get(block);
        DecimalFormat df = new DecimalFormat("#.#");
        double nowa = Double.valueOf(df.format(noww));

        if (vec) {
            SeePlayer.replace(block, SeePlayer.get(block), nowa+0.1);
        } else {
            SeePlayer.replace(block, SeePlayer.get(block), nowa-0.1);
        }
        player.sendActionBar("Частота: " + nowa);
        StartWave52(player, block, nowa);
    }

    public static void playSoundInRadius(Location center, double radius, String soundName) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = center;
            if (playerLocation.distance(center) <= radius) {
                player.playSound(playerLocation, soundName, 1.0f, 1.0f);
            }
        }
    }
}
