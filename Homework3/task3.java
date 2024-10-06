
// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]





package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {

        String[] inputArray = {"cat", "elephant", "dog", "giraffe"};

        String[] result = filterStringsByLength(inputArray);
        System.out.println(Arrays.toString(result));
     

    }
     public static String[] filterStringsByLength(String[] inputArray) {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i].length() > 3) {
                result.add(inputArray[i]);
            }
        }    
            String[] resultArray = new String[result.size()];
                for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
             

             }
             return resultArray;
        }
}

