package com.Amazon.GetterData.PageData.ProductData;

public class Product {
    protected String asin;
    protected String revivers;
    protected String price;


    public String getPrice() {
        System.out.println(price);
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAsin() {
        System.out.println(asin);
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getRevivers() {
        System.out.println(revivers);
        return revivers;
    }

    public void setRevivers(String revivers) {
        this.revivers = revivers;
    }
}
