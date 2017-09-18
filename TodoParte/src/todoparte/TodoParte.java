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
public class TodoParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //folhas criadas
        ArrayList<Folha> folhas = new ArrayList<>();
        folhas.add(new Folha());
        
        //armario
        Armario a = new Armario();
    
        //livro exigindo filhas
        Livro l = new Livro(folhas);
        //adicionando livro no armario
        a.getLivros().add(l);
        
        
        
    }
    
}
