public class SumOfNumbers {

    public static void main(String [] args){

        System.out.println(sumIntegers(1234));
    }

    public static int sumIntegers(int num){
        int sum = 0;
        int number = num;
        int length = String.valueOf(number).length();

        if(number > 0 && number <9999){
            for(int i =0; i<=length; i++) {
                sum += number % 10;// Adding remainder to variable sum
                System.out.println("Number 1 "+number);
                number = number / 10;
                //System.out.println("Number 2 "+number);
            }
        }
        return sum;
    }
}
