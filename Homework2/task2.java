// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago



package Homework2;

public class task2 {
    
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {{"John", "30", "New York"},{"Alice", "25", "Los Angeles"},{"Bob", "35", "Chicago"}};
        
        System.out.println(createCSVString(headers, data));
    }
    
    public static String createCSVString(String[] headers, String[][] data) {
        StringBuilder sb = new StringBuilder();
        
        // Записываем заголовки
        sb.append(String.join(",", headers)).append("\n");
        
        // Записываем данные
        for (String[] row : data) {
            sb.append(String.join(",", row)).append("\n");
        }
        
        return sb.toString().trim();
    }
}
