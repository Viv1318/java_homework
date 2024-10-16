import java.util.HashMap;

/**
 * Задача 3. Подсчет продуктов в корзине
Создайте программу для учета продуктов в корзине. Программа должна
позволять добавлять, удалять, обновлять количество продуктов, а также
проверять наличие продуктов в корзине. Используйте HashMap для хранения
продуктов и их количества.
Методы:
● addProduct(String product, Integer quantity): Добавляет
продукт с указанным количеством в корзину. Если продукт уже есть,
увеличивает его количество.
● removeProduct(String product): Удаляет продукт из корзины. Если
продукт отсутствует, ничего не делает.
● updateQuantity(String product, Integer quantity): Обновляет
количество продукта в корзине. Если продукта нет, ничего не делает.
● checkProduct(String product): Проверяет, есть ли продукт в
корзине и возвращает его количество. Если продукта нет, возвращает 0.
● showBasket(): Выводит все продукты и их количество в корзине.
 */





public class ShoppingBasket {

    private HashMap<String, Integer> products = new HashMap<>();

    public static void main(String[] args) {
        
        ShoppingBasket food = new ShoppingBasket();

        food.addProduct("apple", 2);
        food.addProduct("banana", 5);
        food.addProduct("orange", 3);

        System.out.println(food.showBasket());
        // food.addProduct("bread", 1);
        // System.out.println(food.showBasket());
        // food.addProduct("apple", 2);
        // System.out.println(food.showBasket());
        // // food.removeProduct("banana");
        // // System.out.println(food.showBasket());
        // food.removeProduct("woter");
        // System.out.println(food.showBasket());
        // System.out.println(food.checkProduct("apple"));
        // System.out.println(food.checkProduct("bread"));

        food.updateQuantity("bread", 1);
        // food.updateQuantity("apple",5);
        System.out.println(food.showBasket());

                  

    }

    public void addProduct(String product, Integer quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public void updateQuantity(String product, Integer quantity) {
        if(products.containsKey(product)){
            products.put(product, quantity);
        }
    }

    public Integer checkProduct(String product) {
        return products.getOrDefault(product, 0);
    }

    public HashMap<String, Integer> showBasket(){
        return products;
    }
    
}
