package homework;

public class Q8 {
    public static void main(String[] args) {
        int[] array={10,23,5,47,65,98};
        int temp,size;
        size= array.length;
        for(int i=0;i< size;i++){
            for(int j=i+1;j< size;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The second larger number is: "+array[size-2]);
    }
}
