/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public class Retangulo extends Poligono {

    public double ladoA;
    public double ladoB;

    public Retangulo(double ladoA, double ladoB, int id) {
        super(id);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    
    
    @Override
    public double getArea() {
        return this.ladoA*this.ladoB;
    }

    @Override
    public double getPerimetro() {
        return 2*(this.ladoA + this.ladoB);
    }

    @Override
    public String getInfo() {
        return "Retangulo ID: " + this.getId() + " " + "Lado A: " + this.ladoA + " Lado B: " + this.ladoB + "\n";
    }
    
}
