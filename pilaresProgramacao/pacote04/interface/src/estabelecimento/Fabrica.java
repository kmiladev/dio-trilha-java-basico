package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new DeskJet();
        Impressora impressora1 = new LaserJet();
        Impressora impressora2 = new EquipamentoMultifuncional();
        
        impressora.imprimir();
        impressora1.imprimir();
        impressora2.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora3 = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora3.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
// interface quando precisamos de mais de uma utilizacao de classe, reutilizar varias classes para
//implementar suas fucoes.
//ex de uso interface: celular que implementa a interface para ligar, internet, reprodutor musical... etc... 
