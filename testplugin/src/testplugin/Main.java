package testplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
    }
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evt) {
		Player p=evt.getPlayer();
		p.sendMessage("��ӭ���");
		Bukkit.broadcastMessage("��ӭ"+p.getName()+"��Ҽ�����Ϸ");
	}
}
