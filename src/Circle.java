public class Circle {
    private double Radius;
    private String color;
    public Circle(double Radius,String color){
        this.Radius = Radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return Radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
    public double getArea(){
        return Math.PI*Radius*Radius;
    }
    public String toString(){
        return "Cirle có radius \t" + getRadius() + "\t"+ "color \t" + getColor() + "\t"
                + "Area \t" + getArea();
    }
}
