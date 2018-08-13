package main;
public class Casa {
    private String cor;
    private Porta Porta1;
    private Porta porta2;
    private Porta porta3;
    
    public void Pintar(String s){
    this.setCor(this.getCor());
    }
    public void PortasAbertas(){
        
        
    }
    public void TotPortas(){
        
     
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return Porta1;
    }

    public void setPorta1(Porta Porta1) {
        this.Porta1 = Porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    
    
}
