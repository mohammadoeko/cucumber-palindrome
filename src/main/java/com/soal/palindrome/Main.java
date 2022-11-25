package com.soal.palindrome;

public class Main {
    public static void main(String[] args) {
        String text = "Katak";

        String temp = "";
        for (int i = text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }

        if (text.toLowerCase().equals(temp.toLowerCase())) {
            System.out.println("Teks adalah polindrome");
        } else {
            System.out.println("Teks bukan polindrome");
        }
    }
}