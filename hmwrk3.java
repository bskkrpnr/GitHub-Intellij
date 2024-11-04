package homework;

public class hmwrk3 {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,45,55},
                {11,18,33,40,50},
                {3,20,921,2,505}
        };
        for (int[]row:numbers){
            for (int n:row){
                if(n%2==0){
                    System.out.println(n);
                }
            }
        }
    }
}
