import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConcolicTest {
    int y;
    concolic concolic;
    @BeforeEach
    public void fixtureSetup() {
        this.concolic = new concolic();
        this.y = 1403;
    }

    @AfterEach
    public void fixtureTearDown() {
        this.concolic = null;
        this.y = 0;
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 187, 341})
    public void dateCalculatorTestExecutedSuccessfully(int x) {
        this.concolic.dateCalculator(x, y);
    }

    @Test
    public void dateCalculatorTestRaisesException() {
        int x = 436;
        assertThrows(RuntimeException.class, () -> {
            this.concolic.dateCalculator(x, y);
        });
    }
}