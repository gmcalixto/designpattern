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
public final class RetanguloBuilder {
    
    private RetanguloBuilder(){
        
    }
    
    public static Retangulo gerarQuadrado(double lado){
        return new Retangulo(lado, lado);
    }
    
    public static Retangulo gerarRetangulo(double ladoA, double ladoB){
        return new Retangulo(ladoA,ladoB);
    }
}
