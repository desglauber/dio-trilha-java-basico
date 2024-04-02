package Mensageiros;

import Mensageiros.apps.FacebookMessenger;
import Mensageiros.apps.MSNMessenger;
import Mensageiros.apps.ServicoMensagemInstantanea;
import Mensageiros.apps.Telegram;

public class ComputadorDouglas {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcbk"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
