import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Задача 2. История посещения веб-сайтов
Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
Используйте Deque для хранения истории.
● visitSite(String site): Добавляет сайт в историю посещений.
● back(int steps): Возвращает название сайта, который был посещен
steps назад, или null, если таких шагов нет.
● getHistory(): Возвращает список сайтов в истории посещений, от
последнего посещенного к первому.
 */





public class BrowserHistory {


    private Deque<String> history = new LinkedList<>();

    public static void main(String[] args) {
        
        BrowserHistory browser = new BrowserHistory();
        
        
        browser.visitSite("Google");
        browser.visitSite("Yandex");
        browser.visitSite("DuckDuckGo");
        
        
        System.out.println(browser.getHistory());
        
        System.out.println(browser.back(1)); // Yandex
        System.out.println(browser.back(2)); // Google
        System.out.println(browser.back(3)); // null



    }



    public void visitSite(String site) {
        history.addFirst(site);
    }

    public String back(int steps) {

        if (steps >= history.size()) {
            return null;
        }
        return history.pollFirst();
    }

    public Deque<String> getHistory() {

        return new ArrayDeque<>(history);
    }

    
}