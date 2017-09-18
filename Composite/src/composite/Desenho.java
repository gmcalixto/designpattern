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
public class Desenho {
    
    private List<IPoligono> poligonos = new ArrayList<>();

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }
    
    public String getInfo(){
        String temp = "";
        
        for (IPoligono poligono : poligonos) {
            temp += poligono.getInfo();
        }

        return temp;
    }
    
    
}
