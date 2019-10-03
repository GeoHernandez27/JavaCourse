package chapter6;

public class Rectangle {

    private double length;
    private double width;

//    CONSTRUCTORS
    public Rectangle(){ //DEFAULT CONSTRUCTOR

        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length); //Can be set this way
        this.width = width; //or this way
    }
//    GETTER
   public double getLength(){
        return length;
    }

    public  double getWidth(){
        return width;
    }
//    SETTER
        public void setLength(double length) {
        this.length = length;
    }

    public    void setWidth(double width){
        this.width = width;
    }

    public   double calculatePerimeter(){
            return (2 * length) + (2 * width);
    }

    public  double calculateArea(){
        return length * width;
    }

}
