void main(){
    System.out.println();

    int[][] mtx = {
            {2,7,3,9},
            {1,5,6,8},
            {4,-58,5,10},
            {56,3,99,0}
    };
    int mx=mtx[0][0],
        mn=mtx[0][0];
    for(int i=0 ; i< mtx.length ; i++){
        for (int j=0 ; j<mtx[i].length ; j++){
            System.out.print(mtx[i][j]+" ");
            if (mtx[i][j]>mx)mx=mtx[i][j];
            else if(mtx[i][j]<mn)mn=mtx[i][j];
        }
        System.out.println();
    }
    System.out.println();

    System.out.println("Smallest: "+mn);
    System.out.println("Largest: "+mx);
}