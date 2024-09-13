package net.pbradio.cmd;

import net.pbradio.process.MainSong;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

public class PlaySong implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        double radius = 20;
        String soundName = "2ivnivprodolzaetsaboy";
        Location center = player.getLocation();
        MainSong.playSoundInRadius(center, radius, soundName);
        return true;
    }
}
