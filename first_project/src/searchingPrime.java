public class searchingPrime {
    public static void main(String[] args) {
        int divisor = 0;
        for (int i = 1; i <= 100; i++){
            divisor = 0;
            for (int b = 1; b <= 100; b++){
                if (i % b == 0) {
                    divisor += 1;
                }
                if(b == 100 && divisor == 2) {
                    System.out.print(i);
                    System.out.print(" ");
                }

                if(divisor > 2) {
                    break;
                }
            }
        }
    }
}

//divisor_number = 0
//        number = ''
//        for i in range(100, 1, -1):
//        divisor_number = 0
//        for b in range(1, 101, 1):
//        if i % b == 0:
//        divisor_number += 1
//        if b == 100 and divisor_number == 2:
//        number += str(i)
//        number += " "
//        if divisor_number > 2:
//        break
//        print(number)