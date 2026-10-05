package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s == s1); // false
        System.out.println(s1 == s2); // true
    }
}