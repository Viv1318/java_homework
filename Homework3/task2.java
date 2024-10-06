// Задача 2. Уникальные числа
// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива.
// Пример:
// [1, 2, 2, 3, 4, 4, 5]
// Результат:
// [1, 2, 3, 4, 5]






package Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class task2 {

    
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        
        System.out.println(Arrays.toString(ighorDublicate(arr)));
        
        
    }

    public static int[] ighorDublicate(int[] arr) {

    
        LinkedHashSet <Integer> result = new LinkedHashSet<>();

        for (int num : arr) {
            result.add(num);
        }
        
        List<Integer> resultList = new ArrayList<>(result);

        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        
        
        
        return resultArray;
    }   

}
    
    


