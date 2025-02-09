class Order {
    String id; // customer id
    double amount;

    Order(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}

class Demo {
    public static void printOrders(Order[] orderArray) {
       for ( Order order : orderArray ){
            order.printOrders();
       }
    }

    public static void sortOrderArray(Order[] orderArray) {
    }

    public static void main(String args[]) {
        Order[] orderArray = {
                new Order("C001", 4500),
                new Order("C002", 2500),
                new Order("C003", 6500),
                new Order("C004", 1500),
                new Order("C005", 3500),
                new Order("C005", 5500),
        };
        printOrders(orderArray);// [C001-4500, C002-2500, C003-6500,C004-1500,C005-3500,C005-5500]
        sortOrderArray(orderArray);
        printOrders(orderArray);// [C001-1500,C002-2500,C005-3500,C001-4500,C005-5500,C003-6500]
    }
}