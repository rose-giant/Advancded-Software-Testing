package dramaplays.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class performanceTest {
    public Performance performance;
    public String samplePlayID = "122345";
    public int sampleAudience = 300;

    @BeforeEach
    public void setupFixtures() {
        this.performance = new Performance("", 0);
    }

    @AfterEach
    public void tearDownFixtures() {
        this.performance = null;
    }

    @ParameterizedTest
    @ValueSource(strings = {"1243", "", "uhh3243", "MASI", "JNSEFS4 234234"})
    public void performanceConstructorSetsVariousIDs(String id) {
        this.performance = new Performance(id, sampleAudience);
        assertTheActualNameAndTypeAreEqualToExpected(
                id, sampleAudience, this.performance.playID, this.performance.audience);
    }

    @ParameterizedTest
    @ValueSource(strings = {"dracula", "", "ANGEL", "P", "o"})
    public void plyConstructorSetsVariousAudienceNumbers(int audienceNumber) {
        this.performance = new Performance(samplePlayID, audienceNumber);
        assertTheActualNameAndTypeAreEqualToExpected(
                samplePlayID, audienceNumber, this.performance.playID, this.performance.audience);
    }

    @Test
    public void playConstructorSetsNullID() {
        this.performance = new Performance(null, sampleAudience);
        assertTheActualNameAndTypeAreEqualToExpected(
                null, sampleAudience, this.performance.playID, this.performance.audience);
    }

    public void assertTheActualNameAndTypeAreEqualToExpected(
            String expectedID, int expectedAudienceNum,
            String actualID, int actualAudienceNum) {
        assertEquals(expectedID, actualID);
        assertEquals(expectedAudienceNum, actualAudienceNum);
    }
}
