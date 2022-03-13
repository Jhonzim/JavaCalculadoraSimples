
package projeto.calculadora;

public class ProjetoCalculadora {
    private boolean rodando ;
    private boolean ligado ;
    private int volume ;
    
    public ProjetoCalculadora(){
        rodando = false;
        ligado = false;
        volume = 50;
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
    public void Ligando(){
        if(getLigado() == false){
            setLigado(true);
        }
        else{
            setLigado(false);
        }
    }
    public void Play(){
        if(getRodando() == false){
            setRodando(true);
        }
        else{
            setRodando(false);
        }
    }
    public void volumeMais(){
        if(getVolume() < 100){
        setVolume(getVolume()+10);
    }
    }
    public void volumeMenos(){
        if(getVolume()>0){
            setVolume(getVolume()+10);
        }
    }
    public static void main(String[] args) {

    }
    
}
