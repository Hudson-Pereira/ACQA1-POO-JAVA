/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hudson
 */
 // classe que nao podera ser instanciada
 abstract class Automovel {
    // atributos/variaveis
    private String cor, placa, modelo;
    private int ligado = 0, movimento = 0;
    // 0 - nao 1 - sim

    // funcao para mostrar a cor
    public String getCor() {
        return cor;
    }
    // funcao para definir a cor
    public void setCor(String cor) {
        this.cor = cor;
    }
    // funcao para mostrar a placa
    public String getPlaca() {
        return placa;
    }
    // funcao para definir a placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    // funcao para pegar o modelo
    public String getModelo() {
        return modelo;
    }
    // funcao para definir o modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    // funcao para ligar
    public void setLigar() {
        // tratativa de erro
        try{
            if (ligado == 0) { // validando estado
            ligado = 1;
                System.out.println("Automóvel ligado.");
            } else if (ligado == 1) {
                System.out.println("Automóvel já está ligado.");
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        } finally {
            System.out.println("Finalizado ligar...");
        }
    };
    // funcao para mover
    public void setMover() {
        //tratativa de erro
        try {
            if (ligado == 0) { // validando estado
                System.out.println("O automóvel está desligado, por favor, ligue-o antes de movimentá-lo.");
            }

            if (ligado == 1) {
                movimento = 1;
                System.out.println("Automóvel em movimento....");
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        } finally {
            System.out.println("Finalizado mover...");
        }
    }
    // funcao para parar
    public void setParar() {
        // tratativa de erro
        try {
            if (movimento == 0) { // validando estado
                System.out.println("Automóvel parado.");
            }

            if (movimento == 1) {
                System.out.println("Parando automóvel...");
                movimento = 0;
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado!!!");
        } finally {
            System.out.println("Finalizando parar...");
        }
    }

}
