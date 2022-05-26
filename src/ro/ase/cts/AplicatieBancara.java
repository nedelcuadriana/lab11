package ro.ase.cts;
import java.util.ArrayList;
import java.util.List;

public class AplicatieBancara {
    private List<ContBancar> listaConturi;

    public AplicatieBancara() {
        listaConturi = new ArrayList<>();
    }

    public void creareContBancar(String nrCont, String nume, double suma){
        ContBancar cont = new ContBancar(nrCont, nume, suma);
        listaConturi.add(cont);
    }

    public void transferBancar(ContBancar contSender, ContBancar contReceiver, double suma) {
        contSender.setSuma(contSender.getSuma() - suma);
        contReceiver.setSuma(contReceiver.getSuma() + suma);
    }

    public void stergeCont(ContBancar cont) {
        listaConturi.remove(cont);
    }

    public void blocareCont(ContBancar cont) {
        cont.setBlocat(true);
    }

    public void adaugareCont(ContBancar cont) {
        listaConturi.add(cont);
    }

    public List<ContBancar> getListaConturi() {
        return listaConturi;
    }
}
