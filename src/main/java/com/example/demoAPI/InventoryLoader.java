package com.example.demoAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class InventoryLoader {
    private InventoryItem[] inventory;

    @PostConstruct
    public void loadInventory() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(
                getClass().getResourceAsStream("/inventory.json"),
                InventoryItem[].class
        );
    }
    public InventoryItem[] getInventory() {
        return inventory;
    }
}
