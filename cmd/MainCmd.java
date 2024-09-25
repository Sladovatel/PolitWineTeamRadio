package net.politwineteamradio.cmd;

import net.politwineteamradio.PolitWineTeamRadio;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCmd implements CommandExecutor {
    private final PolitWineTeamRadio plugin;
    public MainCmd(PolitWineTeamRadio plugin) {
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("reload")) {
            if (sender.isOp()) {
                reloadPlugin();
                sender.sendMessage(ChatColor.DARK_GREEN + "Плагин успешно перезагружен!");
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "У вас нет прав для выполнения данной команды");
            }
        }
        return true;
    }

    //reload call | вызов перезагрузки

    private void reloadPlugin() {
        Bukkit.getPluginManager().disablePlugin(plugin);
        Bukkit.getPluginManager().enablePlugin(plugin);
    }
}
