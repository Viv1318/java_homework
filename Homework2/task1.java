// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
// передаются в виде строки, где ключи и значения разделены =, а пары
// ключ-значение разделены &. Если значение null, то параметр не должен
// попадать в URL.
// Пример:
// params = "query=java&sort=desc&filter=null"
// Результат:
// https://example.com/search?query=java&sort=desc


package Homework2;

public class task1 {

    public static void main(String[] args) {
        String baseUrl = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        
        System.out.println(createUrlWithParams(baseUrl, params));
       
 
    }
    
    public static String createUrlWithParams(String baseUrl, String params) {
        String[] pairs = params.split("&");
        StringBuilder urlBuilder = new StringBuilder(baseUrl);

        for ( int i = 0; i < pairs.length; i++ ) {
            
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0){
                    urlBuilder.append("&");
                }
    
                urlBuilder.append(keyValue[0]).append("=").append(keyValue[1]);
            }
         
        }
        return urlBuilder.toString();
        


    }
}
