import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteFabricaVeiculos {
    @Test
    public void testeCriarCarroEsportivo() {
        FabricaCarro factory = new FabricaCarroEsportivo();
        Carro carro = factory.criarCarro();
        assertNotNull(carro);
        assertEquals("Carro Esportivo", carro.getTipo());
    }

    @Test
    public void testeCriarCarroFamiliar() {
        FabricaCarro factory = new FabricaCarroFamiliar();
        Carro carro = factory.criarCarro();
        assertNotNull(carro);
        assertEquals("Carro Familiar", carro.getTipo());
    }

    @Test
    public void testeCriarMotoEsportiva() {
        FabricaMoto factory = new FabricaMotoEsportiva();
        Moto moto = factory.criarMoto();
        assertNotNull(moto);
        assertEquals("Moto Esportiva", moto.getTipo());
    }

    @Test
    public void testeCriarMotoPadrao() {
        FabricaMoto factory = new FabricaMotoPadrao();
        Moto moto = factory.criarMoto();
        assertNotNull(moto);
        assertEquals("Moto Padrão", moto.getTipo());
    }
}
