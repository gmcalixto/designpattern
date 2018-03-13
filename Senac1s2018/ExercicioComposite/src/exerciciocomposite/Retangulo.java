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
public class Retangulo extends Poligono {
    private double ladoA;
    private double ladoB;
    private List<IPoligono> poligonos = new ArrayList<>();

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

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }


    @Override
    public String getInfo() {
        return "Retangulo " + super.getId() + " " + this.ladoA + " " + this.ladoB;
    }
    
    
}
