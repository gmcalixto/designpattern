/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobuilder;

/**
 *
 * @author gustavo.mcalixto
 */
public class ExemploBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo t1 = TrianguloBuilder.criarTrianguloEquilatero(10);
        Triangulo t2 = TrianguloBuilder.criarTrianguloIsosceles(20, 10);
        Triangulo t3 = TrianguloBuilder.criarTrianguloPitagoras(3);
        Retangulo r = RetanguloBuilder.gerarQuadrado(45);
        
        
        //System.out.println(t3.getLadoA());
        //System.out.println(t3.getLadoB());
        //System.out.println(t3.getLadoC());
        System.out.println(r.getLadoA());
        System.out.println(r.getLadoB());
        
    }
    
}
