public class task7 {
    public static void prntmtx(int[][] mtx){
        for(int i=0 ; i<mtx.length ; i++){
            for (int j=0 ; j<mtx[i].length ; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void main(){
        int cnt=1;
        int[][] mtx = new int[3][3];
        for(int i=0 ; i< mtx.length ; i++){
            for(int j=0 ; j<mtx[i].length ; j++){
                mtx[i][j]=cnt;
                cnt++;
            }
        }
        prntmtx(mtx);
        for(int i=0 ; i< mtx.length ; i++){
            int csum=0;
            for(int j=0 ; j<mtx[i].length ; j++){
                csum+=mtx[j][i];

            }
            System.out.println("Column #"+(i+1)+" sum:  "+csum);
        }
    }
}
