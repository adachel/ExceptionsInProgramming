package org.example.Homeworks;





// Реализуйте метод 'convertAndSum', который принимает массив строк,
// каждая из которых должна быть преобразована в целое число. Метод возвращает сумму всех чисел.
// Если хотя бы одна строка не может быть преобразована в число, метод должен выбросить исключение 'NumberFormatException'.
// Дополнительно, если сумма чисел превышает 100, выбрасывайте 'ArithmeticException' с сообщением "Превышен лимит суммы".

public class HWSEM1 {
    public HWSEM1() {
    }
    public int convertAndSum(String[] strings){
        int result = 0;
        try {
            for (String s: strings){
                result += Integer.parseInt(s);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка преобразования строки в число");
        }
        if (result > 100){
            throw new ArithmeticException("Превышен лимит суммы");
        }else {
            return result;
        }
    }
}
