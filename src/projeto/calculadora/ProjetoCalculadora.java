
package projeto.calculadora;

public class ProjetoCalculadora implements Interface {
    
    private boolean rodando ;
    private boolean ligado ;
    private int volume ;
    
    public ProjetoCalculadora(){
        this.rodando = false;
        this.ligado = false;
        this.volume = 50;
    }
    private boolean getRodando(){
        return this.rodando;
    }
    private void setRodando(boolean pRodando){
        this.rodando = pRodando;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean pLigado){
        this.ligado = pLigado;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int pVolume){
        this.volume = pVolume;
    }
    @Override
    public void Ligando(){
        if(getLigado() == false){
            setLigado(true);
        }
        else{
            setLigado(false);
        }
    }
    @Override
    public void Play(){
        if(getRodando() == false){
            setRodando(true);
        }
        else{
            setRodando(false);
        }
    }
    @Override
    public void volumeMais(){
        if(getVolume() < 100){
        setVolume(getVolume()+10);
    }
    }
    @Override
    public void volumeMenos(){
        if(getVolume()>0){
            setVolume(getVolume()+10);
        }
    }
    public static void main(String[] args) {

    }
    
}
