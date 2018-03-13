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
public class InfoTool {
    public static String nomeUsuario = "";
    public static String versaoApp = "";
    
    public static String getInfo(){
        return InfoTool.nomeUsuario + " " + InfoTool.versaoApp;
    }
}
