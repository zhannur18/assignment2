public class Main {
    public static void main(String[] args) {
        // Create a basic coffee
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Cost: $" + basicCoffee.cost());
        System.out.println("Description: " + basicCoffee.getDescription());

        // Decorate it with milk
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println("Cost: $" + milkCoffee.cost());
        System.out.println("Description: " + milkCoffee.getDescription());

        // Decorate it with sugar
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: $" + sugarMilkCoffee.cost());
        System.out.println("Description: " + sugarMilkCoffee.getDescription());
    }
}
