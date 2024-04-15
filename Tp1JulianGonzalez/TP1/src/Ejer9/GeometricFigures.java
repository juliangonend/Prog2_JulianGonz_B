package Ejer9;

public  abstract  class GeometricFigures {
    private double area;
    private double perimeter;

    public GeometricFigures() {
        this.area=0;
        this.perimeter=0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public  abstract  void CalculateArea();
    public  abstract  void CalculatePerimeter();
}
