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
    private String[] fillings = {"Cucumber", "Avocado", "Shrimp", "Crab", "Spicy tuna"};
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
        Utility.station1();
        System.out.println("Want to take their order? (y) Or would you like to go to the next station? (n)");
        String ans = scan.nextLine().toLowerCase();
        if(!(ans.equals("y"))) {
            System.out.println("You can't go to the next station without having an order to make, you idiot!");
        }
        generateOrder();
        System.out.println(printOrder());
        station2();
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
        String[][] sushi2 = new String[9][20];
        String[][] drink2 = new String[9][20];
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
        while(!ans.equals("white") && !ans.equals("brown")) {
            System.out.println("That is not a valid answer. You must input brown/white for brown or white rice.");
            System.out.println("Brown rice, or white rice?");
            ans = scan.nextLine().toLowerCase();
        }
        if(ans.equals("brown")) {
            sushi2=Utility.sushiBrownRice();
        } else if(ans.equals("white")) {
            sushi2=Utility.sushiWhiteRice();
        }
        System.out.println("Great! Step 2: Filling");
        System.out.println("Filling 1: " + s.getFilling1() + " Filling 2: " +s.getFilling2());
        System.out.println("Fillings list: ");
        for(int i=0; i<fillings.length; i++) {
            System.out.print(fillings[i] + ", ");
        }
        System.out.println("What filling would you like to use?");
        ans = scan.nextLine().toLowerCase();
        while(!ans.equals("crab") && !ans.equals("shrimp") && !ans.equals("spicy tuna")
                && !ans.equals("avocado") && !ans.equals("cucumber")) {
            System.out.println("You have to choose a filling from the list.");
            System.out.println("Fillings list: ");
            for(int i=0; i<fillings.length; i++) {
                System.out.print(fillings[i] + ", ");
            }
            System.out.println("What filling would you like to use?");
            ans = scan.nextLine().toLowerCase();
        }
        filling1 = ans;
        if(ans.equals("crab")) {
            sushi2=Utility.fillings1(sushi2, "\uD83E\uDD80");
        } else if(ans.equals("shrimp")) {
            sushi2=Utility.fillings1(sushi2, "\uD83E\uDD90");
        } else if(ans.equals("spicy tuna")) {
            sushi2=Utility.fillings1(sushi2, "\uD83D\uDC1F");
        } else if(ans.equals("avocado")) {
            sushi2=Utility.fillings1(sushi2, "\uD83E\uDD51");
        } else {
            sushi2=Utility.fillings1(sushi2, "\uD83E\uDD52");
        }
        System.out.println("What is the second filling?");
        ans = scan.nextLine().toLowerCase();
        while(!ans.equals("crab") && !ans.equals("shrimp") && !ans.equals("spicy tuna")
                && !ans.equals("avocado") && !ans.equals("cucumber")) {
            System.out.println("You have to choose a filling from the list.");
            System.out.println("Fillings list: ");
            for(int i=0; i<fillings.length; i++) {
                System.out.print(fillings[i] + ", ");
            }
            System.out.println("What filling would you like to use?");
            ans = scan.nextLine().toLowerCase();
        }
        filling2 = ans;
        if(ans.equals("crab")) {
            sushi2=Utility.fillings2(sushi2, "\uD83E\uDD80");
        } else if(ans.equals("shrimp")) {
            sushi2=Utility.fillings2(sushi2, "\uD83E\uDD90");
        } else if(ans.equals("spicy tuna")) {
            sushi2=Utility.fillings2(sushi2, "\uD83D\uDC1F");
        } else if(ans.equals("avocado")) {
            sushi2=Utility.fillings2(sushi2, "\uD83E\uDD51");
        } else {
            sushi2=Utility.fillings2(sushi2, "\uD83E\uDD52");
        }
        System.out.println("All done with the sushi! Now the drinks:");
        System.out.println("----------------------");
        System.out.println("Step 1: Size");
        System.out.println("Size needed: " + d.getSize());
        System.out.println("Small, Medium, or Large?");
        ans = scan.nextLine().toLowerCase();
        while(!ans.equals("small") && !ans.equals("large") && !ans.equals("medium")) {
            System.out.println("You need to enter small, medium, or large.");
            System.out.println("Small, Medium, or Large?");
            ans = scan.nextLine().toLowerCase();
        }
        size=ans;
        if(ans.equals("small")) {
            drink2 = Utility.smallDrink();
        } else if(ans.equals("medium")) {
            drink2 = Utility.mediumDrink();
        } else {
            drink2 = Utility.largeDrink();
        }
        System.out.println("Cool! Step 2: Drink type");
        System.out.println("Customer wants: " + d.getDrinkType());
        System.out.println("Does the customer want tea, or juice?");
        ans = scan.nextLine().toLowerCase();
        while(!ans.equals("tea") && !ans.equals("juice")) {
            System.out.println("You must enter tea or juice.");
            System.out.println("Does the customer want tea, or juice?");
            ans = scan.nextLine().toLowerCase();
        }
        type=ans;
        System.out.println("Last step: What flavor?");
        System.out.println("Customer wants: " + d.getFlavor());
        System.out.println("Flavors list: ");
        for(int i=0; i<flavors.length; i++) {
            System.out.print(flavors[i] + ", ");
        }
        System.out.println("Choose a flavor.");
        ans = scan.nextLine().toLowerCase();
        while(!ans.equals("mango") && !ans.equals("strawberry") && !ans.equals("cherry")) {
            System.out.println("You must enter a flavor from the flavors list.");
            System.out.println("Flavors list: ");
            for(int i=0; i<flavors.length; i++) {
                System.out.print(flavors[i] + ", ");
            }
            System.out.println("Choose a flavor.");
            ans = scan.nextLine().toLowerCase();

        }
        if(ans.equals("mango")) {
            flavor = "\uD83D\uDFE0";
        } else if(ans.equals("strawberry")) {
            flavor = "\uD83D\uDD34";
        } else {
            flavor = "\uD83D\uDD34";
        }
        Utility.flavorDrink(drink2, size, flavor);
        flavor=ans;
        System.out.println("All done now!");
        moneyMade=moneyMade+o.getPrice();
        score1 = scoringSushi(rice, filling1, filling2);
        score2 = scoringDrink(size, type, flavor);
        station3(score1, score2);
    }
    public void station3(int s1, int s2) {
        // highest score 8
        int score=s1+s2;
        if(score==8) {
            Utility.happyFace();
            System.out.println("PERFECT!! You got a perfect score on this order! \uD83D\uDE01");
        } else if(score>=5 && score<=7) {
            Utility.happyFace();
            System.out.println("EXCELLENT! You did good! \uD83D\uDE42");
        } else if(score>=3 && score<=4) {
            Utility.normalFace();
            System.out.println("Nice. You  made a couple mistakes, but that's okay. \uD83D\uDE10");
        } else if(score>=1 && score<=2) {
            Utility.irritatedFace();
            System.out.println("TERRIBLE! You messed up A LOT of the customer's order! \uD83D\uDE21");
        } else {
            Utility.angryFace();
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
            filling1="Shrimp";
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
        Drinks drink = new Drinks(p, numOfOrders, size, type, flavor);
        Sushi sushi = new Sushi(p, numOfOrders, filling1, filling2, rice);
        this.drink.add(drink);
        this.sushi.add(sushi);
    }
    private int scoringSushi(String rice, String filling1, String filling2) {
        // sushi, max score 4
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
        build=build+score;
        return score;
    }
    public int scoringDrink(String size, String type, String flavor) {
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
    private String printOrder() {
       Sushi s = sushi.get(0);
       Drinks d = drink.get(0);
       Order o = orders.get(0);
       String ord = "";
       ord = ord + "Order number: " + o.getNumber() + "\nPrice: " + o.getPrice();
       ord = ord + "\nSushi: " + "\nRice type: " + s.getRice() + "\nFilling 1: " + s.getFilling1() +
               " Filling 2: " + s.getFilling2();
       ord = ord + "\nDrink: \nDrink size: " + d.getSize() + "\nDrink type: " + d.getDrinkType() + "\nFlavor: " + d.getFlavor();

        return ord;
    }
}