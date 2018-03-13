/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocomposite;

/**
 *
 * @author gustavo.mcalixto
 */
public abstract class Poligono implements IPoligono {
    public int id;

    public Poligono(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
