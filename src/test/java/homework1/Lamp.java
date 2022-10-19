package homework1;

public class Lamp {

    private String bulbType;
    private int bulbAmount;
    private String style;
    private boolean bluetooth;
    private String manufacturer;

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }

    public int getBulbAmount() {
        return bulbAmount;
    }

    public void setBulbAmount(int bulbAmount) {
        this.bulbAmount = bulbAmount;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
