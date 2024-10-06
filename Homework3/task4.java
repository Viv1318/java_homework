// Задача 4*. Среднее значение массива
// Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.
// Пример:
// [4, 2, 7, 5, 1]
// Результат:
// 4




package Homework3;

public class task4 {

    public static void main(String[] args) {

        double[] arr = {4, 2, 7, 5, 1};
        double average = calculateAverage(arr);
        System.out.println(Math.round(average));
        
    }

    public static double calculateAverage(double[] arr) {

        if (arr.length == 0) return 0;
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    
}
