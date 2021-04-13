package com.Ecom;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        // Guess the word.
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {
        //Write your code here!
        int c = 3;
        int flag=0;
        char s1[] = s.toCharArray();
        for(int i=0 ; i< s.length() ; i++){
            if(s1[i]!='A' && s1[i]!='E'&& s1[i]!='I' && s1[i]!='O' && s1[i]!='U'){
                s1[i]= '_';
                c++;
            }
        }
        for(int i=0 ; i < c ;c--){
            flag=0;
            System.out.print("WORD :");
            for(int j=0 ; j< s.length() ; j++){
                System.out.print(s1[j]);
            }
            System.out.println();
            System.out.println("CHANCES :"+c);
            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter the guess=");
            char a = sc.next().charAt(0);
            if(s.indexOf(a)!=-1){
                int t = 0;
                for(int z=0 ; z<s.length() ; z++){
                    if(s.charAt(z)==a){
                        s1[z]=a;
                        t++;
                    }
                }
                System.out.println("Character found "+t+" times" );
            }
            else{
                System.out.println("Character not found");
            }
            for(int z=0 ; z<s.length() ; z++){
                if(s1[z]=='_'){
                    flag=1;
                }}
            if(flag==0){
                System.out.println("You Win");
                break;
            }

        }
        if(flag==1){
            System.out.println("You Lose!!");
        }

    }
}
