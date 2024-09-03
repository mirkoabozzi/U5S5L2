package mirkoabozzi.U5S5L2;

import mirkoabozzi.U5S5L2.entities.Drink;
import mirkoabozzi.U5S5L2.entities.Menu;
import mirkoabozzi.U5S5L2.entities.Pizza;
import mirkoabozzi.U5S5L2.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfiguration {

    @Bean
    public Topping getToppingProsciutto() {
        return new Topping("prosciutto");
    }

    @Bean
    public Topping getToppingPatatine() {
        return new Topping("patatine");
    }

    @Bean
    public Pizza getPizzaProsciutto() {
        return new Pizza("Pizza Prosciutto", 500, 8.00, getToppingProsciutto());
    }


    @Bean
    public Pizza getPizzaPatatine() {
        return new Pizza("Pizza Patatine", 600, 9.00, getToppingPatatine());
    }

    @Bean
    public Drink getDrinkCocaCola() {
        return new Drink("Coca Cola", 20, 1.00, 0.33);
    }

    @Bean
    public Drink getBeer() {
        return new Drink("Ichnusa", 80, 1, 0.33);
    }

//    @Bean
//    public Menu getMenu(List<Product> productList) {
//        return new Menu(productList);
//    }

    @Bean
    public Menu getMenu() {
        return new Menu(List.of(getPizzaProsciutto(), getPizzaPatatine(), getDrinkCocaCola(), getBeer()));
    }

}
