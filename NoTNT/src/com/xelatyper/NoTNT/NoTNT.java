package com.xelatyper.NoTNT;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoTNT extends JavaPlugin implements Listener {
	
	@Override
    public void onEnable() {
		getLogger().info("Created By Xelatyper");
		
        PluginManager pm = this.getServer().getPluginManager();
 
        pm.registerEvents(this, this);
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("Plugin Has Stopped!");
    }
    
    @EventHandler(priority = EventPriority.HIGH)
    public void TNTPlace(BlockPlaceEvent event) {
    	if(event.getBlock().getType() == Material.TNT) {
    	for(Player player: getServer().getOnlinePlayers()) {
    	if(player.hasPermission("notnt.place")) {     
    	
    }else{
         
    	if(event.getBlock().getType() == Material.TNT) {
              event.setCancelled(true);
              event.getPlayer().sendMessage(ChatColor.DARK_RED + "You do not have permission to place TNT!"); 
            	
         }
    	}
        
    }
    }
}
}
