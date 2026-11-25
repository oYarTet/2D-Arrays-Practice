public class task10 {
    void main(){
        int[][] mtx = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        task7.prntmtx(mtx);
        int sum=0;
        for(int i=0 ; i< mtx.length ; i++){
            sum+=mtx[i][i];
        }
        System.out.println("Sum of main diagonal is: "+sum);
    }
}
