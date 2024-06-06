package impl1tests.Library;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import impl1.Library;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class BookProperties {

    @Property public void penaltyForBookAlwaysNaturalNumber(int days) {

    }
}
