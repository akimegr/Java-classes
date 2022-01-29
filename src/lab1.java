public class lab1 {


    public static void main(String[] args) {
//        Driver driver = new Driver();
//        System.out.println(driver.doc);
//        Driver driver2 = new Driver(20,"Art");
//
//        driver.go(25);
//        System.out.println(driver2.age);
//        System.out.println(driver2.name);
        First uu = new First();
        uu.g(5);
        Sec qq = new Sec();
        qq.g(2);

    }
}

class First{
    int a = 4;
    void g (int a){
        System.out.println(a);
    }
}
class Sec extends First{
    int b = 5;
@Override
    void g (int a){
        System.out.println(a+a);
    }

}

abstract class Person{
    private int age;
    private String name;
    abstract void go (int a);


}

class Driver extends Person {
    String doc = "Есть права";
    int age;
    String name;

    Driver(int age, String name){
        this.age = age;
        this.name = name;
    }
    Driver(){

    }
    @Override
   void go(int a){
       System.out.println("Я еду " + a );
   }
}
