public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.5,"idigo",true);
        System.out.println(circle3);
    }
}
