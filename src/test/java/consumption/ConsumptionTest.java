package consumption;

import org.junit.jupiter.api.Test;

public class ConsumptionTest {
    @Test
    public void consumptionTest() {

        Vehicle vehicle = new Vehicle();
        vehicle.setType("Car");
        vehicle.setTankCapacity(47.00);
        vehicle.setFuelConsumption(6.9);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setType("Train");
        vehicle1.setTankCapacity(6300.00);
        vehicle1.setFuelConsumption(400);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setType("Plane");
        vehicle2.setTankCapacity(238840.00);
        vehicle2.setFuelConsumption(12.00);

        Route route = new Route();
        route.setStartingPoint("Riga");
        route.setDestination("Tallin");
        route.setDistance(316.00);

        Route route1 = new Route();
        route1.setStartingPoint("Riga");
        route1.setDestination("Minsk");
        route1.setDistance(472.5);

        Route route2 = new Route();
        route2.setStartingPoint("Riga");
        route2.setDestination("New Zealand");
        route2.setDistance(17258.00);

        System.out.println("Route from " + route.getStartingPoint() + " to " + route.getDestination());
        getData(vehicle.getType(), vehicle.getFuelConsumption(), vehicle.getTankCapacity(), route.getDistance());
        getData(vehicle1.getType(), vehicle1.getFuelConsumption(), vehicle1.getTankCapacity(), route.getDistance());
        getData(vehicle2.getType(), vehicle2.getFuelConsumption(), vehicle2.getTankCapacity(), route.getDistance());
        System.out.print("\n");

        System.out.println("Route from " + route1.getStartingPoint() + " to " + route1.getDestination());
        getData(vehicle.getType(), vehicle.getFuelConsumption(), vehicle.getTankCapacity(), route1.getDistance());
        getData(vehicle1.getType(), vehicle1.getFuelConsumption(), vehicle1.getTankCapacity(), route1.getDistance());
        getData(vehicle2.getType(), vehicle2.getFuelConsumption(), vehicle2.getTankCapacity(), route1.getDistance());
        System.out.print("\n");

        System.out.println("Route from " + route2.getStartingPoint() + " to " + route2.getDestination());
        getData(vehicle.getType(), vehicle.getFuelConsumption(), vehicle.getTankCapacity(), route2.getDistance());
        getData(vehicle1.getType(), vehicle1.getFuelConsumption(), vehicle1.getTankCapacity(), route2.getDistance());
        getData(vehicle2.getType(), vehicle2.getFuelConsumption(), vehicle2.getTankCapacity(), route2.getDistance());
    }

    private void getData(String type, Double fuelConsumption, Double tankCapacity, Double distance) {

        System.out.print(type + " ");
        System.out.print(tankCapacity + " ");
        if (tankCapacity >= distance / 100 * fuelConsumption) {
            System.out.print("Can be reached by one fuel tank\n");
        } else {
            System.out.print("Can NOT be reached by one fuel tank\n");
        }
    }
}
