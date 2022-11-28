package net.minecraft5333.je.plugins;

import net.minecraft5333.je.plugins.commands.basic.PluginInfo;
import net.minecraft5333.je.plugins.commands.message.moin1;
import net.minecraft5333.je.plugins.commands.basic.ping;
import net.minecraft5333.je.plugins.commands.message.tschüss;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class mineti extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println(ChatColor.GREEN + "Bin wieder da (Mineti startet)");

        //basics
        getCommand("minetivs").setExecutor(new PluginInfo());
        getCommand("ping").setExecutor(new ping());

        //message
        getCommand("moin").setExecutor(new moin1());
        getCommand("tschüss").setExecutor(new tschüss());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.GREEN + "Bin dann mal weg (Mineti endet)");
    }
}
