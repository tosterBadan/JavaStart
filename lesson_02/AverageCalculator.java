public class AverageCalculator {
    public static void main(String[] args) {
        
        int max = Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int min = Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

        System.out.println(min+(max-min)/2);
    }
    }
}
