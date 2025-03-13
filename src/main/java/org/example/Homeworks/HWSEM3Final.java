package org.example.Homeworks;
// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
// разделенные пробелом: Фамилия Имя Отчество дата рождения номер телефона пол.
// - Форматы данных:
// - фамилия, имя, отчество - строки;
// - дата_рождения - строка формата dd.mm.yyyy;
// - номер_телефона - целое беззнаковое число без форматирования;
// - пол - символ латиницей f или m.
//
// 1.  Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
//     вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
//     чем требуется.
// 2.  Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
//     - Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
//     - Если всё введено и обработано верно,
// 3.  Должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
//     <Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>
//     Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//     При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
//     пользователь должен увидеть стектрейс ошибки.


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HWSEM3Final {
    public HWSEM3Final() {
    }
    public void createFile(String data) {
        String[] arr = data.split(" ");
        chekLenData(arr);
        for (int i = 0; i < 3; i++) {
            chekSymbols(arr[i]);
        }
        chekDate(arr[3]);
        chekPhone(arr[4]);
        chekGender(arr[5]);

        String nameFile = arr[0] + ".txt";

        try (FileWriter writer = new FileWriter(nameFile, true);
             BufferedWriter bufferWriter = new BufferedWriter(writer);){
            bufferWriter.write(data + "\n");
        }catch (Exception e){
            throw new RuntimeException("Не удалось записать данные в файл");
        }
    }

    private void chekLenData(String[] arr){
        if (arr.length < 6){
            throw new IllegalArgumentException("Не достаточно данных");
        }
        if (arr.length > 6){
            throw new IllegalArgumentException("Лишние данные");
        }
    }

    private void chekSymbols(String arr){
        String symWithDot = "`~!@#$%^&*()-_=[{}]:;|\\'\",<>?/+.";
        for (char sym: symWithDot.toCharArray()){
            if (arr.contains(String.valueOf(sym))){
                throw new IllegalArgumentException("Не допустимые символы в ФИО");
            }
        }
    }

    private void chekDate(String date){
        try {
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate localDate = LocalDate.parse(date, timeFormatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Не корректная дата");
        }

        String[] arr = date.split("\\.");

        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        if (day < 1 || day > daysInMonth[month - 1]) {
            throw new IllegalArgumentException("Не корректная дата");
        }
    }

    private static boolean isLeapYear ( int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private void chekPhone(String phone){
        if (phone.charAt(0) == '+' && phone.charAt(1) == '7' && phone.length() == 12 || phone.charAt(0) == '8' && phone.length() == 11){
            if (phone.charAt(0) == '+'){
                phone = phone.replace('+',' ').trim();
            }
            try {
                long numPhone = Long.parseLong(phone);
            }catch (IllegalArgumentException e){
                System.out.println("Не допустимые символы в номере");
            }
        }else throw new IllegalArgumentException("Не корректный номер");
    }

    private void chekGender(String gender){
        if (!gender.equals("m") && !gender.equals("f")){
            throw new IllegalArgumentException("Не корректно указан пол");
        }
    }
}










