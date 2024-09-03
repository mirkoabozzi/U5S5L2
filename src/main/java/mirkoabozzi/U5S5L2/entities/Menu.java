package mirkoabozzi.U5S5L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Drink> drinkList;

    public Menu(List<Pizza> pizzaList, List<Topping> toppingList, List<Drink> drinkList) {
        this.pizzaList = pizzaList;
        this.toppingList = toppingList;
        this.drinkList = drinkList;
    }
}
