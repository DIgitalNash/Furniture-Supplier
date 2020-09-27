/*
    Coder: Elvis Gene
    Description: Sale class. Will be used once a sale is made.
 */

package com.furnitureapp.entity.sales;
import java.time.LocalDateTime;
import java.util.Set;


public class Sale{
    private Integer saleCode;
    private double totalAmount;
    private LocalDateTime saleTime;
    private Set<SaleProduct> saleProducts;

    public Sale(){}

    private Sale(SaleBuilder builder){
        this.saleCode = builder.saleCode;
        this.totalAmount = builder.totalAmount;
        this.saleTime = builder.saleTime;
        this.saleProducts = builder.saleProducts;
    }

    public Integer getSaleCode() { return saleCode; }

    public double getTotalAmount() { return totalAmount;  }

    public Set<SaleProduct> getSaleProducts() {
        return saleProducts;
    }

    public LocalDateTime getSaleTime() {
        return LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleCode=" + saleCode +
                ", totAmt=" + totalAmount +
                ", saleTime='" + saleTime + '\'' +
                '}';
    }

    public static class SaleBuilder{
        private Integer saleCode;
        private double totalAmount;
        private LocalDateTime saleTime;
        private Set<SaleProduct> saleProducts;

        public SaleBuilder(){}

        public SaleBuilder setSaleCode(Integer saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public SaleBuilder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public SaleBuilder setSaleTime(LocalDateTime saleTime) {
            this.saleTime = saleTime;
            return this;
        }

        public SaleBuilder setSaleProducts(Set<SaleProduct> saleProducts) {
            this.saleProducts = saleProducts;
            return this;
        }

        public SaleBuilder copy(Sale sale){
            this.saleCode = sale.saleCode;
            this.totalAmount = sale.totalAmount;
            this.saleTime= sale.saleTime;
            this.saleProducts = sale.saleProducts;
            return this;
        }

        public Sale build(){
            return new Sale(this);
        }
    }

}
