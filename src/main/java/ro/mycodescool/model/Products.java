package ro.mycodescool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products implements Comparable<Products> {

    private int id;
    private String name;
    private int price;
    private int weight;
    private String description;
    private String category;
    private LocalDate date;
    private int stock;

    public Products(String name, int price, int weight, String description, String category, LocalDate date, int stock) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.description = description;
        this.category = category;
        this.date = date;
        this.stock = stock;
    }


    @Override
    public int compareTo(Products o) {

        return this.name.compareTo(o.getName());

    }
}
