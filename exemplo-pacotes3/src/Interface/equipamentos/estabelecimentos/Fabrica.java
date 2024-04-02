package Interface.equipamentos.estabelecimentos;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Deskjet;
import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.impressora.Laserjet;
import Interface.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional multi = new Multifuncional();
        Impressora impressora = multi;
        Digitalizadora digital = multi;
        Copiadora copia = multi;

        impressora.imprimir();
        digital.digitalizar();
        copia.copiar();
    }
}
