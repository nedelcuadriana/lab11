package ro.ase.cts.tests;

import org.junit.*;
import static org.junit.Assert.*;
import ro.ase.cts.*;

import java.util.ArrayList;
import java.util.List;

public class AplicatieBancaraTest {
    private AplicatieBancara aplicatieBancara;
    private ContBancar cont1;
    private ContBancar cont2;
    private List<ContBancar> listaConturi;
    private static int passedTests = 0;

    @Before
    public void setUp() {
        aplicatieBancara = new AplicatieBancara();
        cont1 = new ContBancar("000", "Test1", 100.99, false);
        cont2 = new ContBancar("001", "Test2", 200.01, false);

        aplicatieBancara.adaugareCont(cont1);
        aplicatieBancara.adaugareCont(cont2);

        listaConturi = new ArrayList<>();
        listaConturi.add(cont1);
    }

    @Test
    public void testAtribute() {
        assertEquals("Nr. cont incorect.", "000",cont1.getNrCont());
        assertEquals("Nume cont incorect.", "Test1",cont1.getNume());
        assertEquals("Suma incorecta.", 100.99,cont1.getSuma(), 0);
        assertEquals("Atribut blocat incorect.", false,cont1.getBlocat());
        passedTests++;
    }

    @Test
    public void testTranser() {
        aplicatieBancara.transferBancar(cont1, cont2, 100.99);
        assertEquals("Transfer efectuat incorect.", 0, cont1.getSuma(), 0);
        assertEquals("Transfer efectuat incorect.", 301, cont2.getSuma(), 0);
        passedTests++;
    }

    @Test
    public void testStergereCont() {
        aplicatieBancara.stergeCont(cont2);
        assertArrayEquals("Stergerea s-a efectuat incorect.",
                listaConturi.toArray(),
                aplicatieBancara.getListaConturi().toArray());
        passedTests++;
    }

    @Test
    public void testBlocare() {
        aplicatieBancara.blocareCont(cont1);
        assertEquals("Contul nu a fost blocat.", true, cont1.getBlocat());
        passedTests++;
    }

    @AfterClass
    public static void afisareNumarTesteTrecute() {
        System.out.println("Au fost trecute " + passedTests + " teste.");
    }
}
