public class task1 {

    public static void yearIsLeap(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else if (year % 100 != 0) {
            System.out.println("год является невисокосным\n");

        }

    }
}
