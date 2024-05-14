import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of integers: ");
        int count = 5; //Specify the count as 5

        int[] numbers = readIntegers(count);

        int min = findMin(numbers);
        System.out.println("Minimum element in the array: "+min);

        scanner.close();
    }

    public static int[] readIntegers(int count){
        System.out.println("Enter "+ count + "integer values. \r ");
        int[] counts = new int[count];

        for(int i = 0; i<count; i++){
            counts[i] = scanner.nextInt();
        }
        return counts;
    }

    public static int findMin(int[] numbers){
        //Assume the first element of the array as the minimum value
        int min = numbers[0];

        //Iterate through the array to find the minimum value
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
