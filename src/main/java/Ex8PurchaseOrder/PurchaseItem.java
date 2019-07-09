package Ex8PurchaseOrder;

public class PurchaseItem {

    private String productName;
    private int psc;
    private double price;

    public PurchaseItem(final String productName, final int psc, final double price) {
        this.productName = productName;
        this.psc = psc;
        this.price = price;
    }

    public double getValue() {
        return getPrice()*getPsc();
    }

    public String getProductName() {
        return productName;
    }

    public int getPsc() {
        return psc;
    }

    public double getPrice() { return price;}

    @Override
    public String toString() {
        return "PurchaseOrderItem{" +
                "productName='" + productName + '\'' +
                ", psc=" + psc +
                ", price=" + price +
                '}';
    }
}
