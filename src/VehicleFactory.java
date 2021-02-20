import vehicles.Bike;
import vehicles.Bus;
import vehicles.Car;
import vehicles.Train;
import vehicles.Vehicle;

public class VehicleFactory {
    public Vehicle createVehicle(VehicleType vt){
        switch(vt)
        {
            case CAR: return new Car();
            case BUS: return new Bus();
            case BIKE: return new Bike();
            case TRAIN: return new Train();
        }
        return null;
    }
}
