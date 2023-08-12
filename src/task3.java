public class task3 {
    public static void deliverCard ( int deliveryDistance) {
        if (deliveryDistance == 20) {
            System.out.println("Потребуется 1 день на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance == 60) {
            System.out.println("Потребуется 2 дня на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance <= 80) {
            System.out.println("Потребуется 3 дня на доставку");
        } else if (deliveryDistance > 80 && deliveryDistance <= 100) {
            System.out.println("Потребуется 4 дня на доставку\n");
        }
    }
}

