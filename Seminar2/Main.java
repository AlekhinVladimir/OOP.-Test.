public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        Product tea200 = machine.getProduct("Tea", 200);
        if (tea200 != null) {
            System.out.println("Found hot drink: " + tea200.getName() + ", volume: " + tea200.getVolume());
        } else {
            System.out.println("No such product found");
        }

        Product coffee150_70 = machine.getProduct("Coffee", 150, 70);
        if (coffee150_70 != null) {
            System.out.println("Found hot drink: " + coffee150_70.getName() + ", volume: " + coffee150_70.getVolume()
                    + ", temperature: " + ((HotDrink) coffee150_70).getTemperature());
        } else {
            System.out.println("No such product found");
        }
    }
}