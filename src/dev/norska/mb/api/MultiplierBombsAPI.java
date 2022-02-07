package dev.norska.mb.api;

import org.bukkit.inventory.ItemStack;

import dev.norska.mb.MultiplierBombs;
import dev.norska.mb.items.MultiplierBombItem;

public class MultiplierBombsAPI {
	
	/** 
	* Check if an ItemStack is a MultiplierBomb item.
	* @param ItemStack
	* @return Boolean
	*/
	public static Boolean isMultiplierBombItem(ItemStack itemstack) {
		return null;
	}
	
	/** 
	* Get a MultiplierBomb Item (via id) and access it's settings (should be checked with #isMultiplierBombItem first).
	* You can get the instance of MultiplierBombs' with MultiplierBombs.getInstance();.
	* You can get the id with #getMultiplierBombItemTier.
	* @param TreasureLocator Instance, String identifier
	* @return MultiplierBombItem
	*/
	public static MultiplierBombItem getMultiplierBombItemWithIdentifier(MultiplierBombs instance, String identifier) {
		return null;
	}
	
	/** 
	* Get a MultiplierBomb Item (via itemstack) and access it's settings (should be checked with #isMultiplierBombItem first).
	* You can get the instance of MultiplierBombs' with MultiplierBombs.getInstance();.
	* @param TreasureLocator Instance, ItemStack itemstack
	* @return MultiplierBombItem
	*/
	public static MultiplierBombItem getMultiplierBombItemWithItemStack(MultiplierBombs instance, ItemStack itemstack) {
		return null;
	}
	
	/** 
	* Get a MultiplierBomb Item's ID/Tier (should be checked with #isMultiplierBombItem first).
	* @param ItemStack
	* @return String
	*/
	public static String getMultiplierBombItemTier(ItemStack itemstack) {
		return null;
	}
}
