package com.Ecom;

public class StringPlay {
    public static void main(String[] args) {
        // Modify 2 with R , 3 with S .. according to replacements
        System.out.println(modify("12332321", "2R3S1T4D"));
    }

    private static String modify(String s, String replacements) {
        //Write your code here!
        char st[]=s.toCharArray();
        char re[] = replacements.toCharArray();
        for(int i=0;i<replacements.length();i=i+2){
            for (int j=0 ; j<s.length();j++){
                if(re[i]==st[j]){
                    st[j]=re[i+1];
                }
            }
        }
        String str=String.valueOf(st);
        System.out.println(str);
        return null;
    }
}
