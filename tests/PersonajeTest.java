import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonajeTest {
    @ParameterizedTest(name = "Pierde {0} puntos de vida, se espera que queden {1}")
    @CsvSource({
            "999,1",
            "1000,0",
            "2000,0",
            "-10000,0"
    })
     void perderVida(int dano, int queda) {
        Personaje personaje1 = new Personaje("Hola",1000);
        assertEquals(queda,personaje1.perderVida(dano));
    }

}