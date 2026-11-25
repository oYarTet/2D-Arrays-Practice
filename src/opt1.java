public class opt1 {
    void main(){
        int[][] mtx = {
                {10,2,14,22},
                {15,15,15,15},
                {33,12,9,5}
        };

        task7.prntmtx(mtx);
        int lrsum=0,lridx=0;
        for(int i=0 ; i< mtx.length ; i++){
            int rsum=0;

            for(int x : mtx[i]){
                rsum+=x;
            }

            if(rsum>lrsum){
                lrsum=rsum;
                lridx=i+1;
            }
        }

        System.out.println("Row #"+lridx+" has largest sum, which is "+lrsum);
    }
}
