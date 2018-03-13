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
public class ExemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InfoTool.nomeUsuario = "Gustavo";
        InfoTool.versaoApp = "1.0";
        
        Termometro.tempCelsius = 10;
        
        System.out.println(Termometro.toCelsuis());
        System.out.println(Termometro.toKelvin());
        System.out.println(Termometro.toFahrenheit());
        

        
        //System.out.println(InfoTool.getInfo());
        
        Pessoa p = new Pessoa("Zezinho","111.111.111-11");
        System.out.println(p.showInfo());
        
    }
    
}
