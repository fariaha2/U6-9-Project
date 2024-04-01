public class Sushi extends Order{
    private double price;
    private String filling1;
    private String filling2;
    private String rice;

    public Sushi(double p,int n, String filling1, String filling2, String rice) {
        super(p, n);
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.rice=rice;
    }
    public String getFilling1() {
        return filling1;
    }
    public String getFilling2() {
        return filling2;
    }
    public String getRice() { return rice; }

}
