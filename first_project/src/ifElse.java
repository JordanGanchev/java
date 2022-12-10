public class ifElse {
    public static void main(String[] args) {
        int age = 17;
        String name = "dancho";
        String searchedName = "Danc";

        if(age < 18 || age > 60) {
            System.out.println("Still child");
        }
        else if(age > 70) {
            System.out.println("old");
        }

        else {
            System.out.println("adult");
        }
        if(name.equals(searchedName)) {
            System.out.println("Ravni");
        }else {
            System.out.println("ne sa ravni");
        }

        if(name.equalsIgnoreCase(searchedName)) {
            System.out.println("Ravni");
        }else {
            System.out.println("ne sa ravni");
        }
        if (name.contains(searchedName)) {
            // ima znachenie malka i golqmq bukva
            System.out.println("yes");
        }
        // name.toUpperCase = big, name.toLowerCase = small
        if (name.toUpperCase().contains(searchedName.toUpperCase())) {
            System.out.println("YesTwo");
        }

    }
}
