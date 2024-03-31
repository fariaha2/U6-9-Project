import java.util.Scanner;
import java.util.ArrayList;
public class Game {
    private Boolean customer=true;
    private int customersServed=0;
    private int timing=0;
    private int cooking=0;
    private int build=0;
    private int drinks=0;
    private int numOfOrders=0;
    private ArrayList<ArrayList> orders = new ArrayList<>();
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
            System.out.println("Want to move on to the next station? (y/n)");
            ans = scan.nextLine();
            if(ans.equals("y")) {
                Station2();
            }
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
                generateOrder();
                // printOrder();
            }
        } else {
            Utility.station1();
            System.out.println("There are no customers yet. Come back later!");
        }

    }
    public void Station2() {
        ArrayList<Order> order = orders.get(0);

        System.out.println("It's time to make sushi!");
        System.out.println("Step 1: Filling");

    }
    private ArrayList<ArrayList> generateOrder() {
        // still incomplete
        numOfOrders++;
        int numOfCuts=0;
        int p=0;
        String rice;
        String size;
        String type;
        String flavor;
        String filling1;
        String filling2;
        String topping;
        Boolean inOut;
        ArrayList<Order> order = new ArrayList<>();
        p = (int) (Math.random()*35)+10;
        Order o = new Order(p, numOfOrders);
        order.add(o);
        int rand = (int) (Math.random()*3)+1;
        if(rand==1) {
            filling1="Crab";
            size="Small";
        } else if(rand==2) {
            filling1="Spicy Tuna";
            size="Medium";
        } else {
            filling1="Salmon";
            flavor="Mango";
            size="Large";
        }
        rand = (int) (Math.random()*2)+1;
        if(rand==1) {
            rice = "Brown";
            filling2="Avocado";
            type="Tea";
            flavor="Strawberry";
            inOut=true;
        } else {
            rice= "White";
            filling2="Cucumber";
            type="Juice";
            flavor="Cherry";
            inOut=false;
        }
        rand = (int) (Math.random()*8)+2;
        for(int i=2; i<=8; i++) {
            if(rand==i) {
                numOfCuts=rand;
            }
        }
        Drinks drink = new Drinks(p, numOfOrders, size, type, flavor);
        Sushi sushi = new Sushi(p, numOfOrders, inOut, false, filling1, filling2, topping, numOfCuts, rice);
        order.add(drink);
        order.add(sushi);
        orders.add(order);
        return orders;
    }
    private String printOrder(ArrayList<Order> order) {
       // ArrayList<Order> order = orders.get(orders.size()-1);

        String ord = "";
        ord = ord + "Order number: " + order.get(1).getNumber() + "\nPrice: " + order.get(1).getPrice();
        // ord = ord + "\nSushi: " + "\nFilling 1: " + order.get(3).getFilling1();

        return ord;
    }
}
