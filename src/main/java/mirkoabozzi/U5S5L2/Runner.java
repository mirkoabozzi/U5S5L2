package mirkoabozzi.U5S5L2;

import mirkoabozzi.U5S5L2.entities.Menu;
import mirkoabozzi.U5S5L2.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Order order;
    @Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(menu);
        System.out.println(order);
    }
}
