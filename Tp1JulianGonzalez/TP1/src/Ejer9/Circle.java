package Ejer9;

public class Circle extends GeometricFigures{
    private float radio;

    public Circle(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void CalculateArea() {
        double areaCircle=Math.PI * Math.pow(this.getRadio(), 2);
        setArea(areaCircle);
        System.out.println("El area del circulo es "+ areaCircle);
    }

    @Override
    public void CalculatePerimeter() {
        double perimeter=  2 * Math.PI * this.getRadio();
        setPerimeter(perimeter);
        System.out.println("El perimetro del circulo es "+ perimeter);
    }
}
