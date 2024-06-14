package impl2;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Random;

@RunWith(JUnitQuickcheck.class)
public class StudentProperties {
    @Property
    public void lengthOfAvailableDocumentListNonNegative(int borrowedSize) {
        ArrayList<Document> docsBorrow = new ArrayList<>();
        for (int i = 0 ; i < borrowedSize ; i++) {
            Random random = new Random();
            int copies = random.nextInt(10000);
            Document document = new Book("Pride and Prejuce", copies);
            docsBorrow.add(document);
        }

       Student student = new Student("810199419", "rose giant");
        if (docsBorrow.size() < 2) {
            Assert.assertTrue(student.canBorrow());
        }

        else {
            Assert.assertFalse(student.canBorrow());
        }
    }
}
