package Veiculos;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("5464656");
        //jeep.ligar();

        Moto cb800 = new Moto();
        cb800.setChassi("2366544");
        //cb800.ligar();

        Veiculo batman = cb800;

        batman.ligar();
    }
}
