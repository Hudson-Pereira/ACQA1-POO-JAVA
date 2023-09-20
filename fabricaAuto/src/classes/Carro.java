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
    private String aberto = "Não", tetoSolar;
    private int aux;
    
    public void setTeto(int aux) {
        try {
            if (aux == 0) {
                this.tetoSolar = "Não";
            }

            if (aux == 1) {
                this.tetoSolar = "Sim";
            }

        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        }
    }

    public String getTeto() {
        return tetoSolar;
    }

    public void setAbrirFechar() {
        // tratativa de erros
        try{
            if (this.aberto == "Não") { //verificando estado
                this.aberto = "Sim";
                System.out.println("Carro aberto.");
            } else if (this.aberto == "Sim") {
                this.aberto = "Não";
                System.out.println("Carro fechado.");
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        }
    }

    public String getAbrirFechar() {
        return aberto;
    }

}
