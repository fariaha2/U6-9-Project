public class Sushi extends Order{
    private Boolean riceInOut;
    private int numOfCuts;
    public Sushi(double p, Boolean r) {
        super(p);
        riceInOut=r;
    }
    public static String riceType() {
        int rand = (int) (Math.random()*2)+1;
        if(rand==1) {
            return "Brown rice";
        } else {
            return "White rice";
        }
    }
    public static String filling() {
        return "f";
    }
}
