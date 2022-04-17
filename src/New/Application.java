package New;

public class Application{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.getName();
        student1.setAge(18);
        int age = student1.getAge();

        System.out.println(age);
    }
    
}