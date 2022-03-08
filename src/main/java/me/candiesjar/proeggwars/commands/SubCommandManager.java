package me.candiesjar.proeggwars.commands;

import com.google.common.collect.Maps;
import me.candiesjar.proeggwars.commands.sub.ReloadSubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class SubCommandManager implements CommandExecutor {

    private final Map<String, SubCommand> subCommands = Maps.newHashMap();

    private void setup() {
        subCommands.put("reload", new ReloadSubCommand());
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        final SubCommand subCommand = subCommands.get(args[0].toLowerCase());

        if (!sender.hasPermission(subCommand.getPermission())) {
            sender.sendMessage("");
        }
            return true;
    }
}
