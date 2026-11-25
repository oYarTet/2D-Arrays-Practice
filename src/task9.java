import java.util.Scanner;
public class task9 {
    void main(){
        Scanner scan = new Scanner(System.in);
        int[][] mtx = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        task7.prntmtx(mtx);
        System.out.print("Element to match: ");
        int n=scan.nextInt();
        int ni=-1 , nj=-1;
        for(int i=0 ; i<mtx.length ; i++){
            for(int j=0 ; j<mtx[i].length ; j++) {
                if (mtx[i][j] == n) {
                    ni = i+1;
                    nj = j+1;
                    break;
                }
            }
            if(ni>=0)break;
        }
        if(ni>=0){
            System.out.println("Position is:");
            System.out.println("Row: "+ni);
            System.out.println("Column: "+nj);
        }else System.out.println("Not found");

    }
}
