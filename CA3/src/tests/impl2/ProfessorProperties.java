package impl2;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Random;

@RunWith(JUnitQuickcheck.class)
public class ProfessorProperties {

    @Property
    public void lengthOfAvailableDocumentListNonNegative(int borrowedSize) {
        ArrayList<Document> docsBorrow = new ArrayList<>();
        for (int i = 0 ; i < borrowedSize ; i++) {
            Random random = new Random();
            int copies = random.nextInt(10000);
            Document document = new Book("Pride and Prejuce", copies);
            docsBorrow.add(document);
        }

        Prof prof = new Prof("UnderPants");
        if (docsBorrow.size() < 5) {
            Assert.assertTrue(prof.canBorrow());
        }

        else {
            Assert.assertFalse(prof.canBorrow());
        }
    }
}
