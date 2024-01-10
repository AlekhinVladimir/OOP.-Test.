public class Main {
    public static void main(String[] args) {
        // Создаем очередь и магазин
        QueueBehaviour queue = new Queue();
        MarketBehaviour market = new Market(queue);

        // Принимаем заказы
        market.acceptOrder("Заказ 1");
        market.acceptOrder("Заказ 2");

        // Обновляем состояние магазина
        market.update();

        // Обслуживаем заказы
        market.serveOrder();
        market.serveOrder();

        // Обновляем состояние магазина после обслуживания заказов
        market.update();
    }
}