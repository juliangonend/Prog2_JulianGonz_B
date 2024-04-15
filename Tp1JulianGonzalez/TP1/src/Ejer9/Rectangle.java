package Ejer9;

public class Rectangle extends GeometricFigures{
    private float length;
    private float broad;

    public Rectangle(float length, float broad) {
        this.length = length;
        this.broad = broad;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }



    public float getBroad() {
        return broad;
    }

    public void setBroad(float broad) {
        this.broad = broad;
    }
    @Override
    public void CalculateArea() {
        double areaRectangle= this.getBroad()*this.getLength();
         setArea(areaRectangle);
        System.out.println("El area del Rectangulo es : "+ areaRectangle);
    }

    @Override
    public void CalculatePerimeter() {
        double perimeterRectangle= 2*(this.getBroad()*this.getLength());
        setPerimeter(perimeterRectangle);
        System.out.println("El Perimetro del Rectangulo es de : "+ perimeterRectangle);
    }
}
