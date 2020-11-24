package lab1;

public class Main {
    public static void main(String[] args) {
        Shape[] lab1 = new Shape[3];
        lab1[0] = new Circle (300, 100, 20);
        lab1[1] = new Rectangle (100,100,40,60);
        lab1[2] = new RedRectangle(200,200,20,30);
        for (Shape shape:lab1)
        {
            shape.printName();
            shape.draw();
        }
    }
}
