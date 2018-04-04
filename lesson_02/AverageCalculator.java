public class AverageCalculator {
    public static void main(String[] args) {
        long max = Math.max(Long.parseLong(args[0]),Long.parseLong(args[1]));
        long min = Math.min(Long.parseLong(args[0]),Long.parseLong(args[1]));

        System.out.println(min+(max-min)/2);
    }
}
