public class toy{
    String name;
    String brand;
    double price;
    int quanrtity;


    void setPrice(double price){

        this.price = price;
    }
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "bighead";
        toy1.price = 400;
        toy1.quanrtity =12;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);


    }
}