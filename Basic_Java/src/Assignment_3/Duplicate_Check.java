package Assignment_3;
import java.util.Arrays;

public class Duplicate_Check {
    public static void dup(int[] array) {
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                    isExist = true;
                }
            }
        }
        if (isExist == false) System.out.println("No Duplicates");
    }

    public static void main(String[] args) {
        int[] myArray = {11, 5, 5, 91, 9};
        dup(myArray);
    }
}