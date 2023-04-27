package HW1.Class.Second;

import HW1.Class.First.Product;
public class Pacifier extends Product {
    /**
     * Класс "Соска"
     * @param productName - Название
     * @param price       - Цена
     * @param amount      - Количество
     * @param unit        - Единицы измерения
     */
    public Pacifier(String productName, double price, int amount, String unit) {
        super(productName, price, amount, unit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
