package com.kylebutz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class GroceryItemController {
    private GroceryItemRepository groceryItemRepository;
    @RequestMapping("/api")
    Collection<GroceryItem> groceryItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItemRepository getGroceryItemRepository() {
        return groceryItemRepository;
    }

    @Autowired
    public void setGroceryItemRepository(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }
}
