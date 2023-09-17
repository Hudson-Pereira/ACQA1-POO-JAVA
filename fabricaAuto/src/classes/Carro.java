/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hudson
 */
import java.util.Scanner;

public class Carro extends Automovel {
    // metodo para entrada de dados
    Scanner entrada = new Scanner(System.in);
    // atributos/variaveis 0 - nao, 1 - sim
    int tetoSolar = 0, aberto = 0;
    
    public void setTeto(int tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void getTeto(){
        if (tetoSolar == 0) {
            System.out.println("Não.");
        }
        
        if (tetoSolar == 1) {
            System.out.println("Sim.");
        }
    }

    public void setAbrirFechar() {
        // tratativa de erros
        try{
            if (aberto == 0) { //verificando estado
                aberto = 1;
                System.out.println("Carro aberto.");
            }

            if (aberto == 1) {
                aberto = 0;
                System.out.println("Carro fechado.")
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        }finally{
            System.out.println("Finalizando...");
        }
    }
    
//TODO: verificar se está funcionando os metodos, avaliar se precisa de entrada manual(provavelmente)

}
