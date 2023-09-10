package me.TaikiFnit.SpigotPlugin1;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;

public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {

            ItemStack diamond = new ItemStack(Material.DIAMOND);

            player.getInventory().addItem(diamond);

            FnitEvent fnitEvent = new FnitEvent(player.getName());
            Bukkit.getPluginManager().callEvent(fnitEvent);
            player.sendMessage(fnitEvent.getPlayerName());
        }

        return true;
    }
}
