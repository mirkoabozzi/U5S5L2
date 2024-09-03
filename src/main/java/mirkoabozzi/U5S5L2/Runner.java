package mirkoabozzi.U5S5L2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private MenuConfiguration menuConfiguration;
    @Autowired
    private OrderConfiguration orderConfiguration;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(menuConfiguration.getMenu());

        System.out.println(orderConfiguration.getOrder(menuConfiguration.getMenu()));

    }
}
