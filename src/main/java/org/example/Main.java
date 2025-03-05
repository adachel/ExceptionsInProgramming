package org.example;

import org.example.Homeworks.HWSEM1;
import org.example.Homeworks.HWSEM2;
import org.example.Lections.Lec1;
import org.example.Lections.Lec2;
import org.example.Seminars.Sem1;
import org.example.Seminars.Sem2;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // HomeWork 2

        HWSEM2 hwsem2 = new HWSEM2();
//        String data = "1975-04-30";
//        System.out.println(hwsem2.validateDate(data));

//        String s = "A man a plan a canal Panama";
//        hwsem2.palindrome(s);

//        String[] strings = new String[]{"banana","apple","cherry"};// Значение по умолчанию
//        hwsem2.sortStrings(strings);

        int[] array = new int[]{10, 20, 30, 40, 50};
        hwsem2.findAverage(array);

        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Sem2
//        Sem2 sem2 = new Sem2();
        // Task 3
//        HashMap<String, Integer> map = sem2.readData("TestTask2.txt");
//        sem2.writeData("TestTask2.txt", map);

//        String[][] arr = {{"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}};
//        sem2.task1();


        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Lec2 lec2 = new Lec2();
////        lec2.view();
////        lec2.tryCatch();
//        lec2.unreportedException();


        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        // HWSEM1
//        HWSEM1 hwsem1 = new HWSEM1();
//
//        // Первая попытка: корректный ввод
//        String[] strings = {"10", "20", "70"};
//        System.out.println(hwsem1.convertAndSum(strings));
//
//        // Вторая попытка: ввод с некорректным числом
//        String[] invalidStrings = {"10", "20", "abc"};
//        System.out.println(hwsem1.convertAndSum(invalidStrings));
//
//        // Третья попытка: сумма превышает лимит
//        String[] overLimitStrings = {"50", "60"};
//        System.out.println(hwsem1.convertAndSum(overLimitStrings));


        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Seminar 1
//        Sem1 sem1 = new Sem1();
//        int[][] arr = {{1, 0, 1}, {1, 1, 1}, {0 ,0, 0}};
//        if (sem1.checkArr(arr)){
//            System.out.println("кол-во совпадает");
//        }else {
//            System.out.println("не совпадает");
//        }

//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 3, 4};
//        try {
//            int[] result = sem1.summArr(arr1, arr2);
//            System.out.println(Arrays.toString(result));
//        }catch (IllegalArgumentException | IllegalAccessException e){
//            System.out.println(e.getMessage());
//        }

//        Integer[] arr = {1, 2, 4, null, null, 8};
//        sem1.checkArray(arr);

//        int[][] arr = {{1, 0, 1}, {1, 1, 1}, {0 ,0, 0}};
//        int result = sem1.sumArrTwo(arr);
//        if (result == -1){
//            System.out.println("Массив не квадратный");
//        }else if (result == -2){
//            System.out.println("Должны быть элементы 0 либо 1");
//        }else {
//            System.out.printf("Результат %d", result);
//        }
//        System.out.println(sem1.sumArr(arr));

//        int[] arr = new int[10];
//        System.out.println(sem1.methodOne(arr, 12));
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] arr = null;
//        int result = sem1.methodTwo(arr, 7, 16);
//        if (result == -1){
//            System.out.println("Не соответствует длина массива");
//        }else if (result == -2){
//            System.out.println("Искомый элемент не найден");
//        }else if (result == -3){
//            System.out.println("Массив не передан");
//        }else {
//            System.out.printf("Результат %d", result);
//        }


        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Lection 1
//        Lec1 lec1 = new Lec1();
//        lec1.newDivide(5, 0);
//        lec1.b();
//        int[] array = new int[]{lec1.arr(10)};
//        System.out.println(array[1000]);
//        System.out.println(lec1.divide(2, 0));
//        System.out.println(Lec1.getFileSize(new File("123")));
//        System.out.println(Lec1.getFileSize(new File("D:\\Works\\IT\\Обучение\\ВторойГод\\" +
//                "Алгоритмы и структуры данных\\Семинары\\Семинар2\\Workshop 4.pdf")));
    }
}