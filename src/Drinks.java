public class Drinks extends Order{
    private String size;
    private String drinkType;
    private String flavor;

    public Drinks(double p, int n, String size, String drinkType, String flavor) {
        super(p, n);
        this.size=size;
        this.drinkType=drinkType;
        this.flavor=flavor;
    }
    @Override
    public double getPrice() {
        return super.getPrice()*0.25;
    }
    public String getSize() {
        return size;
    }
    public String getDrinkType() {
        return drinkType;
    }
    public String getFlavor() {
        return flavor;
    }
}