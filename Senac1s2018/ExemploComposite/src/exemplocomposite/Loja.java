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
public abstract class Loja implements ILoja {
    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
