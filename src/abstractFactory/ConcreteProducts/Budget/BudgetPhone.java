package abstractFactory.ConcreteProducts.Budget;

import abstractFactory.AbstractProducts.Phone;

public class BudgetPhone implements Phone {
    @Override
    public void specs() {
        System.out.println("Budget Phone: basic camera, low-lasting battery.");
    }
}
