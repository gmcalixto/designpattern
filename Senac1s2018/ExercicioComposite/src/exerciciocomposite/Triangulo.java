/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocomposite;
import java.util.*;
/**
 *
 * @author gustavo.mcalixto
 */
public class Triangulo extends Poligono {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private List<IPoligono> poligonos =  new ArrayList<>();

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }

    
    public Triangulo(double ladoA, double ladoB, double ladoC, int id) {
        super(id);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
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

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    
    @Override
    public String getInfo() {
        return "Triangulo " + super.getId() + " " + this.ladoA + " " + this.ladoB + " " + this.ladoC;
    }
    
    
}
