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
public final class Termometro {
    
    //forca que nao seja aplicado o new
    private Termometro(){
        
    }
    
    public static double tempCelsius = 0;
    
    public static double toCelsuis(){
        return Termometro.tempCelsius;
    }
    
    public static double toKelvin(){
        return Termometro.tempCelsius + 273;
    }
    
    public static double toFahrenheit(){
        return Termometro.tempCelsius*1.8 + 32;
    }
}
