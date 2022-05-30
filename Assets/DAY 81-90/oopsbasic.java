

public class oopsbasic{
    public static class person{
        int age;
        String name;
        void sayhi(){
            System.out.println(name + "[" + age + "] says hi");
        }
    }
    public static void main(String[] args) {

        // here we have 3 references p1,p2,p3 
        // here we have only 2 references p1 and p2 due to new keyword
        person p1 = new person();
        person p2 = new person();

        p1.age = 19;
        p1.name = "a";
        p1.sayhi();

        p2.age = 22;
        p2.name = "b";
        p2.sayhi();

        person p3 = p1;
        p3.age = 25;
        p3.sayhi();
        p1.sayhi();
    }
}

