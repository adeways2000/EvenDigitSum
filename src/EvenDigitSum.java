public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if (number < 0){
            return -1;
        }
        int sum = 0;
        int compare = 0;
        while (number > 0) {
            compare = number % 10;
            if(compare % 2 == 0) {
                sum += compare;
            }
            number /= 10;
        }
        return sum;
    }

}
