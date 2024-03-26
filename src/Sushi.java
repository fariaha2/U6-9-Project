public class Sushi extends Order{
    private Boolean riceInOut;
    private int numOfCuts;
    public Sushi(double p, Boolean r) {
        super(p);
        riceInOut=r;
    }
}
