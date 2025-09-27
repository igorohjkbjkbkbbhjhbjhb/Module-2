interface Transport{
    void move();
}
class Car implements Transport{
    @Override
    public void move() {
        System.out.println("car drive");
    }
}
class Bike implements Transport{
    @Override
    public void move() {
        System.out.println("Bike smash");
    }
}
class TransportManager{
    void startTransport(Transport transport){
        transport.move();
    }
}
public class dz2 {

}
