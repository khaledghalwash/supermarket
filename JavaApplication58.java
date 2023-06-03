//marwan khaled ibrahim-2205057


package javaapplication58;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class shape implements Resizable{

protected String color;
protected java.util.Date dateCreated;

public shape(){}

    public shape(String color) {
        this.color = color;
    }
  
    public abstract double getArea();
}

interface Resizable{
  public void resize(int percent);
}

class Rectangle extends shape{
private double width;
private double height;

    public Rectangle(){}
    public Rectangle(double width, double height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
    
    public double getArea(){
    
    return width*height;
    
    }

    public void resize(int percent){
        width+=width*percent/100;
        height+=height*percent/100;
           
    }
     public String toString(){
      
        return "Rectangle width is: "+width+" Rectangle height is: "+height+" Rectangle area: "+"color: "+color+" "+getArea();
    }

}

class Circle extends shape{
 private double radius;

  public Circle(){}
    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
 
   
  public double getArea(){
    
    return Math.PI*radius*radius;
    
    }

    public void resize(int percent){
        
           radius+=radius*percent/100;
    }
  
    public String toString(){
      
        return "circle radius is: "+radius+" color: "+color+" Circle area is: "+getArea();
    }

}

public class JavaApplication58 extends Object {


    public static void main(String[] args) {
        
        Circle c1 = new Circle(3,"red");
        Circle c2 = new Circle(3.5,"blue");
        Rectangle r1 = new Rectangle(3.0,4.0,"green");
        
        List <shape> shapes=new ArrayList<>();
        shapes.add(r1);
        shapes.add(c1);
        shapes.add(c2);
        
        System.out.println(shapes);
//        for(int i=0;i<shapes.size();i++)
//            System.out.println(shapes.get(i));
        
        c1.resize(10);
        c1.resize(10);
        r1.resize(5);
        
        
        shapes.set(0,r1);
        shapes.set(1,c1);
        shapes.set(2,c2);
        System.out.println(shapes);
        System.out.println("\n"+"marwan khaled ibrahim-2205057");
        
        
    }
    
}
