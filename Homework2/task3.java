// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1
// line2
// line3
// Результат:
// line1
// line2
// line3





package Homework2;

public class task3 {
    public static void main(String[] args) {
        
        String text = "line1\nline2\nline3\n\n\nline4";
        System.out.println(removeEmptyLines(text));
        
    }
    
    public static String removeEmptyLines(String text) {
        
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();
        
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                result.append(line).append("\n");
            }
        }
        
        return result.toString().trim();
    }
}
