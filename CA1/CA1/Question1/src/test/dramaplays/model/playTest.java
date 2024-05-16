package dramaplays.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class playTest {
    public Play play;
    public String sampleName = "razi";
    public String sampleType = "dracula";

    @BeforeEach
    public void setupFixtures() {
        this.play = new Play("", "");
    }

    @AfterEach
    public void tearDownFixtures() {
        this.play = null;
    }

    @ParameterizedTest
    @ValueSource(strings = {"razi", "", "MASI", "d", "Q"})
    public void plyConstructorSetsVariousNames(String name) {
        this.play = new Play(name, sampleType);
        assertTheActualNameAndTypeAreEqualToExpected(
                name, this.play.name, sampleType, this.play.type);
    }

    @ParameterizedTest
    @ValueSource(strings = {"dracula", "", "ANGEL", "P", "o"})
    public void plyConstructorSetsVariousTypes(String type) {
        this.play = new Play(sampleName, type);
        assertTheActualNameAndTypeAreEqualToExpected(
                sampleName, this.play.name, type, this.play.type);
    }

    @Test
    public void playConstructorSetsNullName() {
        this.play = new Play(null, sampleType);
        assertTheActualNameAndTypeAreEqualToExpected(
                null, this.play.name, sampleType, this.play.type);
    }

    @Test
    public void playConstructorSetsNullType() {
        this.play = new Play(sampleName, null);
        assertTheActualNameAndTypeAreEqualToExpected(
                sampleName, this.play.name, null, this.play.type);
    }

    @Test
    public void playConstructorSetsNullTypeAndName() {
        this.play = new Play(null, null);
        assertTheActualNameAndTypeAreEqualToExpected(
                null, this.play.name, null, this.play.type);
    }

    public void assertTheActualNameAndTypeAreEqualToExpected(
            String expectedName, String actualName ,
            String expectedType, String actualType) {
        assertEquals(expectedName, actualName);
        assertEquals(expectedType, actualType);
    }
}
