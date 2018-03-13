/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocomposite;

import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Shopping {
    
    private String nomeShopping;
    private String endShopping;
    private List<ILoja> lojas  = new ArrayList<>();

    public Shopping(String nomeShopping, String endShopping) {
        this.nomeShopping = nomeShopping;
        this.endShopping = endShopping;
    }
    
    public List<ILoja> getLojas() {
        return lojas;
    }

    public void setLojas(List<ILoja> lojas) {
        this.lojas = lojas;
    }

    
 
    public String getNomeShopping() {
        return nomeShopping;
    }

    public void setNomeShopping(String nomeShopping) {
        this.nomeShopping = nomeShopping;
    }

    public String getEndShopping() {
        return endShopping;
    }

    public void setEndShopping(String endShopping) {
        this.endShopping = endShopping;
    }
    
    
}
