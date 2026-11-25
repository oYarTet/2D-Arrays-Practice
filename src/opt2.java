public class opt2 {
    void main(){
        int[][] mtx = {
                {1,2,3},
                {4,5,6}
        };

        task7.prntmtx(mtx);

        int[][] trn = new int[mtx[0].length][mtx.length];
        for (int i=0 ; i< trn.length ; i++){
            for (int j=0 ; j< trn[i].length ; j++){
                trn[i][j]=mtx[j][i];
            }
        }
        task7.prntmtx(trn);
    }
}
