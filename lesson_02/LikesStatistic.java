public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 1045; 
        int registrationYear = 2010;
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = likesCount / (double) (currentYear - registrationYear - 1);

        System.out.println(likesPerYear + " likes / year");
    }

}
