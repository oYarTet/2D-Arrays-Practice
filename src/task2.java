void prntmtx(int[][] mtx){
    for(int i=0 ; i<mtx.length ; i++){
        for (int j=0 ; j<mtx[i].length ; j++){
            System.out.print(mtx[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}
void main(){
    System.out.println();

    int[][] mtx = new int[2][3];
    int cn=1;
    for (int i=0 ; i<mtx.length ; i++){
        for (int j=0 ; j<mtx[i].length ; j++){
            mtx[i][j]=cn*5;
            cn++;
            System.out.print(mtx[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    mtx[0][1]=99;
    prntmtx(mtx);
}