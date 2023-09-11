import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteMapa {

    @Test
    public void testeAdicionarEObter() {
        Mapa<String, Integer> mapa = new Mapa<>(10);
        mapa.adicionar("um", 1);
        mapa.adicionar("dois", 2);
        mapa.adicionar("três", 3);

        assertEquals(3, mapa.tamanho());
        assertEquals(1, mapa.obter("um"));
        assertEquals(2, mapa.obter("dois"));
        assertEquals(3, mapa.obter("três"));
        assertNull(mapa.obter("quatro"));
    }

    @Test
    public void testeContemChave() {
        Mapa<String, Integer> mapa = new Mapa<>(10);
        mapa.adicionar("um", 1);
        mapa.adicionar("dois", 2);
        mapa.adicionar("três", 3);

        assertTrue(mapa.contemChave("um"));
        assertTrue(mapa.contemChave("dois"));
        assertTrue(mapa.contemChave("três"));
        assertFalse(mapa.contemChave("quatro"));
    }

    @Test
    public void testeTamanho() {
        Mapa<String, Integer> mapa = new Mapa<>(10);
        assertEquals(0, mapa.tamanho());

        mapa.adicionar("um", 1);
        assertEquals(1, mapa.tamanho());

        mapa.adicionar("dois", 2);
        assertEquals(2, mapa.tamanho());

        mapa.adicionar("três", 3);
        assertEquals(3, mapa.tamanho());
    }
}
