package mirkoabozzi.U5S5L2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mirkoabozzi.U5S5L2.enums.OrderState;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Order {
    private List<Product> productList;
    private Table table;
    private int orderNumber;
    private OrderState orderState;
    private int effectiveSeatNumber;
    private LocalDateTime localDateTime;
    private double total;
}
