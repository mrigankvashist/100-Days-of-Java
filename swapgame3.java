public class swapgame3{
    public static class person{
        int age;
        String name;
        void sayhi(){
            System.out.println(name + "[" + age + "] says hi");
        }
    }
    public static void main(String[] args) {

        // here we have 2 references p1,p2
        person p1 = new person();
        person p2 = new person();

        p1.age = 19;
        p1.name = "a";
        // p1.sayhi();

        p2.age = 22;
        p2.name = "b";
        // p2.sayhi();
        
        p1.sayhi();
        p2.sayhi(); 
        swap1(p1, p2);
        p1.sayhi();
        p2.sayhi();
    }

    //only references are being swapped here i.e. p1 and p2, which will die as soon as fn is terminated
    public static void swap1(person psn1,person psn2) {
        psn1 = new person();
        int age = psn1.age;
        psn1.age = psn2.age; // psn1 is new but psn2 is old, both point to same age, therefore psn2 points to new age = 0
        psn2.age = age;

        psn2 = new person();
        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
        
    }
}
