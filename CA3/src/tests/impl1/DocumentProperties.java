package impl1;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnitQuickcheck.class)
public class DocumentProperties {

    @Property
    public void lengthOfAvailableDocumentListNonNegative() throws InvalidArgumentEx {
        Library library = new Library();
        List<String> availableDocs = library.availableTitles();
        Assert.assertTrue(availableDocs.size() >= 0);
    }
}
