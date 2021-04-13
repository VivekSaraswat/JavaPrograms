package com.Ecom;

public class Lexicographical {
    public static void main(String[] args) {
        // To sort an array in Lexicographical order
        String a[]={"Car","Apple","Boy","Ball","Cat"};
        for(int i=0 ; i<a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i].compareTo(a[j])>0){
                    String temp ;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(String str:a) {
            System.out.println(str);
        }
    }
}
