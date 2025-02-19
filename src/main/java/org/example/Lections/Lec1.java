package org.example.Lections;

import java.io.File;

public class Lec1 {
    public Lec1() {
    }

    public int newDivide(int x, int y){
        if (y == 0){
            throw new RuntimeException("На 0 делить нельзя");
        }
        return x / y;
    }

    public void b(){
        a();
    }
    public void a(){
        arr(100);
    }

    public int arr(int i){
        int[] mas = new int[10];
        return mas[i];
    }

    public int divide(int x, int y){
        if (y == 0){
            return -1;
        }
        return x/y;
    }

    public static long getFileSize(File file){
        if (!file.exists()){
            return -1l;
        }
        return file.length();
    }
}
