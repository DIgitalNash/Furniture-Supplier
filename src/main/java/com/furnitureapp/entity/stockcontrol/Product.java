package com.furnitureapp.entity.stockcontrol;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author @Siba182
 * Description: Entity for product
 */

@Entity
public class Product {

    @Id
    private Integer productCode;
    private String name;
    private double price;
    private float length;
    private float width;
    private float weight;
    private String description;

    protected Product(){}

    private Product(ProductBuilder builder) {
        this.productCode = builder.productCode;
        this.name = builder.name;
        this.price = builder.price;
        this.length = builder.length;
        this.width = builder.width;
        this.weight = builder.weight;
        this.description = builder.description;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }

    public static class ProductBuilder {
        private Integer productCode;
        private String name;
        private double price;
        private float length;
        private float width;
        private float weight;
        private String description;
        private Category category;

        public ProductBuilder() {

        }


        public ProductBuilder setProductCode(Integer productCode) {
            this.productCode = productCode;
            return this;
        }

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setLength(float length) {
            this.length = length;
            return this;
        }

        public ProductBuilder setWidth(float width) {
            this.width = width;
            return this;

        }

        public ProductBuilder setWeight(float weight) {
            this.weight = weight;
            return this;

        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public ProductBuilder copy(Product product) {
            this.productCode = product.productCode;
            this.name = product.name;
            this.price = product.price;
            this.length = product.length;
            this.width = product.width;
            this.weight = product.weight;
            this.description = product.description;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productCode.equals(product.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode);
    }
}


