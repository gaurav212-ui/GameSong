package com.songs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class GamingSong extends JavaPlugin {

    public static String prefix = "&8[&aGamingSong&8] &7";
    private String version = getDescription().getVersion();
    
    // Activation code of the plugin
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', "&a==================================")
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', prefix+" &3&lplugin has been enabled!"+version)
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("&7Author: &eDexstDev"))
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
            ChatColor.translateAlternateColorCodes('&', (prefix+" &e&lplugin has disabled!"+version)
            )
        );
        Bukkit.getConsoleSender().sendMessage(
            ChatColor.translateAlternateColorCodes('&', ("===================================="))
        );
    }
}
