package dev.norska.mb.items;

import java.util.List;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import lombok.Setter;

public class MultiplierBombItem {
	
	@Getter @Setter private String typeName, provider;

	@Getter @Setter private ItemStack item;
	
	@Getter @Setter private int tries, bombAmount;
	
	@Getter @Setter private Double bestMult, worstMult;
	
	@Getter @Setter private List<String> layout;
	
	@Getter @Setter private List<Double> multList;

}
