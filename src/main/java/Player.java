import java.util.Arrays;
import java.util.Scanner;

public class Player {


    public static void main(String args[]) {

        System.out.println("Inserisci il numero k:");

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int[] intArray = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Inserisci un numero:");
            Scanner inNumber = new Scanner(System.in);
            intArray[i] = inNumber.nextInt();
        }

        System.out.println(Arrays.toString(getIndexesArray(intArray, k)));



    }

    public static int[] getIndexesArray(int[] numbers, int k) {

        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length -1) {
                return result;
            }

            if (numbers[i] + numbers[i + 1] == k) {
                result[0] = i;
                result[1] = i+1;
                return result;
            }
        }

        return result;
    }

}
