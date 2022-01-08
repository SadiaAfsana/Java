package Assignment_3;
//2. Write a program to find if any element is duplicate. If duplicate, show the value.

public class Duplicate_Check {

    public static void main(String[] args) {
        int[] myArray = {11, 5, 5, 9, 9};
        dup(myArray);
    }

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

}