public class concolic {

    public void dateCalculator(int x, int y) {
        if (x <= 6 * 31) {
            System.out.println((x / 31 + 1) + " " + (x % 31 + 1));
        } else {
            x -= 6 * 31;
            if (x <= 5 * 30) {
                System.out.println((7 + x / 30) + " " + (1 + x % 31));
            } else {
                x -= 5 * 31;
                boolean leap = isLeapYear(y);
                if ((leap && x <= 30) || (!leap && x <= 29)) {
                    System.out.println(12 + " " + x);
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    public static void dateCalculator2(int x, int y) {
        if (x <= 6 * 31) {
            System.out.println((x / 31 + 1) + " " + (x % 31 + 1));
        } else {
            x -= 6 * 31;
            if (x <= 5 * 30) {
                System.out.println((7 + x / 30) + " " + (1 + x % 31));
            } else {
                x -= 5 * 31;
                boolean leap = isLeapYear2(y);
                if (leap) {
                    if (x <= 30) {
                        System.out.println(12 + " " + x);
                    }
                }

                else if (x <= 29){
                    System.out.println(12 + " " + x);
                }

                else {
                    throw new RuntimeException();
                }
            }
        }
    }

    public static boolean isLeapYear(int y) {
        return true;
    }

    public static boolean isLeapYear2(int y) {
        return false;
    }
}
