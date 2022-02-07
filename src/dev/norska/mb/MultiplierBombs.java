package dev.norska.mb;

import org.bukkit.plugin.java.JavaPlugin;

import dev.norska.mb.api.MultiplierBombsEcoInterfaceManager;
import lombok.Getter;

public class MultiplierBombs extends JavaPlugin {
	
	private static MultiplierBombs instance;
	public MultiplierBombs() { instance = this; }
	public static MultiplierBombs getInstance() { return instance; }

	@Getter private MultiplierBombsEcoInterfaceManager econProvider = new MultiplierBombsEcoInterfaceManager();

}
