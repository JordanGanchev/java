public class ifElseLoop {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        plusMethod(x, y);
        subtractMethod(x, y);
        multiplyMethod(x, y);
        divideMethod(x, y);
        printUserInfo("dan", 19, 1500, "jorgan.com");
        printUserInfo("dimo", 20, 1500, "jorgan.com");
        printUserInfo("misho", 50, 1500, "jorgan.com");
        printUserInfo("stoqn", 46, 1500, "jorgan.com");
    }

    public static void plusMethod(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }
    public static void subtractMethod(int x, int y) {
        int sum = x - y;
        System.out.println(sum);
    }
    public static void multiplyMethod(int x, int y) {
        int sum = x * y;
        System.out.println(sum);
    }
    public static void divideMethod(int x, int y) {
        int sum = x / y;
        System.out.println(sum);
    }
    public static void printUserInfo(String name, int age, double salary, String email) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(email);
        System.out.println();
    }
}