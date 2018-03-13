/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocomposite;

/**
 *
 * @author gustavo.mcalixto
 */
public class ExemploComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shopping s = new Shopping("SPMarket", "Jurubatuba");
        
        s.getLojas().add(new Departamento("Roupas", "Marisa"));
        s.getLojas().add(new Alimentacao("Fastfood", "MC Donalds"));
        
        Supermercado supMer = new Supermercado("hiper", "Extra");
        supMer.getLojas().add(new Alimentacao("Fastfood", "Habibs"));
        supMer.getLojas().add(new Departamento("perfumaria", "Boticario"));
        
        s.getLojas().add(supMer);
        
        for (ILoja loja : s.getLojas()) {
            System.out.println(loja.getInfo());
        }
        
    }
    
}
