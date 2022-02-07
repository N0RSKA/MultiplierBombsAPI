package dev.norska.mb.api;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class MultiplierBombsEcoInterfaceManager {
	
	@Getter private final Map<String, MultiplierBombsEcoInterface> economyMap = new HashMap<>();

    public void registerNewProvider(String identifier, MultiplierBombsEcoInterface DSWEconInterface) {
    	economyMap.put(identifier, DSWEconInterface);
    }

}
