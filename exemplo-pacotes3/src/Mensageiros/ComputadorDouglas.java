package Mensageiros;

public class ComputadorDouglas {
    public static void main(String[] args) {
        
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger face = new FacebookMessenger();
        System.out.println("Facebook");
        face.enviarMensagem();
        face.receberMensagem();

        Telegram tel = new Telegram();
        System.out.println("Telegram");
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
