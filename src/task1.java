void main(){
    System.out.println();

    int[][] mtx = new int[3][3];
    int cn=1;
    for(int i=0 ; i< mtx.length ; i++){
        for(int j=0 ; j<mtx[i].length ; j++){
            mtx[i][j]=cn;
            System.out.print(mtx[i][j]+" ");
            cn++;
        }
        System.out.println();
    }
}