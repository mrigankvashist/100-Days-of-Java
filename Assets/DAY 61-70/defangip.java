
public class defangip {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(str.replace(".", "[.]"));
    }

}
