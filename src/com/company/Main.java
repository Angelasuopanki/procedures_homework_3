package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,3,54, 1243, 776,938};
        System.out.println(contains(a, 1298));


    }
    static boolean contains (int[] array, int value){
        boolean cont= false;
        for (int i= 0; i < array.length; i++){
            if (value==array[i])
                cont= true;

        }
        return cont;
    }
}
