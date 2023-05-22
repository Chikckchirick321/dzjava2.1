public class Main {
    public static void main(String[] args) {
        long x = 100;
        long amount = 1_050;
        long bonus = amount / 100;
        if (amount > 1000) {
            System.out.println(x + amount + bonus);
        } else {
            System.out.println(x + amount);
        }
    }
}