import java.util.Scanner;
public class task8 {

    void main(){
        Scanner scan = new Scanner(System.in);

        int[][] mtx = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("\t : ");
        int n = scan.nextInt();

        task7.prntmtx(mtx);
        int lg=0;
        for(int[] x : mtx){
            for(int y : x){
                if(y>n)lg++;
            }
        }
        System.out.println("Larger "+lg+" numbers");
    }
}
