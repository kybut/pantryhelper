package com.kylebutz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String notes;
    private Boolean inPantry;

    public GroceryItem() {}
    public GroceryItem(String name, String notes, Boolean inPantry) {
        this.name = name;
        this.notes = notes;
        this.inPantry = inPantry;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", inPantry=" + inPantry +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getInPantry() {
        return inPantry;
    }

    public void setInPantry(Boolean inPantry) {
        this.inPantry = inPantry;
    }
}
