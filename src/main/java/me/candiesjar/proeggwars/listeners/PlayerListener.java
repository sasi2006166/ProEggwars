package me.candiesjar.proeggwars.listeners;

import me.candiesjar.proeggwars.enums.ConfigEnums;
import me.candiesjar.proeggwars.enums.MessagesEnums;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        if (!player.hasPlayedBefore())
            if (ConfigEnums.FIRST_JOIN_MESSAGE.getBoolean())
                event.joinMessage(Component.text(MessagesEnums.FIRST_JOIN_MESSAGE.getColoredString()));
        if (ConfigEnums.CUSTOM_JOIN_MESSAGE.getBoolean())
            event.joinMessage(Component.text(MessagesEnums.JOIN_MESSAGE.getColoredString()
                    .replace("%prefix%", player.getName())));

    }

    @EventHandler
    public void onPlayerQuit(final PlayerQuitEvent event) {
        final Player player = event.getPlayer();
        if (ConfigEnums.CUSTOM_QUIT_MESSAGE.getBoolean())
            event.quitMessage(Component.text(MessagesEnums.QUIT_MESSAGE.getColoredString()
                    .replace("%player%", player.getName())));
    }

}
