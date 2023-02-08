package com.example.demoAPI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InventoryController {
    private InventoryLoader inventoryLoader;

    public InventoryController(InventoryLoader  inventoryLoader) {
        this.inventoryLoader = inventoryLoader;
    }

    @GetMapping("/inventory")
    public InventoryItem[] getInventory() {
        return inventoryLoader.getInventory();
    }
}
