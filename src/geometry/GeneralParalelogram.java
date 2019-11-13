/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Diak
 */
public class GeneralParalelogram implements Paralelogram {
    private double a;
    private double b;
    private double alfa;

    public GeneralParalelogram(double a, double b, double alfa) {
        this.a = a;
        this.b = b;
        this.alfa = alfa;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getAlfa() {
        return alfa;
    }
    
    
}
