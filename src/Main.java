public class Main {
    public static void main(String[] args) {
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
       // Game g = new Game();

    }
}
