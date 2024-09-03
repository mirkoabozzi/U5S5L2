package mirkoabozzi.U5S5L2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mirkoabozzi.U5S5L2.enums.TableState;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Table {
    TableState tableState;
    private int tableNumber;
    private int seatNumber;

}
