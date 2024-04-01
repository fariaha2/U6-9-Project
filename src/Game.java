import java.util.Scanner;
import java.util.ArrayList;
public class Game {
    private Boolean customer=true;
    private double moneyMade;
    private int customersServed=0;
    private int timing=0;
    private int build=0;
    private int drinks=0;
    private int numOfOrders=0;
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Drinks> drink = new ArrayList<>();
    private ArrayList<Sushi> sushi = new ArrayList<>();
    private String[] fillings = {"Cucumber", "Avocado", "Salmon", "Crab", "Spicy tuna"};
    private String[] flavors = {"Mango", "Strawberry", "Cherry"};
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
            station1();
            System.out.println("Want to move on to the next station? (y/n)");
            ans = scan.nextLine();
            if(ans.equals("y")) {
                station2();
            }
        }
        /*  if() {
                System.out.println("Money made: " + moneyMade());
                System.out.println("Timing: " + timing + "/5");
                System.out.println("Build: " + build/customersServed + "/5");
                System.out.println("Drinks: " + drinks/customersServed + "/5");
                System.out.println("Want to play again?");
                ans = scan.nextLine().toLowerCase();
                if(ans.equals("yes") {
                }
        */
        System.out.println("Goodbye!");
        }
    public void station1() {
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
    public void station2() {
        int score1;
        int score2;
        String size;
        String type;
        String flavor;
        String rice;
        String filling1;
        String filling2;
        String topping;
        Scanner scan = new Scanner(System.in);
        String ans="";
        Order o = orders.get(0);
        Sushi s = sushi.get(0);
        Drinks d = drink.get(0);
        System.out.println("It's time to make sushi!");
        System.out.println("Step 1: Rice");
        System.out.println("Rice type: " + s.getRice());
        System.out.println("What type of rice should be used? Brown or white? (brown/white)");
        ans = scan.nextLine().toLowerCase();
        rice = ans;
        while(!ans.equals("w") && !ans.equals("b")) {
            System.out.println("That is not a valid answer. You must input brown/white for brown or white rice.");
            System.out.println("Brown rice, or white rice?");
            ans = scan.nextLine().toLowerCase();
        }
        if(ans.equals("b")) {
            // print
        } else if(ans.equals("w")) {
            // print
        }
        System.out.println("Great! Step 2: Filling");
        System.out.println("Filling 1: " + s.getFilling1() + "Filling 2: " +s.getFilling2());
        System.out.println("Fillings list: ");
        for(int i=0; i<fillings.length; i++) {
            System.out.print(fillings[i] + ", ");
        }
        System.out.println("What filling would you like to use?");
        ans = scan.nextLine().toLowerCase();
        filling1 = ans;
        System.out.println("What is the second filling?");
        ans = scan.nextLine().toLowerCase();
        filling2 = ans;
        // print
        System.out.println("Nice! Step 3: Topping");
        // toppings list
        System.out.println("What topping would you like to use?");
        ans = scan.nextLine().toLowerCase();
        topping = ans;
        //print
        System.out.println("Last step now: Cutting");
        System.out.println("The customer wanted " + s.getNumOfCuts() + " cuts.");
        // print
        System.out.println("All done with the sushi! Now the drinks:");
        score1 = scoring(rice, filling1, filling2, topping);
        System.out.println("----------------------");
        System.out.println("Step 1: Size");
        System.out.println("Size needed: " + d.getSize());
        System.out.println("Small, Medium, or Large?");
        ans = scan.nextLine().toLowerCase();
        size=ans;
        System.out.println("Cool! Step 2: Drink type");
        System.out.println("Customer wants: " + d.getDrinkType());
        System.out.println("Does the customer want tea, or juice?");
        ans = scan.nextLine().toLowerCase();
        type=ans;
        System.out.println("Last step: What flavor?");
        System.out.println("Customer wants: " + d.getFlavor());
        System.out.println("Flavors list: ");
        for(int i=0; i<flavors.length; i++) {
            System.out.print(flavors[i] + ", ");
        }
        System.out.println("Choose a flavor.");
        ans = scan.nextLine().toLowerCase();
        flavor=ans;
        System.out.println("All done now!");
        moneyMade=o.getPrice();
        score2 = scoring(size, type, flavor);
        station3(score1, score2);
    }
    public void station3(int s1, int s2) {
        if(s1==4 && s2==5) {
            // print
            System.out.println("PERFECT!! You got a perfect score on this order! \uD83D\uDE01");
        } else if(s1==3 && s2==4) {
            // print
            System.out.println("EXCELLENT! You did good! \uD83D\uDE42");
        } else if(s1==2 && s2==3) {
            // print
            System.out.println("Nice. You  made a couple mistakes, but that's okay. \uD83D\uDE10");
        } else if(s1==1 && s2==2) {
            // print
            System.out.println("TERRIBLE! You messed up A LOT of the customer's order! \uD83D\uDE21");
        } else {
            // print
            System.out.println("HORRENDOUS! You got EVERYTHING WRONG!! \uD83E\uDD2C");
        }
    }
    private void generateOrder() {
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
        String topping="";
        Boolean inOut;
        p = (int) (Math.random()*35)+10;
        Order o = new Order(p, numOfOrders);
        orders.add(o);
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
        this.drink.add(drink);
        this.sushi.add(sushi);
    }
    private int scoring(String rice, String filling1, String filling2, String topping) {
        // sushi, max score 5
        int score=0;
        if(rice.toLowerCase().equals(sushi.get(0).getRice().toLowerCase())) {
            score=score+1;
        }
        if(filling1.toLowerCase().equals(sushi.get(0).getFilling1().toLowerCase())
                && filling2.toLowerCase().equals(sushi.get(0).getFilling2().toLowerCase())) {
            score=score+2;
        } else if(filling1.toLowerCase().equals(sushi.get(0).getFilling1().toLowerCase())
                || filling2.toLowerCase().equals(sushi.get(0).getFilling2().toLowerCase())) {
            score=score+1;
        }
        if(topping.toLowerCase().equals(sushi.get(0).getTopping().toLowerCase())) {
            score=score+1;
        }
        build=build+score;
        return score;
    }
    public int scoring(String size, String type, String flavor) {
        // drinks, max score 4
        int score=0;
        if(size.toLowerCase().equals(drink.get(0).getSize().toLowerCase())) {
            score=score+1;
        }
        if(type.toLowerCase().equals(drink.get(0).getDrinkType().toLowerCase())) {
            score=score+1;
        }
        if(flavor.toLowerCase().equals(drink.get(0).getFlavor().toLowerCase())) {
            score=score+1;
        }
        if(size.toLowerCase().equals(drink.get(0).getSize().toLowerCase())) {
            score=score+1;
        }
        drinks=drinks+score;
        return score;
    }
    private String printOrder(ArrayList<Order> order) {
       // ArrayList<Order> order = orders.get(orders.size()-1);

        String ord = "";
        ord = ord + "Order number: " + order.get(1).getNumber() + "\nPrice: " + order.get(1).getPrice();
        // ord = ord + "\nSushi: " + "\nFilling 1: " + order.get(3).getFilling1();

        return ord;
    }


}