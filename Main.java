package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Porta> ListadePortas=new ArrayList<Porta>();
        int opcc=0;
        Scanner escreva=new Scanner(System.in);
        Porta p1=new Porta();
        System.out.println("DESEJA CRIAR QUANTAS PORTAS: ");
        int quan=escreva.nextInt();
            for(int c=1;c<=18;c++){
                while(opcc!= 11){
                    System.out.println("PORTA "+c+"° ABERTA COM SUCESSO!!!");
                    p1.CriarPorta();
                    p1.Status();
                    System.out.println("======================================= M E N U =======================================");
                    System.out.println("[01]ABRIR PORTA                [02]FECHAR PORTA           [03]PINTAR PORTA\n"
                            + "[04]MUDAR ALTURA               [05]MUDAR LARGURA          [06]MUDAR DIAMETRO\n[07]VERIFICAR SE ESTAR ABERTA  [08]VERIFICAR STATUS       [09]ADICIONAR UMA NOVA PORTA\n[10]VISUALIZAR PORTAS          [11]SAIR");
                    System.out.println("======================================================================================="); 
                    System.out.print("OPÇÃO: ");
                    opcc=escreva.nextInt();
                    switch(opcc){
                        case 1:
                            p1.AbrirPorta();
                            System.out.println("----------------------------");
                            System.out.println("PORTA ABERTA COM SUCESSO!!");
                            System.out.println("----------------------------");
                            break;
                        case 2:
                            p1.FecharPorta();
                            System.out.println("----------------------------");
                            System.out.println("PORTA FECHADA COM SUCESSO!!");
                            System.out.println("----------------------------");
                            break;
                        case 3:
                            System.out.print("NOVA COR:  ");
                            p1.setCor(escreva.next());
                            System.out.println("----------------------------");
                            System.out.println("COR INCERIDA COM SUCESSO!!");
                            System.out.println("----------------------------");
                            break;
                        case 4:
                            System.out.print("NOVA ALTURA: ");
                            p1.setDimeX(escreva.nextFloat());
                            System.out.println("-----------------------------");
                            System.out.println("ALTURA ALTERADA COM SUCESSO!!");
                            System.out.println("-----------------------------");
                            break;
                        case 5:
                            System.out.print("NOVA LARGURA: ");
                            p1.setDimeY(escreva.nextFloat());
                            System.out.println("-------------------------------");
                            System.out.println("LARGURA ALTERADA COM SUCESSO!!");
                            System.out.println("-------------------------------");
                            break;
                        case 6:
                            System.out.println("NOVO DIAMETRO: ");
                            p1.setDimeZ(escreva.nextFloat());
                            System.out.println("--------------------------------");
                            System.out.println("DIAMETRO ALTERADO COM SUCESSO!!");
                            System.out.println("--------------------------------");
                            break;
                        case 7:
                            p1.VerificarStatus();
                            break;
                        case 8:
                            p1.Status();
                            break;

                    }
                    

                }
                ListadePortas.add(p1);
            }
            for(int i=0;i<ListadePortas.size();i++)
                System.out.println(ListadePortas.get(i).getCor());
           

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
        
    }
    
}
