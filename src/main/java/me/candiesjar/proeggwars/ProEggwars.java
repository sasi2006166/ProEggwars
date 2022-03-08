package me.candiesjar.proeggwars;

import me.candiesjar.proeggwars.listeners.PlayerListener;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class ProEggwars extends JavaPlugin {

    private static ProEggwars instance;
    private Configuration messageConfig;

    @Override
    public void onEnable() {

        getLogger().info("§7§m---- §7Starting §bProEggwars §7§m---");
        instance = this;
        saveDefaultConfig();
        saveMessagesFile();

        getLogger().info("§7§m--- §7Loading §bListeners §7§m---");
        loadListeners();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void saveMessagesFile() {
        File messagesFile = new File(getDataFolder(), "messages.yml");
        if (!messagesFile.exists()) {
            try {
                messagesFile.createNewFile();
                messageConfig = YamlConfiguration.loadConfiguration(messagesFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadListeners() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    public void reloadConfig() {
        reloadConfig();
    }

    public static ProEggwars getInstance() {
        return instance;
    }

    public Configuration getMessageConfig() {
        return messageConfig;
    }
}
