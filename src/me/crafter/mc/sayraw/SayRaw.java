package me.crafter.mc.sayraw;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SayRaw extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Mincraft");
	

    public void onEnable(){
    	this.logger.info("Plugin made by connection_lost. www.crafter.me");
        }
 

    public void onDisable() {
    	PluginDescriptionFile pdfFile = getDescription();
        this.logger.info("DeathNotice " + pdfFile.getVersion() + " has been DISABLED!");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, final String[] args)
    {
    	if (cmd.getName().equals("sayr") || cmd.getName().equals("sayraw")){
    		String bc = "";
    		for (String x:args){
    			bc+=x+" ";
    		}
    		ChatColor.translateAlternateColorCodes(("&").charAt(0), bc);
    		Bukkit.broadcastMessage(bc);
    		return true;
    	}
    	
    	if (cmd.getName().equals("sayspam")){
        	String bc = "";
        	for (String x:args){
        		bc+=x+" ";
        	}
        	ChatColor.translateAlternateColorCodes(("&").charAt(0), bc);
        	Bukkit.broadcastMessage(ChatColor.RED+bc);
        	Bukkit.broadcastMessage(ChatColor.AQUA+bc);
        	Bukkit.broadcastMessage(ChatColor.BLUE+bc);
        	Bukkit.broadcastMessage(ChatColor.DARK_BLUE+bc);
        	Bukkit.broadcastMessage(ChatColor.DARK_GREEN+bc);
        	Bukkit.broadcastMessage(ChatColor.GREEN+bc);
        	Bukkit.broadcastMessage(ChatColor.YELLOW+bc);
        	Bukkit.broadcastMessage(ChatColor.GOLD+bc);
        	Bukkit.broadcastMessage(ChatColor.BLACK+bc);
        	return true;
    		}
    	
		return false;
    }
	
}
