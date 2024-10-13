public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5.0); 
        String information = c.getInfo();
        System.out.println(information);

        c.setRadius(9.2);
        information = c.getInfo();
        System.out.println(information);
    }
}
