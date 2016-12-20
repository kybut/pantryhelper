package com.kylebutz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroceryItemMvcController {
    private GroceryItemRepository groceryItemRepository;
    @RequestMapping("/groceries")
    String groceries (Model model){
        model.addAttribute("groceries", getGroceryItemRepository().findAll());
        return "groceries";
    }

    public GroceryItemRepository getGroceryItemRepository() {
        return groceryItemRepository;
    }

    @Autowired
    public void setGroceryItemRepository(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }
}
