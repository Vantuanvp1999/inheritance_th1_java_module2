public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle2 = new Rectangle(3.5,2);
        System.out.println(rectangle2);
        Rectangle rectangle1 = new Rectangle("blue",false,4,2);
        System.out.println(rectangle1);
    }
}
