package dramaplays.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class invoiceTest {

    public Invoice invoice;
    public List<Performance> performances;
    public String customer;

    @BeforeEach
    public void setupFixtures() {
        this.invoice = new Invoice("", null);
        this.performances =  new ArrayList<>();
        this.customer = "";
    }

    @AfterEach
    public void tearDownFixtures() {
        this.invoice = null;
        this.performances = null;
        this.customer = "";
    }

    @ParameterizedTest
    @ValueSource(strings = {"1243", "", "uhh3243", "MASI", "JNSEFS4 234234"})
    public void invoiceConstructorSetsVariousCustomers(String parameterizedCustomer) {
        this.invoice = new Invoice(parameterizedCustomer, this.performances);
        assertTheActualInvoiceAndExpectedInvoiceAreEqual(
                performances, this.invoice.performances,
                parameterizedCustomer, this.invoice.customer);
    }

    @Test
    public void invoiceConstructorSetsEmptyPerformances() {
        this.invoice = new Invoice(this.customer, this.performances);
        assertTheActualInvoiceAndExpectedInvoiceAreEqual(
                this.invoice.performances, this.performances, this.customer, this.invoice.customer);
    }

    @Test
    public void invoiceConstructorSetsSingleLengthPerformances() {
        Performance singlePerformance = new Performance("", 1);
        this.performances.add(singlePerformance);
        this.invoice = new Invoice(this.customer, this.performances);
        assertTheActualInvoiceAndExpectedInvoiceAreEqual(
                this.invoice.performances, this.performances, this.customer, this.invoice.customer);
    }

    @Test
    public void invoiceConstructorSetsPerformancesOfLength2() {
        Performance p1 = new Performance("", 1);
        this.performances.add(p1);
        Performance p2 = new Performance("", 2);
        this.performances.add(p2);

        this.invoice = new Invoice(this.customer, this.performances);
        assertTheActualInvoiceAndExpectedInvoiceAreEqual(
                this.invoice.performances, this.performances, this.customer, this.invoice.customer);
    }

    @Test
    public void invoiceConstructorSetsNullPerformanceList() {
        this.invoice = new Invoice(this.customer, null);
        assertTheActualInvoiceAndExpectedInvoiceAreEqual(
                this.invoice.performances, null, this.customer, this.invoice.customer);
    }

    public void assertTheActualInvoiceAndExpectedInvoiceAreEqual(
            List<Performance> expectedPerformance, List<Performance> actualPerformance, String expectedCustomer, String actualCustomer) {
        assertEquals(expectedCustomer, actualCustomer);
        assertEquals(expectedPerformance
                , actualPerformance);
    }
}