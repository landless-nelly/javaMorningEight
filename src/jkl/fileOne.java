package jkl;

import jdk.nashorn.internal.ir.CatchNode;

public class fileOne {
    public static void main(String[] args) {
        try {
            String[] majina = {"nelly", "ndunge", "wambua", "natalie"};
            System.out.println(majina[5]);
        } catch (Exception e) {
            System.out.println("hapo ni noma" + e);
        }
    }
}
