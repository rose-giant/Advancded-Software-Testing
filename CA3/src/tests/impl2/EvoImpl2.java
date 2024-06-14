package impl2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class EvoImpl2 {


	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsAddMagazine() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("", 2000, 711, (-1517));
	}

	@Test(timeout = 4000)
	public void testAddBookWithZero() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("8FOPS=h<-%Uq", 0);
	    try {
	        library0.borrow("!3Y uNu?c{hAh7ug^", "8FOPS=h<-%Uq");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // this book doesnt exist
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberThrowsNullPointerException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.addStudentMember((String) null, (String) null);
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithZero() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine("sts01.LibraryException", 0, 0, 0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // magazine`s year is incorrect
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddMagazineThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("7", 3000);
	    try {
	        library0.addMagazine("7", 3000, 3000, 3000);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // the magazine has already added
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberWithEmptyStringAndNonEmptyString() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addStudentMember("magazine name is empty", "");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // student name is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddMagazineAndAddReference() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("5b:Nm6(^\"tuo", 1, 1, 1);
	    library0.addReference("}j.FJJNY", 1);
	}

	@Test(timeout = 4000)
	public void testTimePass() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("bcQcm=xi73SV;:U", "@sRI1`AEhu4/L&r");
	    library0.timePass(2754);
	}

	@Test(timeout = 4000)
	public void testAddProfMemberThrowsExceptionAndAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("w", "w");
	    try {
	        library0.addProfMember("w");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // the member has already added
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberAndReturnDocument() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("impl2.Document", "impl2.Document");
	    library0.returnDocument("impl2.Document", "7/I2=-u_=Jw4");
	}

	@Test(timeout = 4000)
	public void testBorrow() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("&", "R&#*a`r");
	    library0.borrow("!l8!hG2o/", "t.]WkmMLf&");
	}

	@Test(timeout = 4000)
	public void testBorrowThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("ld*8WP=_23", (-97));
	    try {
	        library0.borrow("ld*8WP=_23", "ld*8WP=_23");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // this book doesnt exist
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAvailableTitles() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("prof name is empty", (-292));
	    List<String> list0 = library0.availableTitles();
	    assertFalse(list0.contains("prof name is empty"));
	}

	@Test(timeout = 4000)
	public void testAddReferenceWithZero() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("l&3", 0);
	    List<String> list0 = library0.availableTitles();
	    assertFalse(list0.contains("l&3"));
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember(";=//}Ss", ";=//}Ss");
	    try {
	        library0.addStudentMember(";=//}Ss", ";=//}Ss");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // the member has already added
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testExtend() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("NzRe3", "NzRe3");
	    library0.extend("", "NzRe3");
	}

	@Test(timeout = 4000)
	public void testAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("w", "w");
	    library0.addStudentMember("w", "3S(?\"'");
	}

	@Test(timeout = 4000)
	public void testAddProfMemberAndGetTotalPenalty() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("*+!H]");
	    int int0 = library0.getTotalPenalty(";=//}Ss");
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithEmptyString() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("", 2000, 711, (-1517));
	}

	@Test(timeout = 4000)
	public void testAddBookAndAddMagazine() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("7", 3000);
	    library0.addMagazine("8", 3000, 3000, 3000);
	}

	@Test(timeout = 4000)
	public void testAddProfMemberThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addProfMember(" ");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // prof name is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testExtendThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("Z", 3000);
	    library0.addProfMember("!");
	    library0.borrow("!", "Z");
	    try {
	        library0.extend("!", "!");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // cant extend
	        //
	        // verifyException("impl2.Person", e);
	    }
	}

	@Test(timeout = 4000)
	public void testReturnDocument() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("5b:Nm6(^\"tuo");
	    library0.returnDocument("}j.FJJNY", "impl2.Magazine");
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithZeroAndZero() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine("T$a--pG", 2410, 0, 0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // magazine`s number is incorrect
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testGetTotalPenalty() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("*+!H]");
	    int int0 = library0.getTotalPenalty(";=//}Ss");
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithNegativeAndAddMagazineWithNegativeAndAddMagazineWithNegative() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine("s+en\"", (-1073741822), (-1073741822), (-1073741822));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // magazine`s year is incorrect
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddReferenceThrowsNullPointerException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.addReference((String) null, (-352));
	}

	@Test(timeout = 4000)
	public void testAddProfMemberWithEmptyString() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("");
	    library0.extend("", "NzRe3");
	}

	@Test(timeout = 4000)
	public void testAddReference() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("5b:Nm6(^\"tuo", 1, 1, 1);
	    library0.addReference("}j.FJJNY", 1);
	}

	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("w", "w");
	    library0.addStudentMember("w", "3S(?\"'");
	}

	@Test(timeout = 4000)
	public void testBorrow0() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("@", 5921);
	    library0.addBook("&", 5921);
	    library0.borrow("R&#*a`r", "&");
	}

	@Test(timeout = 4000)
	public void testBorrow1() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("@", 5921);
	    library0.addBook("J", 5921);
	    library0.borrow("xX[ajQ4KE5Y9'ue", "<-F");
	}

	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsTimePass() throws Throwable {
	    Library library0 = new Library();
	    library0.timePass(0);
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberAndBorrow() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("&", "R&#*a`r");
	    library0.borrow("!l8!hG2o/", "t.]WkmMLf&");
	}

	@Test(timeout = 4000)
	public void testAddProfMemberAndAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("bcQcm=xi73SV;:U", "@sRI1`AEhu4/L&r");
	    library0.addProfMember("3a,o");
	}

	@Test(timeout = 4000)
	public void testAddBookThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addBook(" ", 3200);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // book name is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testTimePassWithZero() throws Throwable {
	    Library library0 = new Library();
	    library0.timePass(0);
	}

	@Test(timeout = 4000)
	public void testAddBookWithNegative() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("!", (-89));
	    try {
	        library0.addBook("!", (-89));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // the book has already added
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddProfMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("bcQcm=xi73SV;:U", "@sRI1`AEhu4/L&r");
	    library0.addProfMember("3a,o");
	}

	@Test(timeout = 4000)
	public void testAddReferenceWithNegative() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addReference(" ", (-132));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // reference name is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberAndGetTotalPenalty() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember(";=//}Ss", ";=//}Ss");
	    int int0 = library0.getTotalPenalty(";=//}Ss");
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testAddProfMemberThrowsNullPointerException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.addProfMember((String) null);
	}

	@Test(timeout = 4000)
	public void testAddMagazine() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("7", 3000);
	    library0.addMagazine("8", 3000, 3000, 3000);
	}

	@Test(timeout = 4000)
	public void testTimePassThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.timePass((-2630));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // days cant be negative
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testTimePassThrowsTooManyResourcesException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.timePass(2147483627);
	}

	@Test(timeout = 4000)
	public void testBorrowThrowsIndexOutOfBoundsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("&", "R&#*a`r");
	    // Undeclared exception!
	    library0.borrow("R&#*a`r", "&");
	}

	@Test(timeout = 4000)
	public void testAddProfMemberAndReturnDocument() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("5b:Nm6(^\"tuo");
	    library0.returnDocument("}j.FJJNY", "impl2.Magazine");
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberWithEmptyStringAndEmptyString() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addStudentMember("", "");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // student id is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddBookThrowsNullPointerException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.addBook((String) null, (-2816));
	}

	@Test(timeout = 4000)
	public void testAddMagazineThrowsNullPointerException() throws Throwable {
	    Library library0 = new Library();
	    // Undeclared exception!
	    library0.addMagazine((String) null, (-850), (-850), (-850));
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithNegativeAndPositive0() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine("!", 1202, (-2093064), 1202);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // magazine`s number is incorrect
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddReferenceThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("cant extend", 3000);
	    try {
	        library0.addReference("cant extend", 3000);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // the reference has already added
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAvailableTitlesReturningListWhereIsEmptyIsFalse() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("@", 5921);
	    List<String> list0 = library0.availableTitles();
	    assertTrue(list0.contains("@"));
	}

	@Test(timeout = 4000)
	public void testAddMagazineWithNegativeAndPositive1() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine(" ", (-1958233789), 1990, 222);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // magazine name is empty
	        //
	        // verifyException("impl2.Library", e);
	    }
	}

}
