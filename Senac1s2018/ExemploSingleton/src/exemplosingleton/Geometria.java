/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosingleton;

/**
 *
 * @author gustavo.mcalixto
 */
public final class Geometria {
    private Geometria(){
        
    }
    
    public static double getAreaRetangulo(double ladoA, double ladoB){
        return ladoA*ladoB;
    }
    
    public static double getPerimetroRetangulo(double ladoA, double ladoB){
        return ladoA+ladoB;
    }
    
    public static double getAreaTriangulo(double ladoA, double ladoB, double ladoC){
        //por Heron
        double p = (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }
    
    public static double getPerimetroTriangulo(double ladoA, double ladoB, double ladoC){
        return ladoA+ladoB+ladoC;
    }
    
    public static String getTipoTriangulo(double ladoA, double ladoB, double ladoC){
        if(ladoA == ladoB && ladoB == ladoC){
            return "Equilatero";
        }
        else if(ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
            return "Escaleno";
        }
        else return "Isosceles";
    }
}
