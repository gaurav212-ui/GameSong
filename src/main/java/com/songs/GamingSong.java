package com.songs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class GamingSong extends JavaPlugin {
    
    // Activation code of the plugin
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', "&a==================================")
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', "&aGamingSong plugin has been enabled!")
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("==================================="))
        );

    }

    // Desactivation code of the plugin
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("&c==================================")
            )
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("&cGamingSong plugin has disabled!")
            )
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("===================================="))
        );
    }
}
