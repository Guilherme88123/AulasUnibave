package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "product")
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(nullable = false, length = 50)
    public String name;

    @Column(nullable = false)
    public double price;

    @Column(nullable = false)
    public LocalDate editDate;

    @Column(nullable = false)
    public boolean enable;

    public Product ()
    {
    }

    public Product (String name, double price, boolean enable)
    {
        this.name = name;
        this.price = price;
        this.editDate = LocalDate.now();
        this.enable = enable;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public LocalDate getEditDate() { return editDate; }
    public boolean getEnable() { return enable; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setEditDate(LocalDate editDate) { this.editDate = editDate; }
    public void setEnable(boolean enable) { this.enable = enable; }
}
