package com.yide.pojo;

public class Run {
    public static void main(String[] args) {
        String pattern = "ababcabaa";
        String text = "abababcabaababcabaa";

        Kmp kmp = new Kmp();

        System.out.println(kmp.KmpMatch(text, pattern));
    }
}
