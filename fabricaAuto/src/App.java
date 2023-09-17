public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();
        carro.setModelo("teste");

        System.out.println("Carro" + carro.getModelo());
    }
}
