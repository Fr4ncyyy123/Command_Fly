package test.fly;

import org.bukkit.plugin.java.JavaPlugin;

public final class Fly extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("----------------------------------");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("FLY PLUGIN ABILITATO!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("----------------------------------");
        getCommand("fly").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        System.out.println("----------------------------------");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("FLY PLUGIN DISABILITATO!");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("----------------------------------");
    }
}
