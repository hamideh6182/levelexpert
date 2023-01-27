package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

     String sentence = backwardsSentence();
        System.out.println(sentence);
        int[] array = new int[]{6,2,8,3,9,6};
        sortArray(array);

        String toArray = "tomato,potatoes,milk,butter,cheese,loaf";
        stringToArray(toArray);

        int number = 876;
        System.out.println("checksum : " + checksum(number));

        for (int i = 1;i<=100;i++) {
            System.out.println("i="+i+" -> "+RomanNumerals(i));
        }

    }

    public static String backwardsSentence(){

        System.out.println("Please give a sentence : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = new StringBuffer(sentence).reverse().toString();
        return "backwards sentence : " + sentence;
    }

    public static void sortArray(int[] array){
        System.out.println("The original array : ");
        for(int num : array){
            System.out.println(num + " ");
        }
        Arrays.sort(array);
        System.out.println("The sorted array : ");
        for (int num : array) {
            System.out.println(num + " ");
        }

    }

    public static void stringToArray(String s){
        List<String> array = new ArrayList<>();
        array.add(Arrays.toString(s.split(",")));
        for (String word: array) {
            System.out.println(" word : " + word);
        }

    }

    public static int checksum(int number){
        if(number <= 9){
            return  number;
        }else {
            return number % 10 + checksum(number/10);
        }
    }

    public static String RomanNumerals(int Int) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}