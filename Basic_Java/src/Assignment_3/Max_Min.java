package Assignment_3;
//3. Find the max and min number from a given array

public class Max_Min {

    public static void main(String[] args) {
        int[] myArray = {-3, 0, 5, 9, 10};
        Max_Min m = new Max_Min();
        System.out.println("Maximum value: " + m.max(myArray));
        System.out.println("Minimum value: " + m.min(myArray));
    }

    public int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}