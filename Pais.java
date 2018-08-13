package mainex2;
public class Pais {
    private String nomePais;
    private String nomeCap;
    private float dime;
    private String paisFront;

    public Pais() {
    }
    public void Status(){
        System.out.println("NOME: "+this.getNomePais());
        System.out.println("NOME CAPITAL: "+this.getNomeCap());
        System.out.println("DIAMETRO: "+this.getDime());
        System.out.println("LISTA DE PAÍSES QUE FAZEM FRONTEIRA: "+this.getPaisFront());
        
        
    }

    public Pais(String nomePais, String nomeCap, float dime) {
        this.nomePais = nomePais;
        this.nomeCap = nomeCap;
        this.dime = dime;
    }
    public void PaisIgual(Pais p1,Pais p2){
        if(p1.getNomePais().equals(p2.getNomePais())&& p1.getNomeCap().equals(p2.getNomeCap())){
            System.out.println("O País "+p1+" é igual ao País "+p2);
        }else{
            System.out.println("O País "+p1+" é Diferente do País "+p2);
        }
    }
    public void PaisFronteira(Pais p1,Pais p2){
        if(p1.getNomePais()!=(p2.getNomePais())&& p1.getNomeCap()!=(p2.getNomeCap())){
            
        }
    }
    
    
    

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getNomeCap() {
        return nomeCap;
    }

    public void setNomeCap(String nomeCap) {
        this.nomeCap = nomeCap;
    }

    public float getDime() {
        return dime;
    }

    public void setDime(float dime) {
        this.dime = dime;
    }

    public String getPaisFront() {
        return paisFront;
    }

    public void setPaisFront(String paisFront) {
        this.paisFront = paisFront;
    }
    
    
    
    
}
