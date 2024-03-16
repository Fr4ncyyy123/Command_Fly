package test.fly;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
            if(!(sender instanceof Player)) {
                System.out.println("Non puoi eseguire questa azione");
            }
            else{
                if(sender.hasPermission("staff.use")) {
                    if(((Player) sender).getAllowFlight() == false) {
                        ((Player) sender).setAllowFlight(true);
                        sender.sendMessage(ChatColor.AQUA + "Staff >> " + ChatColor.YELLOW + "Modalità volo " + ChatColor.GREEN + "abilitata");
                    }
                    else{
                        ((Player) sender).setAllowFlight(false);
                        sender.sendMessage(ChatColor.AQUA + "Staff >> " + ChatColor.YELLOW + "Modalità volo " + ChatColor.RED + "disabilitata");
                    }
                }
                else
                {
                    sender.sendMessage(ChatColor.GRAY + "Comando sconosciuto");
                }
            }
            return false;
        }
    }
