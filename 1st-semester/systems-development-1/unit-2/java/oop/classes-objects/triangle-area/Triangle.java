public class Triangle {
    public double base, height, area;

    public void setBase(double base)  {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void areaCalculation() {
        area = (base * height) / 2;
    }
}