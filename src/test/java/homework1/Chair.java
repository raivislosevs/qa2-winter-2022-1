package homework1;

public class Chair {

    private String material;
    private String Color;
    private boolean backrest;
    private double height;
    private int legs;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isBackrest() {
        return backrest;
    }

    public void setBackrest(boolean backrest) {
        this.backrest = backrest;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
