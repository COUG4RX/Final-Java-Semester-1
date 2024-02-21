interface DiscountRate {
    double getServiceDiscountRate(String type);
    double getProductDiscountRate(String type);
}

class Sale implements DiscountRate {
    @Override
    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium": return 0.20;
            case "Gold": return 0.15;
            case "Silver": return 0.10;
            default: return 0.00;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        return (type.equals("Premium") || type.equals("Gold") || type.equals("Silver")) ? 0.10 : 0.00;
    }
}

class Customer {
    private String type;

    public Customer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class ShoppingExercise {
    public static void main(String[] args) {
        Sale sale = new Sale();

        Customer premium = new Customer("Premium");
        Customer gold = new Customer("Gold");
        Customer silver = new Customer("Silver");
        Customer normal = new Customer("Normal");

        System.out.println("Premium service discount: " + sale.getServiceDiscountRate(premium.getType()));
        System.out.println("Gold service discount: " + sale.getServiceDiscountRate(gold.getType()));
        System.out.println("Silver service discount: " + sale.getServiceDiscountRate(silver.getType()));
        System.out.println("Normal service discount: " + sale.getServiceDiscountRate(normal.getType()));

        System.out.println("Premium product discount: " + sale.getProductDiscountRate(premium.getType()));
        System.out.println("Gold product discount: " + sale.getProductDiscountRate(gold.getType()));
        System.out.println("Silver product discount: " + sale.getProductDiscountRate(silver.getType()));
        System.out.println("Normal product discount: " + sale.getProductDiscountRate(normal.getType()));
    }
}
