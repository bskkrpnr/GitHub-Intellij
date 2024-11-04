package homework;

public class Q9 {
    public static void main(String[] args) {
        String[] myArray={"abc","abd","bcd","abc","def"};
        for(int i=0;i< myArray.length;i++){
            for(int j=i+1;j< myArray.length;j++){
                if(myArray[i].equals(myArray[j])&&(i!=j)){
                    System.out.println("Duplicate element is: "+myArray[j]);
                }
            }
        }
    }
}
