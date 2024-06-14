package impl1;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class LoanProperties {

    Member member = new Professor("Andy");
    public LoanProperties() throws InvalidArgumentEx {
    }

    Document document = new Book("Toy Story");

    @Property
    public void getPenaltyReturnsNonNegative(int date, int now) throws InvalidArgumentEx {
       Loan loan = new Loan(member, document, date);
       int penalty = loan.getPenalty(now);
       Assert.assertTrue(penalty >= 0);
    }

    Document magazine = new Magazine("Vogue", 2024, 2000);
    @Property
    public void getPenaltyReturnsNonNegativeForMagazaneDoc(int date, int now) throws InvalidArgumentEx {
        Loan loan = new Loan(member, magazine, date);
        int penalty = loan.getPenalty(now);
        Assert.assertTrue(penalty >= 0);
    }

    Document reference = new Reference("Encycopedia");
    @Property
    public void getPenaltyReturnsNonNegativeForReferenceDoc(int date, int now) throws InvalidArgumentEx {
        Loan loan = new Loan(member, reference, date);
        int penalty = loan.getPenalty(now);
        Assert.assertTrue(penalty >= 0);
    }
}
