package impl1;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class BookProperties {

    @Property
    public void penaltyForBookAlwaysNaturalNumber(int days, String title) throws InvalidArgumentEx {
        Book book = new Book(title);
        int penalty = book.penaltyFor(days);
        Assert.assertTrue(penalty >= 0);
    }
}
