public class loopsExercise {
    public static void main(String[] args) {

        System.out.println("loop started");

        for (int i = 1; i <= 100; i++) {
            if(i == 50) {
                System.out.println("born");
            }else {
                System.out.println(i);
                //System.out.print(i + " "); printira na edin red
            }
            //System.out.println(i);
        }
        System.out.println("loop finished");

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <= 100; i++) {
            if (i == 20) {
                break;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i <= 40; i++) {
            if (i == 20) {
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println(" ");

        for (int i = 0; i <= 200; i++) {
            if (i > 50) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 51; i <= 100; i++) {
            System.out.println(i + " ");
        }
        // prez chisla procentno delenie
        for (int i = 0; i <= 100; i++) {
            //if(i % 2 != 0) nechetni
            if(i % 2 == 0) {
                System.out.print(" ");
                System.out.print(i + " ");
            }
        }
        System.out.println(' ');
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        boolean isReady = false;
        //bezkraen cikyl
        while (isReady == false) {
            System.out.println("dan");
            isReady = true;
        }
        int number = 0;
        while (number < 100) {
            System.out.println(number);
            number = number + 1;
        }
        int number2 = 0;
        boolean isready2 = false;
        while (isready2 == false) {
            System.out.println(number2 + " ");
            if (number2 == 100) {
                isready2 = true;
            }
            number2++;
        }
        //task1
        int sum  = 0;
        for (int i = 1; i <= 500; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }

}

