public class Utility {
    public Utility() {}
    public static void station1 () {
        String[][] same = new String[9][20];
        for(int i=0; i<same.length; i++) {
            for(int j=0; j<same[0].length; j++) {
                same[i][j]=" ";
            }
        }
        for(int j=0; j<same[0].length; j++) {
            if(j<=5) {
                same[2][j]="-";
            }

            if(j==5) {
                int k=3;
                while(k<same.length) {
                    same[k][j]="|";
                    k++;
                    if(k==4) {
                        same[k][j-3]="0";
                        same[k][j+6]="0";
                    }
                    if(k==5) {
                        same[k][j-2]="-";
                        same[k][j-4]="-";
                        same[k][j+5]="-";
                        same[k][j+7]="-";
                        same[k+2][j-4]="/";
                        same[k+2][j-2]="\\";
                        same[k+2][j+5]="/";
                        same[k+2][j+7]="\\";
                    }
                    if(k==5 || k==6) {
                        same[k][j-3]="|";
                        same[k][j+6]="|";
                    }
                }
            }
            same[0][j]="-";
            same[same.length-1][j]="-";
        }
        for(int j=0; j<same.length; j++) {
            same[j][same[0].length-1]="|";

        }
        for(int i=0; i<same.length; i++) {
            for(int j=0; j<same[0].length; j++) {
                System.out.print(same[i][j]);
            }
            System.out.println();
        }
    }
    public static void happyFace() {
        String[][] happy = new String[9][20];
        for(int i=0; i<happy.length; i++) {
            for(int j=0; j<happy[0].length; j++) {
                happy[i][j]=" ";
            }
        }
        for(int i=0; i<happy[0].length; i++) {
            happy[0][i]="-";
            happy[8][i]="-";
        }
        for(int i=5; i<14; i++) {
            happy[1][i]="-";
            happy[7][i]="-";
        }
        happy[1][4]="/";
        happy[1][14]="\\";
        happy[7][4]="\\";
        happy[7][14]="/";
        for(int i=2; i<happy.length-2; i++) {
            happy[i][3]="|";
            happy[i][15]="|";
        }
        happy[3][6]="O";
        happy[3][12]="O";

        for(int i=5; i<14; i++) {
            happy[4][i]="_";
        }
        for(int i=7; i<12; i++) {
            happy[6][i]="_";
        }
        happy[5][5]="\\";
        happy[5][13]="/";
        happy[6][6]="\\";
        happy[6][12]="/";
        for(int i=0; i<happy.length; i++) {
            for(int j=0; j<happy[0].length; j++) {
                System.out.print(happy[i][j]);
            }
            System.out.println();
        }
    }
    public static void normalFace() {
        String[][] normal = new String[9][20];
        for(int i=0; i<normal.length; i++) {
            for(int j=0; j<normal[0].length; j++) {
                normal[i][j]=" ";
            }
        }
        for(int i=0; i<normal[0].length; i++) {
            normal[0][i]="-";
            normal[8][i]="-";
        }
        for(int i=5; i<14; i++) {
            normal[1][i]="-";
            normal[7][i]="-";
        }
        normal[1][4]="/";
        normal[1][14]="\\";
        normal[7][4]="\\";
        normal[7][14]="/";
        for(int i=2; i<normal.length-2; i++) {
            normal[i][3]="|";
            normal[i][15]="|";
        }
        normal[3][6]="O";
        normal[3][12]="O";
        for(int i=5; i<=13; i++) {
            normal[5][i]="-";
        }
        for(int i=0; i<normal.length; i++) {
            for(int j=0; j<normal[0].length; j++) {
                System.out.print(normal[i][j]);
            }
            System.out.println();
        }
    }
    public static void irritatedFace() {
        String[][] angry = new String[9][20];
        for(int i=0; i<angry.length; i++) {
            for(int j=0; j<angry[0].length; j++) {
                angry[i][j]=" ";
            }
        }
        for(int i=0; i<angry[0].length; i++) {
            angry[0][i]="-";
            angry[8][i]="-";
        }
        for(int i=5; i<14; i++) {
            angry[1][i]="-";
            angry[7][i]="-";
        }
        angry[1][4]="/";
        angry[1][14]="\\";
        angry[7][4]="\\";
        angry[7][14]="/";
        for(int i=2; i<angry.length-2; i++) {
            angry[i][3]="|";
            angry[i][15]="|";
        }
        angry[3][6]="O";
        angry[3][12]="O";
        angry[2][6]="\\";
        angry[2][12]="/";
        for(int i=5; i<=13; i++) {
            angry[5][i]="-";
        }
        for(int i=0; i<angry.length; i++) {
            for(int j=0; j<angry[0].length; j++) {
                System.out.print(angry[i][j]);
            }
            System.out.println();
        }
    }
    public static void angryFace() {
        // head
        String[][] angry = new String[9][20];
        for(int i=0; i<angry.length; i++) {
            for(int j=0; j<angry[0].length; j++) {
                angry[i][j]=" ";
            }
        }
        for(int i=0; i<angry[0].length; i++) {
            angry[0][i]="-";
            angry[8][i]="-";
        }
        for(int i=5; i<14; i++) {
            angry[1][i]="-";
            angry[7][i]="-";
        }
        angry[1][4]="/";
        angry[1][14]="\\";
        angry[7][4]="\\";
        angry[7][14]="/";
        for(int i=2; i<angry.length-2; i++) {
            angry[i][3]="|";
            angry[i][15]="|";
        }
        angry[3][6]="O";
        angry[3][12]="O";
        angry[2][6]="\\";
        angry[2][12]="/";
        for(int i=6; i<13; i++) {
            angry[4][i]="_";
        }
        for(int i=6; i<13; i++) {
            angry[6][i]="`";
        }
        angry[5][5]="/";
        angry[5][13]="\\";
        for(int i=0; i<angry.length; i++) {
            for(int j=0; j<angry[0].length; j++) {
                System.out.print(angry[i][j]);
            }
            System.out.println();
        }
    }
    public static String[][] sushiBrownRice() {
        String[][] sushi = new String[9][20];
        for(int i=0; i<sushi.length; i++) {
            for(int j=0; j<sushi[0].length; j++) {
                sushi[i][j]=" ";
            }
        }
        for(int i=0; i<sushi[0].length; i++) {
            sushi[0][i]="-";
            sushi[2][i]="-";
            sushi[8][i]="-";
            sushi[6][i]="-";
        }
        for(int i=3; i<6; i++) {
            for(int j=0; j<9; j++) {
                sushi[i][j]="\uD83D\uDFE4";
            }
        }
        for(int i=0; i<sushi.length; i++) {
            for(int j=0; j<sushi[0].length; j++) {
                System.out.print(sushi[i][j]);
            }
            System.out.println();
        }
        return sushi;

    }
    public static String[][] sushiWhiteRice() {
        String[][] sushi = new String[9][20];
        for(int i=0; i<sushi.length; i++) {
            for(int j=0; j<sushi[0].length; j++) {
                sushi[i][j]=" ";
            }
        }
        for(int i=0; i<sushi[0].length; i++) {
            sushi[0][i]="-";
            sushi[2][i]="-";
            sushi[8][i]="-";
            sushi[6][i]="-";
        }
        for(int i=3; i<6; i++) {
            for(int j=0; j<9; j++) {
                sushi[i][j]="⚪";
            }
        }
        for(int i=0; i<sushi.length; i++) {
            for(int j=0; j<sushi[0].length; j++) {
                System.out.print(sushi[i][j]);
            }
            System.out.println();
        }
        return sushi;
    }
    public static String[][] fillings1(String[][] s, String f) {
        s[3][7]=f;
        s[3][2]=f;
        s[4][4]=f;
        s[5][3]=f;
        for(int i=0; i<s.length; i++) {
            for(int j=0; j<s[0].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
        return s;
    }
    public static String[][] fillings2(String[][] s, String f) {
        s[4][0]=f;
        s[5][8]=f;
        s[3][5]=f;
        s[5][1]=f;
        s[4][6]=f;
        for(int i=0; i<s.length; i++) {
            for(int j=0; j<s[0].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
        return s;
    }
    public static String[][] smallDrink() {
        String[][] drink = new String[9][20];
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                drink[i][j]=" ";
            }
        }
        for(int i=0; i<drink[0].length; i++) {
            drink[0][i]="-";
            drink[8][i]="-";
        }
        for(int i=4; i<15; i++) {
            drink[4][i]="-";
        }
        for(int i=1; i<4; i++) {
            drink[i][9]="|";
        }
        for(int i=5; i<=6; i++) {
            drink[i][4]="|";
            drink[i][14]="|";
        }
        drink[7][5]="\\";
        drink[7][13]="/";
        for(int i=6; i<13; i++) {
            drink[7][i]="_";
        }
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                System.out.print(drink[i][j]);
            }
            System.out.println();
        }
        return drink;
    }
    public static String[][] mediumDrink()  {
        String[][] drink = new String[9][20];
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                drink[i][j]=" ";
            }
        }
        for(int i=0; i<drink[0].length; i++) {
            drink[0][i]="-";
            drink[8][i]="-";
        }
        for(int i=4; i<15; i++) {
            drink[3][i]="-";
        }
        for(int i=1; i<3; i++) {
            drink[i][9]="|";
        }
        for(int i=4; i<=6; i++) {
            drink[i][4]="|";
            drink[i][14]="|";
        }
        drink[7][5]="\\";
        drink[7][13]="/";
        for(int i=6; i<13; i++) {
            drink[7][i]="_";
        }
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                System.out.print(drink[i][j]);
            }
            System.out.println();
        }
        return drink;
    }
    public static String[][] largeDrink() {
        String[][] drink = new String[9][20];
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                drink[i][j]=" ";
            }
        }
        for(int i=0; i<drink[0].length; i++) {
            drink[0][i]="-";
            drink[8][i]="-";
        }
        for(int i=4; i<15; i++) {
            drink[2][i]="-";
        }
        for(int i=1; i<2; i++) {
            drink[i][9]="|";
        }
        for(int i=3; i<=6; i++) {
            drink[i][4]="|";
            drink[i][14]="|";
        }
        drink[7][5]="\\";
        drink[7][13]="/";
        for(int i=6; i<13; i++) {
            drink[7][i]="_";
        }
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                System.out.print(drink[i][j]);
            }
            System.out.println();
        }
        return drink;
    }
    /* public static String[][] flavorDrink(String[][] drink, String size, String f) {
        if(size.equals("large")) {
            for(int j=3; j<7; j++) {
                for(int i=5; i<9; i++ ) {
                    drink[j][i]=f;
                }
            }
        } else if(size.equals("medium")) {
            for(int j=4; j<7; j++) {
                for(int i=5; i<12; i++ ) {
                    drink[j][i]=f;
                }
            }
        } else {
            for(int j=5; j<7; j++) {
                for(int i=5; i<12; i++ ) {
                    drink[j][i]=f;
                }
            }
        }
        for(int i=0; i<drink.length; i++) {
            for(int j=0; j<drink[0].length; j++) {
                System.out.print(drink[i][j]);
            }
            System.out.println();
        }
        return drink;
    }

     */
}
