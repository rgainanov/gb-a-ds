package ru.geekbrains.ads.lesson8;

import java.util.Objects;

public class Product {
    private final int id;
    private final String title;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Math.abs(id);
//        return Objects.hash(id, title);
    }
}
