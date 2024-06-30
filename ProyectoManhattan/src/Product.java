public class Product {
    private String code;
    private String name;
    private String description;
    private double salePrice;
    private double purchasePrice;
    private int stock;

    public Product() {
    }

    public Product(String code, String name, String description, double salePrice, double purchasePrice, int stock) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", salePrice=" + salePrice +
                ", purchasePrice=" + purchasePrice +
                ", stock=" + stock +
                '}';
    }
}
