package HW1;
import HW1.Class.*;
import HW1.Class.First.Product;
import HW1.Class.Second.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> Product = new ArrayList<>();
        Product.add(new Bread("Батон", 1.02, 10,"шт", "27.04.2023", "Первый сорт"));
        Product.add(new Diapers("Pampers", 250, 48, "шт", 2, "M", 10, 15, "M"));
        Product.add(new Eggs("Золотые", 15, 10, "шт", "27.04.2023", 24));
        Product.add(new Milk("ЭкоМилк", 10, 1, "литр", 1, 3.2, "27.04.2023"));
        Product.add(new Pacifier("Соска", 25, 1, "шт"));
        Product.add(new Soda("CocaCola", 10, 1, "литр", 1));
        Product.add(new ToiletPapper("Zewa", 60, 8, "шт", 24, 3));

        for(Product product: Product){
            Program.getProductInfo(product);
            System.out.println();
        }
    }
}
