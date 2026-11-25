public class task11 {
    void main(){
        int[][] mtx = {
                {-1,2,-3},
                {4,5,-6},
                {7,-8,9}
        };

        task7.prntmtx(mtx);

        for(int i=0 ; i< mtx.length ; i++){
            for(int j=0 ; j<mtx[i].length ; j++){
                if(mtx[i][j]<0)mtx[i][j]=0;
            }
        }

        task7.prntmtx(mtx);
    }
}
