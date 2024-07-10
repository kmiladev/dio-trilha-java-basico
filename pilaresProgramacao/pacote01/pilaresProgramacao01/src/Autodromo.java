package pilares01;
public class Autodromo {
    public static void main(String[] args) throws Exception {
        
        Carro jeep = new Carro();
        jeep.setChassi("33251"); // set buscando a informação na classe veículo que foi extendida para carro
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("334455"); // set buscando a informação na classe veículo que foi extendida para moto
    }
    
}
