public class Main {
    public static void main(String[] args) {
        Car car = new Car("Model 3", "Tesla", 2023, 45000.0, "Red", 5);

        System.out.println(car.toString());

        car.sell();

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Black");
        car.setPrice(42000.0);

        System.out.println(car.toString());
    }
}