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
public class Departamento extends Loja {
    private String tipoDepartamento;

    public Departamento(String tipoDepartamento, String nome) {
        super(nome);
        this.tipoDepartamento = tipoDepartamento;
    }

    public String getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(String tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    @Override
    public String getInfo() {
        return super.getNome() + " " + this.getTipoDepartamento();
    }
    
    
}
