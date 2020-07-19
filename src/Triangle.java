public class Triangle extends Shape{
    private String color ;
    public Triangle(double side1, double side2, double side3, String color){
        super(side1, side2, side3);
        this.color = color;
    }
     public String getColor() {
         return color;
     }

     public void setColor(String color){
        this.color = color;
     }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(2,2,2,"green");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
