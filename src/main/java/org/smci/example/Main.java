package org.smci.example;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by tsvetok on 2/9/17.
 */
public class Main extends JavaPlugin {


    @Override
    public void onEnable(){
        Logger.getLogger("minecraft").log(Level.INFO, "[SMCI-Example] Hello, world!");
    }

    public void onDisable(){
        Logger.getLogger("minecraft").log(Level.INFO, "[INFO] Goodbye, world!");
    }
}
