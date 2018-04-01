public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 1045; // Input: any valid number of likes
        int registrationYear = 2010; // Input: any valid registration year
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = likesCount / (currentYear - registrationYear); // Your formula

        System.out.println(likesPerYear + " likes / year");
    }

}
