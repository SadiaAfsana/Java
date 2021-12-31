package com.company;
/*1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
  Find total price and total quantity using regular expression.*/

public class RegEx_Sum {
    public static void main(String[] args) {

        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double sharee_price = Double.parseDouble(arr[1]);
        double shirt_price = Double.parseDouble(arr[3]);
        double pant_price = Double.parseDouble(arr[5]);

        int sharee_qty = Integer.parseInt(arr[0]);
        int shirt_qty = Integer.parseInt(arr[2]);
        int pant_qty = Integer.parseInt(arr[4]);

        double totalp = sharee_price + shirt_price + pant_price;
        int totalq = sharee_qty + shirt_qty + pant_qty;

        System.out.println("Total price: " + totalp);
        System.out.println("Total Quantity: " + totalq);


    }
}
