package OOP;

public class Demo4 {
    public static void main(String[] args) {
        int a = 1,b = 2;
        Person person = new Person();
        System.out.println("original:"+a+","+b);
        exchange(a,b);
        System.out.println("now:"+a+","+b);
        System.out.println("==================================");
        System.out.println(person.a);
        System.out.println(person.b);
        exchangeclass(person);
        System.out.println(person.a);
        System.out.println(person.b);
    }



    public static void exchange(int a,int b){
        int t = 0;
        t = a;
        a = b;
        b = t;
    }
    public static void exchangeclass(Person person){
        int t;
        t = person.a;
        person.a = person.b;
        person.b = t;
    }
}

class Person{
    int a=1  ,b=2;
}
