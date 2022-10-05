package baitap2;

public class Main {
    public static void main(String[] args) {
        shape[] shapes = new shape[3];
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square) {
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
