
package geometry;


public class GeneralRhombus implements Rhombus{
    public double a;
    public double alfa;

    public GeneralRhombus(double a, double alfa) {
        this.a = a;
        this.alfa = alfa;
    }

    public double getA() {
        return a;
    }

    public double getAlfa() {
        return alfa;
    }

    @Override
    public String toString() {
        return "GeneralRhombus{" + "a=" + a + ", alfa=" + alfa + '}';
    }
    
    
}
