package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer niz[] = new Integer[]{11, 12, 41, 12, 243, 42, 123};

        Arrays.sort(niz, (x, y) -> suma(x) - suma(y));

    }

    private static int suma(int x){
        int suma = 0;
        while(x > 0){
            suma +=  x % 10;
            x /= 10;
        }
        return suma;
    }
}
