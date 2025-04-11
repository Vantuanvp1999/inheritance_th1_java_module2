public class testSquare {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);
        Square s2 = new Square(4);
        System.out.println(s2);
        Square s3 = new Square("yellow",false,5.3);
        System.out.println(s3);
    }
}
