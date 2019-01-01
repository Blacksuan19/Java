public class caTest{
    public static void main(String[] args) {
        ca a, b, c;
        a = new ca("something");
        b = new ca("something else");
        c = b;
        a.acclerate(10);
        b.acclerate(80);
        a = c;
        c.acclerate(50);
        System.out.println(a.getSpeed() + "");
        System.out.println(b.getSpeed() + "");
        System.out.println(c.getSpeed() + "");
    }
}