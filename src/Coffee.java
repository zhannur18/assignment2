// Step 1:interface or abstract class for the component (the base object).
interface Coffee {
    double cost();
    String getDescription();
}

// Step 2:component class (the base coffee).
class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}

// Step 3: decorator classes that implement the same interface as the component.
// These decorators add additional behavior.

// Decorator 1: MilkDecorator
class MilkDecorator implements Coffee {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}

// Decorator 2: SugarDecorator
class SugarDecorator implements Coffee {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}

