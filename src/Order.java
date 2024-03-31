public class Order {
    private double price=0;
    private int number=0;
    public Order(double p, int number) {
        price=p;
        this.number=number;
    }
    public double getPrice() {
        return price;
    }
    public int getNumber() {
        return number;
    }

}
