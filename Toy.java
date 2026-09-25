public class Toy{
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price){
        this.price = price;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "rage pink";
        toy1.brand = "quiks";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice(2000);
        System.out.println(toy1.price);
    }
}