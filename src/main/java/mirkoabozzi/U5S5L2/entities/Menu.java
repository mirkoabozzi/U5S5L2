package mirkoabozzi.U5S5L2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menu {
    private List<Product> product;

    @Override
    public String toString() {
        return "Menu{" +
                "product=" + product +
                '}';
    }
}
