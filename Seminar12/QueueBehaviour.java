// Интерфейс, определяющий поведение очереди
interface QueueBehaviour {
    void enqueue(String person); // Добавить человека в очередь

    String dequeue(); // Удалить и вернуть первого человека из очереди
    boolean isEmpty();  // Проверить, пуста ли очередь
    int size(); // Получить размер очереди
}