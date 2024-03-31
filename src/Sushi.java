public class Sushi extends Order{
    private double price;
    private Boolean riceInOut;
    private int numOfCuts;
    private String filling1;
    private String filling2;
    private String topping;
    private boolean cooked;
    private String rice;

    public Sushi(double p,int n, Boolean r, boolean c, String filling1, String filling2, String topping, int cuts, String rice) {
        super(p, n);
        riceInOut=r;
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.topping = topping;
        numOfCuts = cuts;
        cooked = c;
        this.rice=rice;
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
    public String getRice() {
        return rice;
    }
    public int getNumOfCuts() {
        return numOfCuts;
    }
    public Boolean getRiceInOut() {
        return riceInOut;
    }
    public Boolean getCooked() {
        return cooked;
    }
}
