public class LastDigits {
    public static void main(String[] args) {
        System.out.println("last 5 symbols: " + args[0].subSequence(args[0].length() - 5, args[0].length()));
    }
}
