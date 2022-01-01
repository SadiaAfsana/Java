package com.company;

//Extract only transaction ID from the HTML

public class Extract_TxID {
    public static void main(String[] args) {
        String str = "<html>" +
                "<body>" +
                "<div> " +
                "<p>Transaction Successful</p> " +
                "<p>Trnx ID: TXN5164870 </p> " +
                "</div> " +
                "</body> " +
                "</html>";
        System.out.println(str.substring(str.indexOf("TXN"), 70));
    }
}
