public class Main {
    public static void main(String[] args) {
        String[][] same = new String[9][20];
        for(int i=0; i<same.length; i++) {
            for(int j=0; j<same[0].length; j++) {
                same[i][j]="h";
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
        // Game g = new Game();

    }
}
