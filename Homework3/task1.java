
// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]





package Homework3;

import java.util.ArrayList;
import java.util.Arrays;


public class task1 {

    public static void main(String[] args) {

        

        int[] arr = {-1, 2, -3, 4, -5, 6};

        ArrayList <Integer> result = new ArrayList<Integer>();
        for (int num : arr) {
            if (num >= 0) {
                result.add(num);
            }
  
        }
        System.out.println(result);

        // int[] result = filterNegative(arr);
        // System.out.println(Arrays.toString(result));

        
        
    // }
    // public static int[] filterNegative(int[] arr) {
    //     ArrayList<Integer> result = new ArrayList<>();
    //     for (int num : arr) {
    //     if (num >= 0) {
    //     result.add(num);
    //     }
    //     }
    //     // Преобразуем ArrayList в массив
    //     int[] resultArray = new int[result.size()];
    //     for (int i = 0; i < result.size(); i++) {
    //     resultArray[i] = result.get(i);
    //     }
    //     return resultArray; 
    }
}
