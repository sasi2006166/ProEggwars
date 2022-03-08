package me.candiesjar.proeggwars.enums;

import me.candiesjar.proeggwars.ProEggwars;
import org.bukkit.ChatColor;

public enum MessagesEnums {


    JOIN_MESSAGE("MESSAGES.join.join_message"),
    FIRST_JOIN_MESSAGE("MESSAGES.join.first_join_message"),


    QUIT_MESSAGE("MESSAGES.quit.quit_message"),

    RELOAD_MESSAGE("MESSAGES.reload_message")

    ;

    private final String path;


    MessagesEnums(String path) {
        this.path = path;
    }

    public String getColoredString() {
        return ChatColor.translateAlternateColorCodes('&', ProEggwars.getInstance().getMessageConfig().getString(path));
    }

    public static String getColoredString(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

}
