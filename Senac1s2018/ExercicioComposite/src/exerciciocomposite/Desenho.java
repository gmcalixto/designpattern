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
public class Desenho {
    private String nome;
    private List<IPoligono> poligonos = new ArrayList<>();

    public Desenho(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<IPoligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<IPoligono> poligonos) {
        this.poligonos = poligonos;
    }
    
    
}
