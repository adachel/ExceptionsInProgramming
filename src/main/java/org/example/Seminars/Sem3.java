package org.example.Seminars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sem3 {
    public Sem3() {
    }
    // Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    // Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось
    // (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией,
    // в какой именно ячейке лежат неверные данные.
    // В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
    // MyArrayDataException и вывести результат расчета (сумму элементов, при условии, что подали на вход корректный массив).


    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Task 3: Создайте класс исключения, который будет выбрасываться при делении на 0.
    // Исключение должно отображать понятное для пользователя сообщение об ошибке. Создайте класс исключений,
    // которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
    // Исключение должно отображать понятное для пользователя сообщение об ошибке. Создайте класс исключения,
    // которое будет возникать при попытке открыть несуществующий файл.
    // Исключение должно отображать понятное для пользователя сообщение об ошибке.

    // создаем класс DivisionByZeroException
    // создаем класс NullArrayElementException
    // создаем класс FileNotFoundException

    /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Task 2: создайте класс счетчик, у кот есть метод add, увеличивающий значение внутренней int на 1.
    // Сделайте так, чтобы с объектом такого типа можно было работать с try-with-resources.
    // Что должно происходить при закрытии этого ресурса. Напишите метод, закрыт ли ресурс.
    // При вызове add у закрытого ресурса должно быть вызвано исключение.

    // Делаем через класс

    /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Task 1.
//    public void doSomething() throws IOException{
//        throw new IOException();
//    }

/// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Task 1: переписать с использованием ресурсного try
//    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
//        BufferedReader in = null;
//        BufferedWriter out = null;
//        try {
//            in = Files.newBufferedReader(pathRead);
//            out = Files.newBufferedWriter(pathWrite);
//            out.write(in.readLine());
//        }finally {
//            try {
//                if (in != null){
//                    in.close();
//                }
//            } catch (IOException e) {
//
//            }
//            try {
//                if (out != null){
//                    out.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (
                BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter(pathWrite);
        ){
            out.write(in.readLine());
        }
    }
}
