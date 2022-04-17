package Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("next:");

        //判断用户有没有输入
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的内容："+ str);
        }

        scanner.close();
    }
}
