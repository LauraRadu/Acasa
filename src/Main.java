public class Main {
    public static void main(String[] args) {
         int[] arrayOfNumbers = {1,3,5,7,20};
         double sum = 0.0;
         for(int i = 0; i<arrayOfNumbers.length; i++) {
             sum += arrayOfNumbers[i];
        }
        System.out.println("Media aritmetica este: " + sum/arrayOfNumbers.length);
    }
}
