public class exercise {
    public static void main(String[] args) {
        calculateNumberAverage();
        calculateMonthSalary();
        takeBankCredit();
    }
    public static void calculateNumberAverage() {
        int x = 3;
        int y = 4;
        int z = 7;

        int sum = (x + y + z) / 3;
        System.out.println(sum);
    }
    public static void calculateMonthSalary() {
        double salary = 2500;
        double mouthSalary = salary / 12;
        System.out.println(mouthSalary);
    }
    public static void takeBankCredit() {
        double credit = 20000;
        int months = 60;
        double monthPiece = credit / months;
        System.out.println(monthPiece);

        double percent = 0.07;
        double interest = monthPiece * percent;
        System.out.println("interest is 7%:" + ' ' + interest);
       }
}
