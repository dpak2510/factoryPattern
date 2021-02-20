import vehicles.*;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleFactory vc = new VehicleFactory();
        Car car = (Car) vc.createVehicle(VehicleType.CAR);
        System.out.println(car);
        Bus bus = (Bus) vc.createVehicle(VehicleType.BUS);
        System.out.println(bus);
        Vehicle train = vc.createVehicle(VehicleType.TRAIN);
        System.out.println(train);
    }
}
