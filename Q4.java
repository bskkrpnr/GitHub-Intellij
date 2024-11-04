package homework;

public class Q4 {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,45,55},
                {11,18,33,40,50},
                {3,20,921,2,505}
        };
        int evenSum=0;
        int oddSum=0;
        for (int[]row:numbers){
            for (int n:row){
                if(n%2==0){
                    evenSum=evenSum+n;
                }else {
                    oddSum=oddSum+n;
                }
            }
        }
        System.out.println("Sum of even numbers "+evenSum);
        System.out.println("Sum of odd numbers "+oddSum);
    }
}
