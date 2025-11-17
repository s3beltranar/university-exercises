public class Main {
    public static void main (String[] args) {
        Triangle triangle1 = new Triangle();

        triangle1.setBase(67);
        triangle1.setHeight(120);
        triangle1.areaCalculation();

        System.out.println("Triangle base: " + triangle1.base);
        System.out.println("Triangle height: " + triangle1.height);
        System.out.println("Triangle area: " + triangle1.area);
    }
}
