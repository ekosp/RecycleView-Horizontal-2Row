package com.ekosp.horizontalrecycleview;

/**
 * Created by Eko Setyo Purnomo on 10-Mar-18.
 * Find me on https://ekosp.com
 * Or email me directly to ekosetyopurnomo@gmail.com
 */

/**
 * Created by Sadruddin on 12/10/2017.
 */

public class Grocery {
    public int productImage;
    public String productName;

    public Grocery(String productName, int productImage) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}