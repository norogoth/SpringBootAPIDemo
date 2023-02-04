package com.example.demoAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Component
public class InventoryLoader {
    private Inventory inventory;

    @PostConstruct
    public void loadInventory() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(
                getClass().getResourceAsStream("/inventory.json"),
                Inventory.class
        );
        //inventory = new Inventory();
    }
    public Inventory getInventory() {
        return inventory;
    }
}
