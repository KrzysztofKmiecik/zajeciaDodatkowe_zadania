package Ex8PurchaseOrder;

public class PurchaseOrder {
    private PurchaseItem[] purchaseItems;
    private int maxVolumen;
    private int currentPosition;

    public PurchaseOrder(final int maxVolumen) {
        this.maxVolumen = maxVolumen;
        purchaseItems = new PurchaseItem[this.maxVolumen];
    }

    public PurchaseOrder() {
        this.maxVolumen = 10;
        purchaseItems = new PurchaseItem[this.maxVolumen];
    }

    public void addPurchaseItemToPurchaseOrder(PurchaseItem purchaseItem) {
        purchaseItems[currentPosition] = purchaseItem;
        currentPosition++;
    }

    public double countTotalPrice() {
        double totalPrice = 0.0;

        for (PurchaseItem purchaseItem : purchaseItems) {
            totalPrice += purchaseItem.getValue();
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        String str = "PurchaseOrder:\n";
        for (PurchaseItem poz : purchaseItems) {
            str += String.format("%s\t%.2fPLN\t%dszt.\t%.2fPLN\r\n",
                    poz.getProductName(), poz.getPrice(),
                    poz.getPsc(), poz.getValue());
        }
        return str;
    }


}
/*
PurchaseOrder:
Apple	2,00PLN	2szt.	4,00PLN
Banana	6,00PLN	1szt.	6,00PLN

Total= 10,00 PLN

Process finished with exit code 0
 */