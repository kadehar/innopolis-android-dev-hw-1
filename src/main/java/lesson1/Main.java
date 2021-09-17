package lesson1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        compare(1.5, 1.49);
        greetings("Alex");
        stringPool();
    }

    private static void compare(double a, double b) {
        BigDecimal first = new BigDecimal(a);
        BigDecimal second = new BigDecimal(b);

        System.out.printf("a equals b? %b%n", first.compareTo(second) == 0);
    }

    private static void greetings(String name) {
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append(name);
        System.out.println(builder);
        builder.replace(0, 5, "Hi");
        System.out.println(builder);
    }

    private static void stringPool() {
        String s1 = "Cat";
        String s2 = "Cat";

        String s3 = new String("Cat");
        String s4 = new String("Cat");

        System.out.printf("s1 == s2? %b%n", (s1 == s2));
        System.out.printf("s1.equals(s2)? %b%n", s1.equals(s2));
        System.out.printf("s3 == s4? %b%n", (s3 == s4));
        System.out.printf("s3.equals(s4)? %b%n", s3.equals(s4));
    }
}
