public class OrderProcessor {
    public void processOrder(String orderId) {
        // Логика поиска заказа
        Order order = findOrderById(orderId);
        if (order != null) {
            // Логика проверки заказа
            if (order.getStatus().equals("Новый") || order.getStatus().equals("В обработке")) {
                // Логика обработки заказа
                process(order);
                // Логика отправки уведомления
                sendNotification(order);
            }
        }
    }

    private Order findOrderById(String orderId) {
        // Здесь должен быть код для поиска заказа
        return new Order(); // Пример возвращаемого значения
    }

    private void process(Order order) {
        // Здесь должен быть код обработки заказа
    }

    private void sendNotification(Order order) {
        // Здесь должен быть код отправки уведомления о заказе
    }
}
