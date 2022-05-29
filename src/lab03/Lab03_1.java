package lab03;

public class Lab03_1 {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        int countEvenNumber =0;
        int countOddNumber =0;
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]%2 ==0){
                 countEvenNumber++;
            }else {
                countOddNumber++;
            }
        }
        System.out.printf("Even numbers:%d\n", countEvenNumber);
        System.out.printf("Odd numbers:%d\n", countOddNumber);
    }
}
