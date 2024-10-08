package com.sh.studyyunghan.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Item {
    private long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }
}
