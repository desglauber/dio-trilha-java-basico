package Mensageiros;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConexaoInternet() {
        System.out.println("Validando a conexão com a Internet");
    }
    private void salvarHistorico() {
        System.out.println("Salvando o histórico de mensagens");
    }
}
