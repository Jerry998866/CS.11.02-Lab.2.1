public class Main {

    public static void main(String[] args) {
        int twoAdd = add(5, 7);
        System.out.println(twoAdd);
        int fourAdd = add(5, 7, 6, 8);
        System.out.println(fourAdd);
        String greetingTest1 = morningGreeting("Jerry");
        System.out.println(greetingTest1);
        String greetingTest2 = afternoonGreeting("Jerry");
        System.out.println(greetingTest2);
        String tripleTest = triple("Hello");
        System.out.println(tripleTest);
        double halfTest = half(6);
        System.out.println(halfTest);
        int roundTest1 = roundPositiveValueToNearestInteger(6.54);
        System.out.println(roundTest1);
        int roundTest2 = roundNegativeValueToNearestInteger(-6.54);
        System.out.println(roundTest2);

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }

    // 6. half
    public static double half(double a) {

        return a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        double roundValue = a+0.5;
        int roundedValue =(int) roundValue;
        return roundedValue;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        double roundValue = a-0.5;
        int roundedValue =(int) roundValue;
        return roundedValue;
    }
}
