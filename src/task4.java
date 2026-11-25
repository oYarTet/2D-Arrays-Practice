void main(){
    System.out.println();

    int[][] mtx = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int ev=0, od=0;
    for(int i=0 ; i<mtx.length ; i++){
        for (int j=0 ; j<mtx[i].length ; j++){
            if(mtx[i][j]%2==0)ev++;
            else od++;
            System.out.print(mtx[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    System.out.println("Even: "+ev);
    System.out.println("Odd: "+od);
}