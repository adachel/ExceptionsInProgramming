package org.example.Lections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lec2 {
    public Lec2() {
    }

    public void view(){
//        String string = null;
//        System.out.println(string.length()); // NullPointerException - потому-что переменная null

//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);       // ClassCastException - String не может быть преобразован в тип File

//        String s = "123fq";
//        int result = Integer.parseInt(s);
//        System.out.println(result);       // NumberFormatException - строка не может быть преобразовано в число

//        List<Object> list = Collections.emptyList();
//        list.add(new Object());       // UnsupportedOperationException - метод add для данного объекта не поддерживается
    }
    public void tryCatch(){
        int num = 1;
//        try {
//            num = 10 / 0;
//        }catch (ArithmeticException e){
//            System.out.println("на 0 делить нельзя");
//        }
//        System.out.println(num);    // Приложение не упало. Выведено сообщение и num остался старым

//        try {
//            num = 10 / 1;
//            String s = null;
//            System.out.println(s.length());
//        }catch (ArithmeticException e){     // Приложение упадет, т.к. перехват только ArithmeticException
//            System.out.println("на 0 делить нельзя");
//        }
//        System.out.println(num);    // Приложение не упало. Выведено сообщение и num остался старым

//        try {
//            num = 10 / 1;
//            String s = null;
//            System.out.println(s.length());
//        }catch (Exception e){     // ArithmeticException подняли до Exception, так работает
//            System.out.println("на 0 делить нельзя");
//        }
//        System.out.println(num);

//        try {
//            num = 10 / 1;
//            String s = null;
//            System.out.println(s.length());
//        }catch (ArithmeticException e){     // перехват ArithmeticException
//            System.out.println("на 0 делить нельзя");
//        }catch (NullPointerException e){    // перехват NullPointerException
//            System.out.println("Null");
//        }
//        System.out.println(num);    // Приложение не упало. Выведено сообщение и num остался старым

//        try {
//            num = 10 / 0;       // в блоке Try здесь все остановится и перейдет в catch
//            String s = null;
//            System.out.println(s.length());
//        }catch (ArithmeticException e){     // перехват ArithmeticException
//            System.out.println("на 0 делить нельзя");
//        }catch (NullPointerException e){    // перехват NullPointerException
//            System.out.println("Null");
//        }
//        System.out.println(num);    // Приложение не упало. Выведено сообщение и num остался старым

//        try {
////            num = 10 / 0;       // в блоке Try здесь все остановится и перейдет в catch
////            String s = null;
////            System.out.println(s.length());
//            Collections.emptyList().add(new Object());
//        }
//        catch (ArithmeticException e){     // перехват ArithmeticException
//            System.out.println("на 0 делить нельзя");
//        }catch (NullPointerException e){    // перехват NullPointerException
//            System.out.println("Null");
//        }catch (Exception e){
//            System.out.println("Catch идут по очереди, как только какой-то сработает, остальные пропускаются");
//        }
//        System.out.println(num);    // Приложение не упало. Выведено сообщение и num остался старым
    }

    public void unreportedException(){
//        FileReader test = new FileReader("qwe");    // подчеркивает красным, здесь вероятно исключение, нужно обработать.
        FileReader test = null;
        try {
            test = new FileReader("qwe");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("exception " + e.getClass().getSimpleName());
        }finally {
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println(e. getMessage());
                }
            }

        }
    }
}
