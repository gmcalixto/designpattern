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
public class Alimentacao extends Loja {

    private String tipoAlimento;

    public Alimentacao(String tipoAlimento, String nome) {
        super(nome);
        this.tipoAlimento = tipoAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    
    
    @Override
    public String getInfo() {
        return super.getNome() + " " + this.getTipoAlimento();
    }
    
}
