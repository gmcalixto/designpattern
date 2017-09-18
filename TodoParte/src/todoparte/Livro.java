/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoparte;

import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Livro {

    private ArrayList<Folha> folhas = new ArrayList<>();;

    //garante a composição
    public Livro(ArrayList<Folha> folhas) {
        this.folhas = folhas;
    }

    public ArrayList<Folha> getFolhas() {
        return folhas;
    }

    public void setFolhas(ArrayList<Folha> folhas) {
        this.folhas = folhas;
    }
    
    
}
