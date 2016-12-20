package com.kylebutz;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class GroceryItemResourceProessor implements ResourceProcessor<Resource<GroceryItem>>{
    @Override
    public Resource<GroceryItem> process(Resource<GroceryItem> groceryItemResource){

        groceryItemResource.add(new Link("http://s3.com/imgs/"
                + groceryItemResource.getContent().getId()
                + ".jpg", "item-photo"));

        return groceryItemResource;
    }
}
