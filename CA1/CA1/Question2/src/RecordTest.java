import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecordTest {

    public List<Integer> pres = new ArrayList<>();
    public List<Record> records = new ArrayList<>();
    public Course course = new Course();
    public Record record1 = new Record();
    public Record record2 = new Record();

    @BeforeEach
    public void setupFixtures() {
        this.record1.courseID = 0;
        this.record2.courseID = 1;
        records.add(this.record2);

        records.add(this.record1);
        pres.add(this.record1.courseID);
        this.course.pre = pres;
    }

    @AfterEach
    public void tearDownFixtures() {
        records = new ArrayList<>();
        pres = new ArrayList<>();
    }

    @Test
    public void hasPassedPreReturnsTrueWhenTheCourseHasNoPre() {
        this.course.pre = new ArrayList<>();
         assertTrue(this.record1.hasPassedPre(this.records, this.course));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void hasPassedCourseReturnsTrueForNormalRecordWithOnePassedPre(boolean isGuest) {
        this.record1.isGuest = isGuest;
        this.record1.grade = 19;

        this.course.id = 1;
        this.course.pre = pres;
        assertTrue(this.record1.hasPassedPre(records, this.course));
    }

    @Test
    public void hasPassedCourseReturnsFalseForNormalRecordWithOneFailedPre() {
        this.record1.isGuest = false;
        this.record1.grade = 9;

        this.course.id = 1;
        this.course.pre = pres;
        assertFalse(this.record1.hasPassedPre(records, this.course));
    }

    @Test
    public void hasPassedCourseReturnsFalseForGuestRecordWithOneFailedPre() {
        this.record1.isGuest = true;
        this.record1.grade = 11;

        this.course.id = 1;
        this.course.pre = pres;
        assertFalse(this.record1.hasPassedPre(records, this.course));
    }

    @Test
    public void hasPassedCourseReturnsFalseForNormalRecordWithOnePassedAndFailedPre() {
        this.record1.isGuest = false;
        this.record1.grade = 9;

        this.record2.isGuest = false;
        this.record2.grade = 19;

        pres.add(this.record2.courseID);

        this.course.id = 2;
        this.course.pre = pres;
        assertFalse(this.record1.hasPassedPre(records, this.course));
    }

    @Test
    public void hasPassedCourseReturnsFalseForGuestRecordWithOnePassedAndFailedPre() {
        this.record1.isGuest = true;
        this.record1.grade = 11;

        this.record2.isGuest = true;
        this.record2.grade = 13;

        pres.add(this.record2.courseID);

        this.course.id = 2;
        this.course.pre = pres;
        assertFalse(this.record1.hasPassedPre(records, this.course));
    }

}
