/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PoligonoBuilder pb = new PoligonoBuilder(5);
        
        //Retangulo r = new Retangulo(3, 2, 1);
        //Circunferencia c = new Circunferencia(10, 2);
        
        Desenho d = new Desenho();
        
        //adicionados dois elementos na lista
        d.getPoligonos().add(pb.geraCircunferecia(10));
        d.getPoligonos().add(pb.geraRetangulo(3, 2));
        d.getPoligonos().add(pb.geraPoligono(PoligonoBuilder.TipoPoligono.RETANGULO));
        d.getPoligonos().add(pb.geraPoligono(PoligonoBuilder.TipoPoligono.CIRCUNFERENCIA));
        
        System.out.println(d.getInfo());
        
    }
    
}
