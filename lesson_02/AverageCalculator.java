public class AverageCalculator {
    public static void main(String[] args) {

        int max = Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int min = Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

        boolean isMaxPositive = ((max & 0x80000000)== 0x00000000);  //check presence of the highest bit
        boolean isMinPositive = ((min & 0x80000000)== 0x00000000);  //check presence of the highest bit

        if ((isMaxPositive&&isMinPositive)){                        //if min and max more than "0"
            System.out.printf("%.1f", (((max - min) / 2.0) + min));
        }else if ((!isMaxPositive)&&(!isMinPositive)){              //if min and max less than "0"
            System.out.printf("%.1f", (((min-max) / 2.0) + max));
        }else{                                                      //if man less than "0" and man more than "0"
            System.out.printf("%.1f", ((max + min) / 2.0));
        }
    }
}
