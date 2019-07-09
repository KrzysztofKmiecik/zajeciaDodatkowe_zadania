package Ex8PurchaseOrder;

public class Main {
    public static void main(String[] args) {

        PurchaseOrder purchaseOrder=new PurchaseOrder(2);
        purchaseOrder.addPurchaseItemToPurchaseOrder(new PurchaseItem("Apple",2,2.00));
        purchaseOrder.addPurchaseItemToPurchaseOrder(new PurchaseItem("Banana",1,6.00));

        System.out.println(purchaseOrder.toString());
        System.out.println(String.format("Total= %.2f PLN", purchaseOrder.countTotalPrice()));
    }
}
/*OUTPUT
 */
