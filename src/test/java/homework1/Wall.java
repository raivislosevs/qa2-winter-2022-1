package homework1;

public class Wall {

    private double lenght;
    private double height;
    private boolean wallpaper;
    private int sockets;
    private String color;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(boolean wallpaper) {
        this.wallpaper = wallpaper;
    }

    public int getSockets() {
        return sockets;
    }

    public void setSockets(int sockets) {
        this.sockets = sockets;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
