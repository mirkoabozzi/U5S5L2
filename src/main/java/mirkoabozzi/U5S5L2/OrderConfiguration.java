package mirkoabozzi.U5S5L2;

import mirkoabozzi.U5S5L2.entities.Menu;
import mirkoabozzi.U5S5L2.entities.Order;
import mirkoabozzi.U5S5L2.entities.Table;
import mirkoabozzi.U5S5L2.enums.OrderState;
import mirkoabozzi.U5S5L2.enums.TableState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;

@Configuration
@PropertySource("application.properties")
public class OrderConfiguration {

    @Bean
    public Table getTable1() {
        return new Table(TableState.LIBERO, 1, 4);
    }

    @Bean
    public Table getTable2() {
        return new Table(TableState.LIBERO, 2, 6);
    }

    @Bean
    public Table getTable3() {
        return new Table(TableState.LIBERO, 3, 10);
    }

    @Bean
    public Order getOrder(Menu menu) {
        return new Order(menu, getTable1(), 1, OrderState.IN_CORSO, 2, LocalDateTime.of(2024, 9, 3, 15, 0, 0), 50);
    }

}
