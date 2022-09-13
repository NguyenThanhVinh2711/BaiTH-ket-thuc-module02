package model;

public class Product implements Comparable<Product> {
    private String productId;
    private String nameProduct;
    private double priceProduct;
    private int amount;
    private String describe;

    public Product() {
    }

    public Product(String productId, String nameProduct, double priceProduct, int amount, String describe) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amount = amount;
        this.describe = describe;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", amount=" + amount +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
