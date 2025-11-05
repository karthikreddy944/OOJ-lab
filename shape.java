abstract class shape1{
    int x;
    int y;
    abstract void printArea();
}
class Rectangle extends shape1{
    public Rectangle(int l,int b){
        this.x=l;
        this.y=b;

    }
    void printArea(){
        int Area=this.x*this.y;
        System.out.println("Area of rectangle: "+Area);
    }
}
class Triangle extends shape1{
    public Triangle(int base,int height){
        this.x=base;
        this.y=height;

    }
    void printArea(){
        double Area=0.5*this.x*this.y;
        System.out.println("Area of Triangle: "+Area);
    }
}
class Circle extends shape1{
    public Circle(int r){
        this.x=r;
        this.y=r;
    }
    void printArea(){
        double Area=3.14*this.x*this.y;
        System.out.println("Area of Circle: "+Area);
    }
}
class shape{
    public static void main(String arr[]){
        Rectangle r1=new Rectangle(2,3);
        Triangle t1=new Triangle(4,5);
        Circle c1=new Circle(3);
        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}