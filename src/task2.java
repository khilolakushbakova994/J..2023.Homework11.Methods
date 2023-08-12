public class task2 {
    public static void chooseAppVersion(int clientOs, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке\n");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }
    }
}

