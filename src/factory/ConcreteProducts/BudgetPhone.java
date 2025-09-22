package factory.ConcreteProducts;

import factory.ProductInterface.Phone;

public class BudgetPhone implements Phone {

    @Override
    public void specs(){
        System.out.println("Budget Phone: basic camera, low-lasting battery.");
    }
}
