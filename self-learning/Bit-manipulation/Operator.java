public class Operator {

    public static void main(String[] args) {

        // AND --> Both true than true
        System.out.println(5 & 6); // 4

        // OR --> Any one true than true
        System.out.println(5 | 6); // 7

        // XOR - Different - true(0 ^ 1 = 1), same - false(1 ^ 1 = 0)
        System.out.println(5 ^ 6); // 3

        // 1's complement
        System.out.println(~11); // -6

        // Binary LEFT Shift(<<) formula --> a<<b = a*(2^b)
        System.out.println(5 << 2); // 20

        // Biary RIGHT Shift(>>) formula --> a>>b = a/(2^b)
        System.out.println(6 >> 1); // 3
    }
}