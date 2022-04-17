package method;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(factorial(50));
    }

    //阶乘 递归 3！ = 3*2*1
    static public double factorial (int i){
        if(i == 1 || i == 0) {
            return 1;
        }
        else
            return i*factorial(i-1);

    }

}
