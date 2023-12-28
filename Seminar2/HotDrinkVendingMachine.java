import java.util.ArrayList;
import java.util.List;

class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> products;

    public HotDrinkVendingMachine() {
        products = new ArrayList<>();

        products.add(new HotDrink("Tea", 200, 80));
        products.add(new HotDrink("Coffee", 150, 70));
        products.add(new HotDrink("Cocoa", 300, 65));
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume
                    && ((HotDrink) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
