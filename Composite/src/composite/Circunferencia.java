/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;
import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Circunferencia extends Poligono {

    private double raio;
    
    private List<IPoligono> poligonos = new ArrayList<>();

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }

    public Circunferencia(double raio, int id) {
        super(id);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.raio,2);
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*this.raio;
    }

    @Override
    public String getInfo() {
        return "Circunferencia ID: " + this.getId() + " " + "Raio: " + this.raio + "\n";
    }
    
}
