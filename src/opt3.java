public class opt3 {
    void main(){
        int[][] mtx1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] mtx2 = {
                {9,8,7},
                {6,5,4}
        };
        int[][] summtx = new int[2][3];

        for(int i=0 ; i<summtx.length ; i++){
            for(int j=0 ; j<summtx[i].length ; j++){
                summtx[i][j] = mtx1[i][j] + mtx2[i][j];
            }
        }
        task7.prntmtx(mtx1);
        System.out.println("+");
        task7.prntmtx(mtx2);
        System.out.println("=");
        task7.prntmtx(summtx);
    }
}
