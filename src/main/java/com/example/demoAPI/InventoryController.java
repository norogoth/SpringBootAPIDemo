package com.example.demoAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class InventoryController {
    private InventoryLoader inventoryLoader;

    public InventoryController(InventoryLoader  inventoryLoader) {
        this.inventoryLoader = inventoryLoader;
    }

    @GetMapping("/inventory")
    public Inventory getInventory() {
        return inventoryLoader.getInventory();
    }
}
