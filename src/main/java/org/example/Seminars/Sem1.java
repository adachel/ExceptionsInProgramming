package org.example.Seminars;

public class Sem1 {
    public Sem1() {
    }

    public boolean checkArr(int[][] arr){
        int row = arr.length;
        if (row == 0){
            return true;
        }
        for (int i = 1; i < row; i++) {
            if (arr[i].length != row){
                return false;
            }
        }
        return true;
    }

    public int[] summArr(int[] arr1, int[] arr2) throws IllegalAccessException {
        int[] res = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Длины не равны");
        }else {
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] + arr2[i];
            }
            return res;
        }
    }

    public void checkArray(Integer[] arr){
        String info = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                info = "null в ячейке " + i + ", " + info;
            }
        }
        System.out.println(info);
    }

    public int sumArrTwo(int[][] arr){
        int n = arr.length;
        int result = 0;
        for (int[] row: arr){
            if (row.length != n){
                return -1;
            }
        }
        for (int[] row: arr){
            for (int num: row){
                if (num != 0 && num != 1){
                    return -2;
                }
            }
        }
        for (int[] row: arr){
            for (int num: row){
                result = result + num;
            }
        }
        return result;
    }

    public int sumArr(int[][] arr){
        int n = arr.length;
        int result = 0;
        for (int[] row: arr){
            if (row.length != n){
                throw new RuntimeException("Кол-во строк не равно кол-во столбцов");
            }
        }
        for (int[] row: arr){
            for (int num: row){
                if (num != 0 && num != 1){
                    throw new RuntimeException("Элементы не 0 или не 1");
                }
            }
        }
        for (int[] row: arr){
            for (int num: row){
                result = result + num;
            }
        }
        return result;
    }


    public int methodTwo(int[] arr, int minLen, int num){
        if (arr == null){
            return -3;
//            throw new RuntimeException("Массив null");
        }
        Integer temp = null;
        if(arr.length < minLen){
            return -1;
//            throw new RuntimeException("Длина массива меньше " + minLen);
        }
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return arr[i];
            }
        }
        return -2;
//        throw new RuntimeException("Искомый элемент не найден");
    }

    public int methodOne(int[] array, int min){
        if (array.length < min){
            return -1;
        }else {
            return array.length;
        }
    }
}
