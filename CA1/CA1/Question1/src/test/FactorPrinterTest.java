import dramaplays.FactorPrinter;
import dramaplays.model.Invoice;
import dramaplays.model.Performance;
import dramaplays.model.Play;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorPrinterTest {
    public static final String TRAGEDY = "tragedy";
    public static final String COMEDY = "comedy";

    FactorPrinter factorPrinter;
    String customer = "";
    List<Performance> performances = new ArrayList<>();
    Invoice invoice;
    Performance performance1;
    Map<String, Play> plays;
    Play play1;

    @BeforeEach
    public void setupFixtures() {
        plays = new HashMap<>();
        play1 = new Play("","tragedy");

        performance1 = new Performance("1", 0);
        performances.add(performance1);

        factorPrinter = new FactorPrinter();

        invoice = new Invoice(customer, performances);
        invoice.performances = performances;
    }

    @AfterEach
    public void tearDownFixtures() {
        factorPrinter = new FactorPrinter();
    }

    @Test
    public void factorPrintForTragedyPerformanceWithOneAudience() {
        play1.type = TRAGEDY;
        plays.put("1", play1);
        performance1.audience = 1;
        String actualResult = factorPrinter.print(invoice, plays);
        assertEquals("Factor for \n" +
                "  : $400.00 (1 seats)\n" +
                "Amount owed is $400.00\n" +
                "You earned 0 credits\n", actualResult);
    }

    @Test
    public void factorPrintForTragedyPerformanceWithMoreThanThirtyAudience() {
        play1.type = TRAGEDY;
        plays.put("1", play1);
        performance1 = new Performance("1", 31);
        performances.add(performance1);
        invoice = new Invoice(customer, performances);

        String actualResult = factorPrinter.print(invoice, plays);
        assertEquals("Factor for \n" +
                "  : $400.00 (0 seats)\n" +
                "  : $410.00 (31 seats)\n" +
                "Amount owed is $810.00\n" +
                "You earned 1 credits\n", actualResult);
    }

    @Test
    public void factorPrintForComedyPerformanceWithOneAudience() {
        play1 = new Play("","comedy");
        plays.put("1", play1);

        performance1 = new Performance("1", 1);
        performances.add(performance1);
        invoice = new Invoice(customer, performances);

        String actualResult = factorPrinter.print(invoice, plays);
        assertEquals("Factor for \n" +
                "  : $300.00 (0 seats)\n" +
                "  : $303.00 (1 seats)\n" +
                "Amount owed is $603.00\n" +
                "You earned 0 credits\n", actualResult);
    }

    @Test
    public void factorPrintForComedyPerformanceWithMoreThanThirtyOneAudience() {
        play1 = new Play("","comedy");
        plays.put("1", play1);

        performance1 = new Performance("1", 31);
        performances.add(performance1);
        invoice = new Invoice(customer, performances);

        String actualResult = factorPrinter.print(invoice, plays);
        assertEquals("Factor for \n" +
                "  : $300.00 (0 seats)\n" +
                "  : $548.00 (31 seats)\n" +
                "Amount owed is $848.00\n" +
                "You earned 7 credits\n", actualResult);
    }

    @Test
    public void factorPrintForInvalidPlayType() {
        play1 = new Play("","chicken");
        plays.put("1", play1);

        performance1 = new Performance("1", 31);
        performances.add(performance1);
        invoice = new Invoice(customer, performances);

        String actualResult = factorPrinter.print(invoice, plays);

        Error error = new Error("java.lang.Error: unknown type: ${play.type}");
        //assert throws exception
    }
}
