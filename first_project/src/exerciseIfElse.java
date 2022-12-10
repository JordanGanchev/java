public class exerciseIfElse {
    public static void main(String[] args) {
        int age = 18;
        checkAge(25);
        checkAge(70);
        checkAge(45);
        checkAge(8);
        checkAge(-36);
        checkAddress("plovdiv");
        checkAddress("varna");
        checkAddress("sofia");

        boolean isAdult = false;
        boolean isYong = age >= 18 && age < 60;

        if(isAdult == true) {
            //(isAdult) (!isAdult)-> obratno
            System.out.println("adult");
        }else {
            System.out.println("child");
        }
    }

    public static void checkAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {
            if (age < 18) {
                System.out.println("You are not older enough to enter");
            } else {
                System.out.println("You are adult");
            }
        }
    }

    public static void checkAddress(String city) {
        if (city.equalsIgnoreCase("varna")) {
            System.out.println("your order accepted");
        } else {
            System.out.println("sorry but in " + city + " we do not make deliveries");
        }
    }
}