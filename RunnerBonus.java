public class RunnerBonus {

    public static void main(String[] args) {
        double randomAngle = Math.random() * 2 * Math.PI;

        double sineValue = Math.sin(randomAngle);
        double cosineValue = Math.cos(randomAngle);
        double tangentValue = Math.tan(randomAngle);

        System.out.println("Random angle (in radians): " + randomAngle);
        System.out.println("Sine of the angle: " + sineValue);
        System.out.println("Cosine of the angle: " + cosineValue);
        System.out.println("Tangent of the angle: " + tangentValue);
    }
}
