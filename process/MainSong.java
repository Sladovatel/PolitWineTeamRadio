package net.politwineteamradio.process;

import net.kyori.adventure.sound.SoundStop;
import net.politwineteamradio.PolitWineTeamRadio;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
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
    private static final Map<Block, Block> Radio4 = new HashMap<>();
    private static final Map<Block, Block> Radio5 = new HashMap<>();
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
    public static String RadioXIT = "5moonlight";
    public static String RadioXITa = "moonlight - speed up, Nightcore";
    public static double RadioXITb = 88.8;
    private final PolitWineTeamRadio plugin;
    public MainSong(PolitWineTeamRadio plugin) {
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
                String name = "RetroFM";
                StratSongRetroPlayer(block, player);
                Radio1.put(block, block);
                Radio2.remove(block, block);
                Radio3.remove(block, block);
                Radio4.remove(block, block);
                Radio5.remove(block, block);
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
                String name = "RodinaFM";
                StratSongRodinaPlayer(block, player);
                Radio1.remove(block, block);
                Radio2.put(block, block);
                Radio3.remove(block, block);
                Radio4.remove(block, block);
                Radio5.remove(block, block);
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
                String name = "GrusnoRadiob";
                StratSongGrusnoPlayer(block, player);
                Radio1.remove(block, block);
                Radio2.remove(block, block);
                Radio3.put(block, block);
                Radio4.remove(block, block);
                Radio5.remove(block, block);
            } else if (nowa == RadioENERGYb) {
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
                String name = "RadioENERGY";
                StratSongEnergyPlayer(block, player);
                Radio1.remove(block, block);
                Radio2.remove(block, block);
                Radio3.remove(block, block);
                Radio4.put(block, block);
                Radio5.remove(block, block);
            } else if (nowa == RadioXITb) {
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
                String name = "RadioXIT";
                StratSongXitPlayer(block, player);
                Radio1.remove(block, block);
                Radio2.remove(block, block);
                Radio3.remove(block, block);
                Radio4.remove(block, block);
                Radio5.put(block, block);
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

    //Start and restart song | Старт и рестарт песен

    //Retro radio
    public static void StratSongRetroPlayer(Block block, Player player) {
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
    public static void StratSongRetroPlugin(Block block) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
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
    }
    //Rodina radio
    public static void StratSongRodinaPlayer(Block block, Player player) {
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
    public static void StratSongRodinaPlugin(Block block) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
            Location center = block.getLocation();
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location playerLocation = player.getLocation();
                if (playerLocation.distance(center) <= radius) {
                    player.stopSound(SoundStop.all());
                    player.sendActionBar(RodinaFMa);
                }
            }
            String soundName = RodinaFM;
            playSoundInRadius(center, radius, soundName);
        }
    }
    //Grusno radio
    public static void StratSongGrusnoPlayer(Block block, Player player) {
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
    public static void StratSongGrusnoPlugin(Block block) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
            Location center = block.getLocation();
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location playerLocation = player.getLocation();
                if (playerLocation.distance(center) <= radius) {
                    player.stopSound(SoundStop.all());
                    player.sendActionBar(GrusnoRadioa);
                }
            }
            String soundName = GrusnoRadio;
            playSoundInRadius(center, radius, soundName);
        }
    }
    //Energy radio
    public static void StratSongEnergyPlayer(Block block, Player player) {
        double radius = 20;
        String soundName = RadioENERGY;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player1.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.sendActionBar(RadioENERGYa);
            }
        }
    }
    public static void StratSongEnergyPlugin(Block block) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
            Location center = block.getLocation();
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location playerLocation = player.getLocation();
                if (playerLocation.distance(center) <= radius) {
                    player.stopSound(SoundStop.all());
                    player.sendActionBar(RadioENERGYa);
                }
            }
            String soundName = RadioENERGY;
            playSoundInRadius(center, radius, soundName);
        }
    }
    //Xit radio
    public static void StratSongXitPlayer(Block block, Player player) {
        double radius = 20;
        String soundName = RadioXIT;
        Location center = block.getLocation();
        playSoundInRadius(center, radius, soundName);
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Location playerLocation = player1.getLocation();
            if (playerLocation.distance(center) <= radius) {
                player.sendActionBar(RadioXITa);
            }
        }
    }
    public static void StratSongXitPlugin(Block block) {
        double radius = 20;
        Block nowblock = Active.get(block);
        if (nowblock != null) {
            Location center = block.getLocation();
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location playerLocation = player.getLocation();
                if (playerLocation.distance(center) <= radius) {
                    player.stopSound(SoundStop.all());
                    player.sendActionBar(RadioXITa);
                }
            }
            String soundName = RadioXIT;
            playSoundInRadius(center, radius, soundName);
        }
    }
    //All restart | Все перезапуски
    public static void RestartSongPlugin1() {
        for (Map.Entry<Block, Block> entry : Radio1.entrySet()) {
            Block block = entry.getValue();
            StratSongRetroPlugin(block);
        }
    }
    public static void RestartSongPlugin2() {
        for (Map.Entry<Block, Block> entry : Radio2.entrySet()) {
            Block block = entry.getValue();
            StratSongRodinaPlugin(block);
        }
    }
    public static void RestartSongPlugin3() {
        for (Map.Entry<Block, Block> entry : Radio3.entrySet()) {
            Block block = entry.getValue();
            StratSongGrusnoPlugin(block);
        }
    }
    public static void RestartSongPlugin4() {
        for (Map.Entry<Block, Block> entry : Radio4.entrySet()) {
            Block block = entry.getValue();
            StratSongEnergyPlugin(block);
        }
    }
    public static void RestartSongPlugin5() {
        for (Map.Entry<Block, Block> entry : Radio5.entrySet()) {
            Block block = entry.getValue();
            StratSongXitPlugin(block);
        }
    }

    //Setting place and break block | Настройки поставки и ломания блока

    public static void Place(Block block) {
        Radio.put(block, block);
        SeePlayer.put(block, 80.1);
    }
    public static void Break(Block block) {
        Block nowblock = Radio.get(block);
        if (nowblock != null) {
            Radio.remove(block, block);
            Radio1.remove(block, block);
            Radio2.remove(block, block);
            Radio3.remove(block, block);
            Radio4.remove(block, block);
            Radio5.remove(block, block);
            Active.remove(block, block);
            SeePlayer.remove(block);
        }
    }

    //Change wave sckor | Изменение волны колесиком мыши

    public static void ChangeWave(Player player, Block block, boolean vec) {
        double noww = SeePlayer.get(block);
        DecimalFormat df = new DecimalFormat("#.#");
        double nowa = Double.valueOf(df.format(noww));

        if (nowa == 79.9) {
            SeePlayer.replace(block, SeePlayer.get(block), nowa+0.1);
        } else if (nowa == 130.1) {
            SeePlayer.replace(block, SeePlayer.get(block), nowa-0.1);
        } else {
            if (vec) {
                SeePlayer.replace(block, SeePlayer.get(block), nowa+0.1);
            } else {
                SeePlayer.replace(block, SeePlayer.get(block), nowa-0.1);
            }
        }
        player.sendActionBar("Частота: " + nowa);
        StartWave52(player, block, nowa);
    }

    //Start all sound | Старт всей музыки

    public static void playSoundInRadius(Location center, double radius, String soundName) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location playerLocation = center;
            if (playerLocation.distance(center) <= radius) {
                player.playSound(playerLocation, soundName, 1.0f, 1.0f);
            }
        }
    }
}
