package org.RamiOopsProject;

public class Task7 {

    public  static int countWords (String str){
        return str.split("\\W+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello, world!"));
    }
}
