import java.util.Scanner;
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
    Scanner scan = new Scanner(System.in);
    int[][] mtx = new int[3][4];

    for(int i=0 ; i<mtx.length ; i++){
        System.out.println("\t\tRow #"+(i+1)+" :");
        for(int j=0 ; j<mtx[i].length ; j++){
            System.out.print("Element #"+(j+1)+" :  ");
            mtx[i][j]=scan.nextInt();
        }
        System.out.println();
    }
    prntmtx(mtx);

}