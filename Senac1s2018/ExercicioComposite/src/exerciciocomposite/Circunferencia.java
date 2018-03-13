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
public class Circunferencia extends Poligono {
    private double raio;
    private List<IPoligono> poligonos = new ArrayList<>();

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

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }

    @Override
    public String getInfo() {
       return "Circunferencia " + super.getId() + " " + this.raio;
    }
    
    
}
