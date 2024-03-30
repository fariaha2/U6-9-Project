public class Sushi extends Order{
    private double price;
    private Boolean riceInOut;
    private int numOfCuts;
    private String filling1;
    private String filling2;
    private String topping;

    public Sushi(double p, Boolean r, String filling1, String filling2, String topping, int cuts) {
        super(p);
        riceInOut=r;
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.topping = topping;
        numOfCuts = cuts;
    }
    public String getFilling1() {
        return filling1;
    }
    public String getFilling2() {
        return filling2;
    }
    public String getTopping() {
        return topping;
    }
    public int getNumOfCuts() {
        return numOfCuts;
    }
    public Boolean getRiceInOut() {
        return riceInOut;
    }
}
