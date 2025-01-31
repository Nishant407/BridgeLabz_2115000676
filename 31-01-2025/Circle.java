class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.displayResults();
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double userRadius = input.nextDouble();

        Circle userCircle = new Circle(userRadius);
        userCircle.displayResults();

        input.close();
    }
}
