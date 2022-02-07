package dev.norska.mb.api;

import org.bukkit.entity.Player;

public interface MultiplierBombsEcoInterface {

	void take(Player p, Double amount);
	
	void add(Player p, Double amount);
	
	void set(Player p, Double amount);
	
	Boolean has(Player p, Double amount);
	
	Double getCurrent(Player p);
	
	void take(Player p, Integer amount);
	
	void add(Player p, Integer amount);
	
	void set(Player p, Integer amount);
	
	Boolean has(Player p, Integer amount);	

	String currencyString();
	
	int currencyFormat();
	
}
