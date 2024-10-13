public class TestTriangle {
    public static void main(String[] args) {
        RightTriangle x = new RightTriangle(3.0, 4.0);
        RightTriangle y = new RightTriangle(6.5, 10.7);
        double hypotenuse1 = x.hypotenuse(); 
        double hypotenuse2 = y.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2); 
    }
}
