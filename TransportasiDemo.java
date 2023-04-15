import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil objectMobil = new Mobil();
        objectMobil.info();

        Bicycle objectBicycle = new Bicycle();
        objectBicycle.info();
    }
}