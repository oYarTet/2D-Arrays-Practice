public class task12 {
    void main(){
        int[][] mtx = {
                {99,73,86,95},
                {67,59,72,64},
                {31,22,28,54}
        };
        task7.prntmtx(mtx);

        double tavg=0;
        int mx=mtx[0][0];
        for(int i=0 ; i<mtx.length ; i++){
            double savg=0;
            for(int j=0 ; j<mtx[i].length ; j++){
                savg+=mtx[i][j];
                if(mtx[i][j]>mx)mx=mtx[i][j];
            }
            tavg+=savg;
            savg/=4;
            System.out.println("Student #"+(i+1)+"'s average is: "+savg);
        }
        System.out.println("Max grade is: "+mx);
        tavg/=12;
        System.out.println("Total average is: "+tavg);

    }
}
