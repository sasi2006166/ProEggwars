package me.candiesjar.proeggwars.commands;

import me.candiesjar.proeggwars.enums.SubCommandType;
import org.bukkit.command.CommandSender;

public interface SubCommand {

    SubCommandType getType();

    String getPermission();

    void execute(CommandSender sender, String[] args);

}
