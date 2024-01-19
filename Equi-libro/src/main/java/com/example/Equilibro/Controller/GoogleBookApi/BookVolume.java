package com.example.Equilibro.Controller.GoogleBookApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookVolume {
    @Override
    public String toString() {
        return "BookVolume{" +
                "items=" + items +
                '}';
    }

    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
