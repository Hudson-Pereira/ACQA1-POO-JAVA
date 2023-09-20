public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setModelo("Ford");
        carro.setPlaca("hdw-1111");
        carro.setAbrirFechar();
        carro.setTeto(0);
    
        System.out.println("aberto: " + carro.getAbrirFechar());
        System.out.println("teto: " + carro.getTeto());
        System.out.println("cor: " + carro.getCor());
        System.out.println("modelo: " + carro.getModelo());
        System.out.println("placa: " + carro.getPlaca());
        carro.setAbrirFechar();

        System.out.println("aberto: " + carro.getAbrirFechar());
        System.out.println("movendo: " + carro.getMover());
        System.out.println("ligado: " + carro.getLigado());

        carro.setMover();
        System.out.println("movendo: " + carro.getMover());
        
        carro.setParar();
        System.out.println("movendo: " + carro.getMover());

        carro.setAbrirFechar();
        System.out.println("aberto: " + carro.getAbrirFechar());

        carro.setLigar();
        System.out.println("ligado: " + carro.getLigado());
        
        carro.setMover();
        System.out.println("movendo: " + carro.getMover());
        
        carro.setParar();
        System.out.println("movendo: " + carro.getMover());

    }
}
