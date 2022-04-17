package method;

public class Demo2 {
    public static void main(String[] args) {
        printMax();
    }
    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("no numbers");
        }
        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max: " + result);


    }

}
