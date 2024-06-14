package impl1;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;
import sts01.LibraryException;

import java.util.List;

@RunWith(JUnitQuickcheck.class)
public class LibraryProperties {
    @Property
    public void DocumentNumIncrementedAfterAddingNewDoc(String title, int copies)
            throws InvalidArgumentEx, DuplicateDocumentEx {
      Library library = new Library();
      List<String> prevAvailableTitles = library.availableTitles();
      library.addBook(title, copies);
      List<String> nextAvailableTitles = library.availableTitles();
      Assert.assertEquals(prevAvailableTitles.size() + 1, nextAvailableTitles.size());
    }

    @Property
    public void addStudentMember(String studentID, String studentName) {
        impl1.Library library = new impl1.Library();

        try {
            library.addStudentMember(studentID, studentName);
        } catch (LibraryException exception) {
            Assert.assertTrue(exception.getMessage().length() > 0);
        }

    }

    @Property
    public void addProfessorMember(String proffessorName) {
        impl1.Library library = new impl1.Library();

        try {
            library.addProfMember(proffessorName);
        } catch (LibraryException exception) {
            Assert.assertTrue(exception.getMessage().length() > 0);
        }

    }

    @Property
    public void addBook(String bookTitle, int copies) {
        impl1.Library library = new impl1.Library();
        try {
            library.addBook(bookTitle, copies);
        } catch (InvalidArgumentEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        } catch (DuplicateDocumentEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        }
    }

    @Property
    public void addMagazine(String magazineTitle, int year, int number, int copies) {
        impl1.Library library = new impl1.Library();
        try {
            library.addMagazine(magazineTitle, year, number, copies);
        } catch (InvalidArgumentEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        } catch (DuplicateDocumentEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        }
    }

    @Property
    public void borrow(String memberName, String documentTitle) {
        impl1.Library library = new impl1.Library();

        try {
            library.borrow(memberName, documentTitle);
        } catch (CannotBorrowEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        } catch (InvalidArgumentEx e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        }
    }
}
