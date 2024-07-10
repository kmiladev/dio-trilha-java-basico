package equipamentos.multifuncional;
// não podemos extend de copiadora, impressora e digitalizadora
// agora as outras classes deverão ser interfaces 

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

// fazemos as implementações para que Equipamentos herde as características das 3 interfaces (não mais classes abstrata que extende)
public class EquipamentoMultifuncional implements Copiadora,Digitalizadora,Impressora {
    public void copiar(){
        System.out.println("Copiando via equipamento Multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento Multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo via equipamento Multifuncional");
    }

}
