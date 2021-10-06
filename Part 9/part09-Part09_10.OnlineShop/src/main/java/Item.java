public class Item {
    private String name;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return qty * unitPrice;
    }

    public void increaseQuantity() {
        qty++;
    }

    public String toString() {
        return name +": " + qty;
    }
}
