public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("=========================== Carro com teto solar. ================================");
        
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setModelo("Ford");
        carro.setPlaca("hxx-1111");
        carro.setTeto(1);
    
        System.out.println("teto: " + carro.getTeto());
        System.out.println("cor: " + carro.getCor());
        System.out.println("modelo: " + carro.getModelo());
        System.out.println("placa: " + carro.getPlaca());

        System.out.println("=========================== Carro sem teto solar. ================================");

        Carro carro2 = new Carro();
        carro2.setCor("Branco");
        carro2.setModelo("Fiat");
        carro2.setPlaca("hxx-2222");
        carro2.setTeto(0);

        System.out.println("teto: " + carro2.getTeto());
        System.out.println("cor: " + carro2.getCor());
        System.out.println("modelo: " + carro2.getModelo());
        System.out.println("placa: " + carro2.getPlaca());

        System.out.println("===================== Funções em funcionamento =======================================");
        System.out.println("Funcao para abrir carro.");
        carro.setAbrirFechar();
        System.out.println("aberto: " + carro.getAbrirFechar());
        System.out.println("Movendo carro desligado.");
        System.out.println("movendo: " + carro.getMover());
        System.out.println("ligado: " + carro.getLigado());
        System.out.println("Funcao para ligar carro.");
        carro.setLigar();
        System.out.println("Movendo carro.");
        carro.setMover();
        System.out.println("movendo: " + carro.getMover());
        System.out.println("Funcao para parar carro.");
        carro.setParar();
        System.out.println("Funcao para fechar carro.");
        carro.setAbrirFechar();
        System.out.println("aberto: " + carro.getAbrirFechar());        

        System.out.println("========================== MOTO ==========================");
        
        Moto moto = new Moto();
        moto.setCor("branca");
        moto.setModelo("honda");
        moto.setPlaca("yyyy-3333");

        System.out.println("Moto.");
        System.out.println("cor: " + moto.getCor());
        System.out.println("modelo: " + moto.getModelo());
        System.out.println("placa: " + moto.getPlaca());        
        System.out.println("Funcao para ligar alarme.");
        moto.setAlarme();
    }
}
