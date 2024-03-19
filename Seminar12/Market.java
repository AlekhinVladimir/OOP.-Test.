// Было нарушение принципов SRP и DIP. Исправлено.

class Market implements MarketBehaviour {
    private final QueueBehaviour queue;

    public Market(QueueBehaviour queue) {
        this.queue = queue;
    }

    @Override
    public void acceptOrder(String order) {
        queue.enqueue(order);
    }

    @Override
    public String serveOrder() {
        if (!queue.isEmpty()) {
            String order = queue.dequeue();
            System.out.println("Обслужен заказ: " + order);
            return order;
        } else {
            System.out.println("Очередь пуста, заказов для обслуживания нет");
            return null;
        }
    }

    @Override
    public void update() {
        System.out.println("Магазин обновлен");
    }
}