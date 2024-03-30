import java.util.Scanner;
import java.util.ArrayList;
public class Game {
    private Boolean customer=true;
    private int customersServed=0;
    private int timing=0;
    private int cooking=0;
    private int build=0;
    private int drinks=0;
    private ArrayList<ArrayList> orders;
    public Game() {
        Start();
    }
    public void Start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the..");
        System.out.println("Do you need a tutorial? (y/n)");
        String ans = scan.nextLine().toLowerCase();
        if(ans.equals("y")) {
            System.out.println("You are supposed to take customer's orders and make food for them.");
            System.out.println("You will be assessed on how well you made the food and how much time it took.");
        }
        System.out.println("Good luck!");
        String play = "y";
        while(play.equals("y")) {
            Station1();
        }
        /*  if() {
                System.out.println("Timing: " + timing + "/5");
                System.out.println("Cooking: " + cooking + "/5");
                System.out.println("Build: " + build + "/5");
                System.out.println("Drinks: " + drinks + "/5");
                System.out.println("Want to play again?");
                ans = scan.nextLine().toLowerCase();
                if(ans.equals("yes") {
                }
        */
        System.out.println("Goodbye!");
        }
    public void Station1() {
        Scanner scan = new Scanner(System.in);
        int rand = (int) (Math.random()*2)+1;
        if(!customer) {
            if(rand==2) {
                customer=true;
            }
        }
        if(customer) {
            // print
            System.out.println("Want to take their order? (y) Or would you like to go to the next station? (n)");
            String ans = scan.nextLine().toLowerCase();
            if(ans.equals("y")) {
                // print
                generateOrder();
                // print
            } else {
                // next station

            }
        } else {
            Utility.station1();
            System.out.println("There are no customers yet. Come back later!");
        }
        System.out.println("Want to move on to the next station? (y/n)");
        String ans = scan.nextLine();
        if(ans.equals("y")) {
            Station2();
        }

    }
    public void Station2() {
        boolean food=true;
        if(food) {
            // print
        } else {
            System.out.println("There is nothing cooking right now. Go take some orders!");
        }
    }
    public void Station3() {
        // build

    }
    public void Station4() {
        // print
        System.out.println("The customer asked for x cuts on their sushi! Make the correct amount of cuts.");
        // cutting
    }
    private ArrayList<ArrayList> generateOrder() {
        String size;
        String type;
        String flavor;
        Boolean inOut;
        ArrayList<Order> order = new ArrayList<>();
        int rand = (int) (Math.random()*35)+10;
        Order o = new Order(rand);
        order.add(o);
        orders.add(order);
        rand = (int) (Math.random()*3)+1;
        if(rand==1) {
            size="Small";
        } else if(rand==2) {
            size="Medium";
        } else {
            size="Large";
        }
        rand = (int) (Math.random()*2)+1;
        if(rand==1) {
            type="Tea";
            inOut=true;
        } else {
            type="Juice";
            inOut=false;
        }

        return orders;
    }
}
