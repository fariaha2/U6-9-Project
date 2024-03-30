public class Drinks extends Order{
    private String size;
    private String drinkType;
    private String flavor;

    public Drinks(double p, String size, String drinkType, String flavor) {
        super(p);
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
