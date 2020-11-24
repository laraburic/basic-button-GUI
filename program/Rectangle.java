package lab1;

public class Rectangle extends Shape {
    protected int width;
    protected int height;
    protected int coordinateX;
    protected int coordinateY;

    public Rectangle (int width, int height, int coordinateX, int coordinateY)
    {
        this.name = "rectangle";
        this.width = width;
        this.height = height;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void draw() {
        System.out.println("This is a rectangle with a width of " + width + "and a height of " + height + "with coordinates (" + coordinateX + ", " + coordinateY + ")");
    }
}
