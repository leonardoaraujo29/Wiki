/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */
public class Shape {
    private String name;
    Shape(String aName) {name = aName;}
    public String getName() {return name;}
    public float calculateArea() {return 0.0f;}

    public static void main(String argv[]) {
        Circle c = new Circle("Circle C");
        Square s = new Square("Square S");
        Triangle t = new Triangle("Triangle T");
        Shape shapeArray[] = {c,s,t};
        for(int i = 0;i<shapeArray.length;i++){
            System.out.println("The area of " + shapeArray[i].getName() + " is " + shapeArray[i].calculateArea() + " sq. cm.\n");
        }
    }
}

class Circle extends Shape {
    private int radius;
    Circle(String aName){
        super(aName);
        radius = 3;
    }
    public float calculateArea(){
        float area;
        area = (float) (3.14*radius*radius);
        return area;
    }
}

class Square extends Shape{
    private int side;
    Square(String aName){
        super(aName);
        side = 3;
    }
    public float calculateArea(){
        float area;
        area = side*side;
        return area;
    }
}

class Triangle extends Shape{
    private int base;
    private int height;
    Triangle(String aName){
        super(aName);
        base = 3;
        height = 3;
    }
    public float calculateArea(){
        float area;
        area = (float) base*height/2;
        return area;
    }
}