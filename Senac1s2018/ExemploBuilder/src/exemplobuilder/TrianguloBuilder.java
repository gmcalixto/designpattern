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
public final class TrianguloBuilder {
    
    private TrianguloBuilder(){
        
    }
    
    public static Triangulo criarTrianguloEquilatero(double lado){
        return new Triangulo(lado, lado, lado);
    }
    
    public static Triangulo criarTrianguloIsosceles(double base,double lados){
        return new Triangulo(base, lados, lados);
    }
    
    public static Triangulo criarTrianguloEscaleno(double ladoA,double ladoB, double ladoC){
        return new Triangulo(ladoA, ladoB, ladoC);
    }
    
    public static Triangulo criarTrianguloPitagoras(double escala){
        return new Triangulo(3*escala,4*escala,5*escala);
    }
}
