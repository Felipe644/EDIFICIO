package main;
public class Porta {
    private boolean aberta;
    private String cor;
    private float dimeX;
    private float dimeY;
    private float dimeZ;
    
    public void Status(){
        System.out.println("============STATUS==========");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Altura: "+this.getDimeX()+"m");
        System.out.println("Largura: "+this.getDimeY()+"cm");
        System.out.println("Diametro: "+this.getDimeZ()+"cm");
        System.out.println("Está Aberta: "+this.getAberta());
        System.out.println("============================");
    }
    public void VerificarStatus(){
        if(this.aberta==true){
            System.out.println("STATUS PORTA: ABERTA");
        }else{
            System.out.println("STATUS PORTA: FECHADA");
        }
    }
      
    public void CriarPorta(){
        this.setAberta(false);
        this.setCor(this.getCor());
        this.setDimeX(2.10f);
        this.setDimeY(72.f);
        this.setDimeZ(3.0f);
    }
    public void AbrirPorta(){
        this.setAberta(true);
        System.out.println("ABERTA");
    }
    public void FecharPorta(){
        this.setAberta(false);
        System.out.println("FECHADA");
    }
    public void Pintar(String s){
        this.setCor(this.getCor());    
    }
    public void EstarAberta(){
        this.setAberta(this.getAberta());
    }
    

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimeX() {
        return dimeX;
    }

    public void setDimeX(float dimeX) {
        this.dimeX = dimeX;
    }

    public float getDimeY() {
        return dimeY;
    }

    public void setDimeY(float dimeY) {
        this.dimeY = dimeY;
    }

    public float getDimeZ() {
        return dimeZ;
    }

    public void setDimeZ(float dimeZ) {
        this.dimeZ = dimeZ;
    }
    
    
    
}
