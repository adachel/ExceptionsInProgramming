package org.example.Homeworks;

import javax.xml.crypto.Data;
import java.util.Arrays;

public class HWSEM2 {
    // Task 1
    // Напишите метод, который проверяет, является ли введенная строка корректной датой в формате "YYYY-MM-DD".
    // Дата должна быть в пределах от 0001-01-01 до 9999-12-31.
    // Если дата корректна, возвращайте её. Если нет — сообщение об ошибке.

    public String validateDate(String data){
        String symbol = String.valueOf(data.charAt(4));
        if (!symbol.equals("-")){
            return "Не верный разделитель";
        }
        if (data.length() != 10){
            return "Не верный формат";
        }
        String[] strings = data.split("-");
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            year = Integer.parseInt(strings[0]);
            month = Integer.parseInt(strings[1]);
            day = Integer.parseInt(strings[2]);
        } catch (NumberFormatException e) {
            return "Должны быть цифры";
        }
        if (year < 1 || year > 9999 && month < 1 || month > 12 && day < 1 || day > 31){
            return "Таких дат не бывает";
        }
        if (month == 4 && day > 30 || month == 6 && day > 30 || month == 9 && day > 30 || month == 11 && day > 30){
            return "Таких дат не бывает";
        }
        if (isLeapYear(year)){
            if (month == 2 && day > 28){
                return "Таких дат не бывает";
            }
        }
        if (!isLeapYear(year)){
            if (month == 2 && day > 29){
                return "Таких дат не бывает";
            }
        }
        return data;
    }
    private boolean isLeapYear(int year){
        return year % 400 != 0 && year % 4 != 0 || year % 100 == 0 ;
    }

    /*
    // ideal ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String validateDate(String date) {
        try {
            // Проверка длины строки
            if (date.length() != 10) {
                return "Invalid date format. Please use YYYY-MM-DD.";
            }
            // Разделите строку на компоненты
            String yearStr = date.substring(0, 4);
            String monthStr = date.substring(5, 7);
            String dayStr = date.substring(8, 10);
            // Проверка формата разделителей
            if (date.charAt(4) != '-' || date.charAt(7) != '-') {
                return "Invalid date format. Please use YYYY-MM-DD.";
            }
            //Преобразуйте компоненты в числа
            int year = Integer.parseInt(yearStr);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);
            // Проверка диапазона года
            if (year < 1 || year > 9999) {
                return "Year out of range. Must be between 0001and 9999.";
            }
            // Проверка диапазона месяца
            if (month < 1 || month > 12) {
                return "Month out of range. Must be between 01 and 12.";
            }
            // Проверка диапазона дня
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && isLeapYear(year)) {
                daysInMonth[1] = 29;
                // Февраль в високосный год
            }
            if (day < 1 || day > daysInMonth[month - 1]) {
                return "Day out of range for the given month.";
            }
            return date;
        } catch (NumberFormatException e) {
            // В случае ошибки преобразования чисел, выведите сообщение об ошибке
            return "Error parsing date components.";
        } catch (Exception e) {
            //В случае других ошибок, выведите сообщение об ошибке
            return "An error occurred while validating the date.";
        }
    }
    // Метод для проверки високосного года
    private static boolean isLeapYear ( int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static class Printer {
        public static void main(String[] args) {
            String date;
            if (args.length > 0) {
                date = args[0];
            } else {
                date = "2024-09-01";
                // Значение по умолчанию
            }
            String result = validateDate(date);
            System.out.println(result);
        }
    }
    */

    // Task 2
    // Напишите метод, который проверяет, является ли введенная строка палиндромом.
    // Если строка палиндром, возвращайте "Palindrome". Если нет —"Not a palindrome".

    public boolean isPalindrome(String input) {
        // Введите свое решение ниже
        input = input.replace(" ", "").toLowerCase().trim();
        for (int i = 0; i < input.length() / 2; i++) {
            String first = String.valueOf(input.charAt(i));
            String last = String.valueOf(input.charAt(input.length() - 1 - i));
            if (!first.equals(last)){
                return false;
            }
        }
        return true;
    }
    public void palindrome(String input){
        if (isPalindrome(input)){
            System.out.println("Palindrome");
        }else System.out.println("Not a palindrome");
    }
    // IDEAL ///////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static boolean isPalindrome(String input){
//        try{
//            // Удаляем пробелы и переводим строку в нижний регистр
//            String cleanedInput = input.replace("", " ").toLowerCase();
//            // Получаем длину строки
//            int length = cleanedInput.length();
//            // Проверяем, является ли строка палиндромом
//            for(int i = 0; i < length / 2; i++){
//                if(cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)){
//                    return false;
//                    // Строка не является палиндромом
//                    }
//            } return true;
//            // Строка является палиндромом
//        }catch(Exception e){
//            // В случае ошибки, например, если входные данные некорректны
//            System.err.println("An error occurred while checking for palindrome.");
//            return false;
//        }
//    }

    // Task 3.
    // Напишите метод, который принимает массив строк и сортирует его в алфавитном порядке.
    // Если входной массив null, метод должен вернуть пустой массив и вывести сообщение об ошибке.

    public String[] sortStrings(String[] strings) {
        // Введите свое решение ниже
        if (strings == null){
            throw new RuntimeException("Пустой массив");
        }else {
            try {
                Arrays.sort(strings);
                return strings;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
    // IDEAL ////////////////////////////////////////////////////////////////////////////////////
//    public String[] sortStrings(String[] strings) {
//        try {
//            if (strings == null) {
//                return new String[0];
//            }
//            System.out.println("Input array is null. Returning an empty array.");
//            Arrays.sort(strings);
//            return strings;
//        } catch (Exception e) {
//            // В случае ошибки сортировки, выведите сообщение об ошибке
//            System.out.println("An error occurred during sorting.");
//            return new String[0];
//        }
//    }

    // Task 4.
    // Нахождение среднеарифметического числа. Напишите метод, который находит среднее значение массива целых чисел.
    // Если массив пустой или null, метод должен вернуть Double.NaN и вывести сообщение об ошибке.

    public double findAverage(int[] array) {
        // Напишите свое решение ниже
        double sum = 0;
        if (array == null){
            return Double.NaN;
        }else {
            try {
                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                return sum / array.length;
            } catch (Exception e) {
                return Double.NaN;
            }
        }
    }

    // IDEAL ////////////////////////////////////////////////////////////////////////////////
//    public double findAverage(int[] array) {
//        try {
//            if (array == null || array.length == 0) {
//                System.out.println("Array is empty or null. Cannot compute average.");
//                return Double.NaN;
//            }
//            double sum = 0;
//            for (int num : array) {
//                sum += num;
//            }
//            return sum / array.length;
//        } catch (Exception e) {
//            // В случае ошибки, выведите сообщение об ошибке
//            System.out.println("An error occurred while computing the average.");
//            return Double.NaN;
//        }
//    }
}
