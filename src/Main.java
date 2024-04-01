public class Main {
    public static void main(String[] args) {
        String[][] same = new String[9][20];
        for(int i=0; i<same.length; i++) {
            for(int j=0; j<same[0].length; j++) {
                same[i][j]="h";
            }
        }
        for(int i=0; i<same[0].length; i++) {
            same[0][i]="-";
            same[8][i]="-";
        }
        for(int i=5; i<14; i++) {
            same[1][i]="-";
        }
        same[1][4]="/";
        same[1][14]="\\";
        same[2][3]="/";
        same[2][15]="\\";
        for(int i=0; i<same.length; i++) {
            for(int j=0; j<same[0].length; j++) {
                System.out.print(same[i][j]);
            }
            System.out.println();
        }
        // Game g = new Game();

    }
}
