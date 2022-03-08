package me.candiesjar.proeggwars.enums;

import me.candiesjar.proeggwars.ProEggwars;

public enum ConfigEnums {


    CUSTOM_JOIN_MESSAGE("ProEggwars.join.custom_join_message"),
    FIRST_JOIN_MESSAGE("ProEggwars.join.first_join_message"),


    CUSTOM_QUIT_MESSAGE("ProEggwars.quit.custom_quit_message"),

    RELOAD_MESSAGE("ProEggwars.messages.reload_message")

    ;


    private final String path;

    ConfigEnums(String path) {
        this.path = path;
    }


    public String getString() {
        return ProEggwars.getInstance().getConfig().getString(path);
    }

    public int getInt() {
        return ProEggwars.getInstance().getConfig().getInt(path);
    }

    public boolean getBoolean() {
        return ProEggwars.getInstance().getConfig().getBoolean(path);
    }



}
