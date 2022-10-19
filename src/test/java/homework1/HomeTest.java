package homework1;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeworkTest() {
        Carpet carpet = new Carpet();
        carpet.setLenght(175.5);
        carpet.setWeight(10.3);
        carpet.setShape("Rectangle");
        carpet.setWidth(50.7);
        carpet.setFabric("Polyester");

        Chair chair = new Chair();
        chair.setColor("White");
        chair.setMaterial("Wood");
        chair.setLegs(4);
        chair.setHeight(50.40);
        chair.setBackrest(true);

        ChessDrawer chessDrawer = new ChessDrawer();
        chessDrawer.setNumberOfDrawers(9);
        chessDrawer.setLength(100.50);
        chessDrawer.setWidth(80.7);
        chessDrawer.setMaterial("Wood");
        chessDrawer.setColor("Black");

        Door door = new Door();
        door.setHight(200.50);
        door.setGlass(false);
        door.setDoorHandleStyle("Round");
        door.setWidth(80.5);
        door.setMaterial("Wood");

        FirePlace firePlace = new FirePlace();
        firePlace.setShape("Rectangle");
        firePlace.setHeater(true);
        firePlace.setWidth(55.5);
        firePlace.setLength(110.5);
        firePlace.setColor("Multicolor");

        Lamp lamp = new Lamp();
        lamp.setBluetooth(true);
        lamp.setStyle("Round");
        lamp.setManufacturer("Samsung");
        lamp.setBulbType("LED");
        lamp.setBulbAmount(4);

        Sofa sofa = new Sofa();
        sofa.setSeatAmount(3);
        sofa.setStyle("Sectional");
        sofa.setFabric("Leather");
        sofa.setColor("Black");
        sofa.setLenght(200.5);

        Table table = new Table();
        table.setColor("Dark wood");
        table.setHeight(75.6);
        table.setStyle("Rectangle");
        table.setLenght(95.5);
        table.setLegAmount(4);
        table.setLegHeight(70.5);
        table.setWeight(6.54);

        Unit unit = new Unit();
        unit.setShelves(5);
        unit.setStyle("Wall unit");
        unit.setColor("Oak");
        unit.setDrawers(3);
        unit.setHeight(120.7);
        unit.setLenght(200.5);

        Wall wall = new Wall();
        wall.setWallpaper(false);
        wall.setLenght(330.5);
        wall.setSockets(3);
        wall.setHeight(210.7);
        wall.setColor("Yellow");

        System.out.println("Carpet attributes: ");
        System.out.println("Length: " + carpet.getLenght());
        System.out.println("Weight: " + carpet.getWeight());
        System.out.println("Width: " + carpet.getWidth());
        System.out.println("Shape: " + carpet.getShape());
        System.out.println("Fabric: " + carpet.getFabric());
        System.out.print("\n");

        System.out.println("Chair attributes: ");
        System.out.println("Material: " + chair.getMaterial());
        System.out.println("Height: " + chair.getHeight());
        System.out.println("Color: " + chair.getColor());
        System.out.println("Legs: " + chair.getLegs());
        System.out.println("Backrest: " + chair.isBackrest());
        System.out.print("\n");

        System.out.println("ChessDrawer attributes: ");
        System.out.println("Material: " + chessDrawer.getMaterial());
        System.out.println("Color: " + chessDrawer.getColor());
        System.out.println("Length: " + chessDrawer.getLength());
        System.out.println("Number of drawers: " + chessDrawer.getNumberOfDrawers());
        System.out.println("Width: " + chessDrawer.getWidth());
        System.out.print("\n");

        System.out.println("Door attributes: ");
        System.out.println("Material: " + door.getMaterial());
        System.out.println("Height: " + door.getHight());
        System.out.println("Door handle style: " + door.getDoorHandleStyle());
        System.out.println("Width: " + door.getWidth());
        System.out.println("Glass in door: " + door.isGlass());
        System.out.print("\n");

        System.out.println("Fire place attributes: ");
        System.out.println("Length: " + firePlace.getLength());
        System.out.println("Heater: " + firePlace.isHeater());
        System.out.println("Color: " + firePlace.getColor());
        System.out.println("Shape: " + firePlace.getShape());
        System.out.println("Width: " + firePlace.getWidth());
        System.out.print("\n");

        System.out.println("Lamp attributes: ");
        System.out.println("Bulb amount: " + lamp.getBulbAmount());
        System.out.println("Bluetooth: " + lamp.isBluetooth());
        System.out.println("Manufacturer: " + lamp.getManufacturer());
        System.out.println("Bulb type: " + lamp.getBulbType());
        System.out.println("Style: " + lamp.getStyle());
        System.out.print("\n");

        System.out.println("Sofa attributes: ");
        System.out.println("Color: " + sofa.getColor());
        System.out.println("Fabric: " + sofa.getFabric());
        System.out.println("Length: " + sofa.getLenght());
        System.out.println("Style: " + sofa.getStyle());
        System.out.println("Number of seats: " + sofa.getSeatAmount());
        System.out.print("\n");

        System.out.println("Table attributes: ");
        System.out.println("Color: " + table.getColor());
        System.out.println("Height: " + table.getHeight());
        System.out.println("Length: " + table.getLenght());
        System.out.println("Style: " + table.getStyle());
        System.out.println("Weight: " + table.getWeight());
        System.out.println("Leg amount: " + table.getLegAmount());
        System.out.println("Leg height: " + table.getLegHeight());
        System.out.print("\n");

        System.out.println("Unit attributes: ");
        System.out.println("Height: " + unit.getHeight());
        System.out.println("Color: " + unit.getColor());
        System.out.println("Length: " + unit.getLenght());
        System.out.println("Style: " + unit.getStyle());
        System.out.println("Number of drawers: " + unit.getDrawers());
        System.out.println("Number of shelves: " + unit.getShelves());
        System.out.print("\n");

        System.out.println("Wall attributes: ");
        System.out.println("Wallpaper: " + wall.isWallpaper());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Color: " + wall.getColor());
        System.out.println("Length: " + wall.getLenght());
        System.out.println("Number of wall sockets: " + wall.getSockets());

    }
}
