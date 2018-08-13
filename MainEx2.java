package mainex2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        ArrayList<Pais>ListadePais=new ArrayList<Pais>();
        ArrayList<Pais>ListadePaisFront=new ArrayList<Pais>();
        System.out.println("----------------------");
        System.out.println("CADASTRO DE PAÍSES");
        System.out.println("----------------------");
        System.out.println("Quantos Países deseja Cadastrar: ");
        int opc=escreva.nextInt();
        for(int c=1;c<=opc;c++){
            System.out.println("NOME do "+c+"° País: ");
            String np=escreva.next();
            System.out.println("NOME da Capital: ");
            String nc=escreva.next();
            System.out.println("DIAMETRO: ");
            float dm=escreva.nextFloat();
            Pais p1=new Pais(np,nc,dm);
            System.out.println("Numero de Países que fazem Fronteira: ");
            int front=escreva.nextInt();
            for(int i=1;i<=front;i++){
                Pais p2=new Pais();
                System.out.println("Informe o nome do "+i+"° País que faz Fronteira:");
                p2.setPaisFront(escreva.next());
                ListadePaisFront.add(p2);
            }
            ListadePais.add(p1);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for(int d=0;d<ListadePais.size();d++){
            System.out.println(ListadePais.get(d).getNomePais());
            System.out.println(ListadePais.get(d).getNomeCap());
            System.out.println(ListadePais.get(d).getDime());
            
        }
        for(int e=0;e<ListadePaisFront.size();e++){
            System.out.println(ListadePaisFront.get(e).getPaisFront());
        }
        
        
    }
    
}
