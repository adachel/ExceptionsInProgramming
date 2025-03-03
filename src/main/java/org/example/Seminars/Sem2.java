package org.example.Seminars;

import java.io.*;
import java.util.HashMap;
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
    }

    // Task 2:
    public int sum2d(String[][] arr){
        int sum = 0;
        if (arr != null){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = tryParseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }
    public int tryParseInt(String s){
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Task 3: метод, кот считывает из файла и сохр в HashMap.
    // Если "?" - замените на соответствующее число. Если не число и не "?" - исключение.
    public HashMap<String, Integer> readData(String filename){
        HashMap<String, Integer> map = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()){
                String line = scanner.nextLine();
                String[] perts = line.split("=");
                if (perts.length != 2){
                    throw new IllegalArgumentException("Не те данные в строке " + line);
                }
                String name = perts[0];
                String value = perts[1];
                int valueInt = 0;
                if (value.equals("?")){
                    valueInt = perts[0].length();
                }else {
                    try {
                        valueInt = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Не тот формат числа " + line, e);
                    }
                }
                map.put(name, valueInt);
            }
            scanner.close();;
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        return map;
    }
    public void writeData(String fileName, HashMap<String, Integer> map){
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            for (String name: map.keySet()){
                int value = map.get(name);
                fileWriter.write(name + "=" + "\n");
            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }

    // Task 4
    public void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
//    public void task4(String[] args){
//        InputStream inputStream;
//        try {
//            String[] strings = {"asd", "asdf"};
//            String string = strings[2];
//            test();
//            int a = 1 / 0;
//            inputStream = new FileInputStream("asdasdasd");
//        }catch (Throwable e){
//            e.printStackTrace();
//        }catch (StackOverflowError error){
//            System.out.println("asdfghjlk");
//        }finally {
//            System.out.println("Я все равно выполнился");
//        }
//        System.out.println("Я жив");
//    }
    public void task4(String[] args){
        InputStream inputStream;
        try {
            String[] strings = {"asd", "asdf"};
            String string = strings[strings.length - 1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("asdasdasd");
        }catch (StackOverflowError error){
            System.out.println("Стек переполнен");
        }catch (Throwable e){
                e.printStackTrace();
        }finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив");
    }

}
