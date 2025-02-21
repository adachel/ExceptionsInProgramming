package org.example.Seminars;

import java.util.Scanner;

public class Sem2 {
    public Sem2() {
    }

    public void task1(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = 0;
        if (!scanner.hasNext()){
            index = scanner.nextInt();
        }else {
            System.out.println("Ввели не число");
        }
        if (index > 10){
            System.out.println("не попадает в массив");
        }else {
            arr[index] = 1;
        }
//        try {
//            arr[index] = 1;
//        }catch (Exception e){
//            System.out.println("Указан индекс за пределами массива");
//        }
    }


}
