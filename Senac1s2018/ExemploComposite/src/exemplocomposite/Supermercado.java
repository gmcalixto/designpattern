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
public class Supermercado extends Loja {

    private String tipoSupermercado;
    private List<ILoja> lojas = new ArrayList();

    public Supermercado(String tipoSupermercado, String nome) {
        super(nome);
        this.tipoSupermercado = tipoSupermercado;
    }
    
    public String getTipoSupermercado() {
        return tipoSupermercado;
    }

    public void setTipoSupermercado(String tipoSupermercado) {
        this.tipoSupermercado = tipoSupermercado;
    }

    public List<ILoja> getLojas() {
        return lojas;
    }

    public void setLojas(List<ILoja> lojas) {
        this.lojas = lojas;
    }
    
    
    
    @Override
    public String getInfo() {
        
        String temp = ""; 
        
        for (ILoja loja : lojas) {
            temp+=loja.getInfo();
            temp+=" ";
        }
        
        return super.getNome() + " " + this.getTipoSupermercado() + " " + temp;
        
    }
    
}
