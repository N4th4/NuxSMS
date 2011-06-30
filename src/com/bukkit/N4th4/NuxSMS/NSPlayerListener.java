package com.bukkit.N4th4.NuxSMS;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class NSPlayerListener extends PlayerListener {
    private final NuxSMS plugin;

    public NSPlayerListener(NuxSMS instance) {
        plugin = instance;
    }

    public void onPlayerChat(PlayerChatEvent event) {
        if(plugin.regex.matcher(event.getMessage()).matches()) {
            event.getPlayer().sendMessage(plugin.message);
        }
    }
}
