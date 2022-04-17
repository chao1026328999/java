package method;

public class Demo1 {
    //main方法
    public static void main(String[] args) {
        System.out.println("add:"+add(1,2));
        System.out.println("add:"+add(1,2,3));
        System.out.println("max:"+max(1,1));
    }

    //加法
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }

    //比大小
    public static int max(int a,int b){
        if(a == b){
            System.out.print("a == b");
            return a;
        }
        return a > b ? a : b;
    }
}
