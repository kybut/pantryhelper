package com.kylebutz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@RepositoryRestResource
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Integer> {
    Collection<GroceryItem> findByName(@Param("groceryItem") String groceryItem);
}
