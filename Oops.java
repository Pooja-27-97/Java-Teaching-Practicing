public class Oops {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Dark Blue";
        c1.brand = "BMW";
        c1.year = 1998;
        System.out.println(c1.brand);
        System.out.println(c1.color);

        Car c2 = new Car();
        c2.brand = "Porsche";
        c2.color = "Black";
        System.out.println(c2.brand);
        System.out.println(c2.color);

        Car c3 = new Car();
        c3.setColor("Peach");
        System.out.println(c3.color);
    }
}

class Car {
    String color;
    String brand;
    int year;

    void setColor(String newColor) {
        color = newColor;
    }
}