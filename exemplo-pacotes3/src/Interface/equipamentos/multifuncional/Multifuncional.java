package Interface.equipamentos.multifuncional;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora,  Impressora{

    @Override
    public void copiar() {
        System.out.println("Copiando via Multifuncioal");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Multifuncional");
    }

}
