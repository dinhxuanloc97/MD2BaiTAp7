package rikkei_academy;

public class Main {
    public static void main(String[] args) {
//        // Kiểm thử class Shape
//        System.out.println("----------SHAPE--------------");
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        //Kiểm thử class Circle
//        System.out.println("----------CIRCLE--------------");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        //Kiểm thử class RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//        //Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
        Shape[] shapes=new Shape[3];
        shapes[0]= new Circle(3.5);
        shapes[1] = new Rectangle(2,6);
        shapes[2] = new Square(3);
        System.out.println("Truoc khi tang kich thuoc :");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println("sau khi tang ");
            shapes[i].resize(Math.random()*100);
            System.out.println(shapes[i]);
//            if (shapes[i] instanceof Square){
//                System.out.println(shapes[i]);
//            }
//
        }

//        System.out.println("Circle:"+shapes[0]);
//        System.out.println("Rectangle :"+shapes[1]);
//        System.out.println("Square : "+shapes[2]);
//        System.out.println("Sau khi tang kich thuoc : ");



    }
}
