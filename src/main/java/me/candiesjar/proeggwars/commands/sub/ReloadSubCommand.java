package me.candiesjar.proeggwars.commands.sub;

import me.candiesjar.proeggwars.ProEggwars;
import me.candiesjar.proeggwars.commands.SubCommand;
import me.candiesjar.proeggwars.enums.ConfigEnums;
import me.candiesjar.proeggwars.enums.MessagesEnums;
import me.candiesjar.proeggwars.enums.SubCommandType;
import org.bukkit.command.CommandSender;

public class ReloadSubCommand implements SubCommand {

    @Override
    public SubCommandType getType() {
        return SubCommandType.UNIVERSAL;
    }

    @Override
    public String getPermission() {
        return null;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProEggwars.getInstance().reloadConfig();
        if (ConfigEnums.RELOAD_MESSAGE.getBoolean())
            sender.sendMessage(MessagesEnums.RELOAD_MESSAGE.getColoredString());
    }
}
