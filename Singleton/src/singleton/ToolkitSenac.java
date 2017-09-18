/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author gustavo.mcalixto
 */
public class ToolkitSenac {
    
    public static double PI = 3.14;
    
    public static double getAreaRetangulo(double ladoA, double ladoB){
        return ladoA * ladoB;
    }
    public static double getPerimetroRetangulo(double ladoA, double ladoB){
        return 2*(ladoA + ladoB);
    }
    public static boolean isQuadrado(double ladoA, double ladoB){
        return ladoA == ladoB;
    }
    
    public static double getAreaCircunferencia(double raio){
        return PI*raio*raio;
    }
    
    public static double getDiametroCircunferencia(double raio){
        return 2*raio;
    }
    public static double getComprimentoCircunferencia(double raio){
        return 2*PI*raio;
    }
}
