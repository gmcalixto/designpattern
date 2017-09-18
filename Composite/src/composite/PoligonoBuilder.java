/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public class PoligonoBuilder {
    
    enum TipoPoligono{
        RETANGULO,
        CIRCUNFERENCIA
    }
    
    private int id;

    public PoligonoBuilder(int id) {
        this.id = id;
    }
    
    public PoligonoBuilder(){
        this.id = 0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Retangulo geraRetangulo(double la,double lb){
        return new Retangulo(la,lb,id++);
    }
    
    public Retangulo geraRetangulo(){
        return new Retangulo(1,1,id++);
    }
    
    public Circunferencia geraCircunferecia(double r){
        return new Circunferencia(r,id++);
    }
    
    public Circunferencia geraCircunferecia(){
        return new Circunferencia(1,id++);
    }
    
    public IPoligono geraPoligono(TipoPoligono tp){
        switch(tp){
            case RETANGULO:
                return this.geraRetangulo();
            case CIRCUNFERENCIA:
                return this.geraCircunferecia();
            default:
                return null;
        }
    }
}
