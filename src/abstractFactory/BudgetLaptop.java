package abstractFactory;

public class BudgetLaptop implements Laptop {
    @Override
    public void specs(){
        System.out.println("Budget Laptop: lightweight, affordable.");
    }
}
