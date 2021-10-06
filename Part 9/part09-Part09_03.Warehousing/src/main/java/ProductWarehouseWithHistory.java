public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory wHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        wHistory = new ChangeHistory();
        wHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return wHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        wHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        wHistory.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + wHistory.toString());
        System.out.println("Largest amount of product: " + wHistory.maxValue());
        System.out.println("Smallest amount of product: " + wHistory.minValue());
        System.out.println("Average: " + wHistory.average());
    }

}
