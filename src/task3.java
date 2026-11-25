void main(){
    System.out.println();

    int[][] mtx = {
            {1, 2, 3},
            {4, 5, 6}
    };
    int sum=0;
    for(int i=0 ; i< mtx.length ; i++){
        for(int j=0 ; j<mtx[i].length ; j++){
            System.out.print(mtx[i][j]+" ");
            sum+=mtx[i][j];
        }
        System.out.println();
    }
    System.out.println();
    System.out.println(sum);
}