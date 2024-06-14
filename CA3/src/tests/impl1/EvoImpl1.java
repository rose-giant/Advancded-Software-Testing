package impl1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class EvoImpl1 {


	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsAddMagazine() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("WmD9<!#^BFk", 3146, 145, 2166);
	}

	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("Invalid argument to loan constructor", "Hr<^[xUC%qu|g:");
	}

	@Test(timeout = 4000)
	public void testAddReference() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("hefUB", 1);
	    try {
	        library0.borrow("hefUB", "hefUB");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Cannot find member to borrow
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddMagazineThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addMagazine("vK", 1189, 13, 0);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Negative or zero copies of a document cannot be added
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testReturnDocumentThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook((String) null, 730);
	    library0.addProfMember((String) null);
	    library0.borrow((String) null, (String) null);
	    try {
	        library0.returnDocument((String) null, "V$>Sli$VxCK <");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // The document is not in member's loan
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testBorrowThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.borrow("f\"T:*Sk'w^vO'c7q", "f\"T:*Sk'w^vO'c7q");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Cannot find document to borrow
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testBorrow() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("Mml1.Member", "Mml1.Member");
	    library0.addReference("Mml1.Member", 2877);
	    library0.borrow("Mml1.Member", "Mml1.Member");
	    library0.borrow("Mml1.Member", "Mml1.Member");
	    try {
	        library0.borrow("Mml1.Member", "Mml1.Member");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Cannot borrow more documents
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testCreatesLibraryAndCallsTimePass() throws Throwable {
	    Library library0 = new Library();
	    library0.timePass(0);
	}

	@Test(timeout = 4000)
	public void testAvailableTitles() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("_54P+')x>EXbyjU^1l", 1);
	    library0.addProfMember("_54P+')x>EXbyjU^1l");
	    library0.borrow("_54P+')x>EXbyjU^1l", "_54P+')x>EXbyjU^1l");
	    List<String> list0 = library0.availableTitles();
	    assertFalse(list0.contains("_54P+')x>EXbyjU^1l"));
	}

	@Test(timeout = 4000)
	public void testAddStudentMemberThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addStudentMember("", "");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Empty member name not allowed
	        //
	        // verifyException("impl1.Member", e);
	    }
	}

	@Test(timeout = 4000)
	public void testExtend() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("?6X_`nQVLGA#=-0g\"", 4);
	    library0.addProfMember("?6X_`nQVLGA#=-0g\"");
	    library0.borrow("?6X_`nQVLGA#=-0g\"", "?6X_`nQVLGA#=-0g\"");
	    library0.timePass(4);
	    library0.extend("?6X_`nQVLGA#=-0g\"", "?6X_`nQVLGA#=-0g\"");
	}

	@Test(timeout = 4000)
	public void testAddStudentMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("Invalid argument to loan constructor", "Hr<^[xUC%qu|g:");
	}

	@Test(timeout = 4000)
	public void testAddBookThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.addBook((String) null, (-1117));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Negative or zero copies of a document cannot be added
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testTimePassWithZero() throws Throwable {
	    Library library0 = new Library();
	    library0.timePass(0);
	}

	@Test(timeout = 4000)
	public void testAddBook() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook((String) null, 730);
	    library0.addProfMember((String) null);
	    library0.borrow((String) null, (String) null);
	    library0.addProfMember("DdQ=/yKFPjk&VO");
	    library0.borrow("DdQ=/yKFPjk&VO", (String) null);
	}

	@Test(timeout = 4000)
	public void testAddProfMember() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("h`eS", 1);
	    library0.addProfMember("h`eS");
	    library0.borrow("h`eS", "h`eS");
	    try {
	        library0.borrow("h`eS", "h`eS");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Document is not available to borrow
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testGetTotalPenaltyThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.getTotalPenalty("");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Cannot find member
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAvailableTitlesReturningListWhereIsEmptyIsTrue() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("_54P+')x>EXbyjU^1l", 1);
	    library0.addProfMember("_54P+')x>EXbyjU^1l");
	    library0.borrow("_54P+')x>EXbyjU^1l", "_54P+')x>EXbyjU^1l");
	    List<String> list0 = library0.availableTitles();
	    assertFalse(list0.contains("_54P+')x>EXbyjU^1l"));
	}

	@Test(timeout = 4000)
	public void testAddMagazine() throws Throwable {
	    Library library0 = new Library();
	    library0.addMagazine("WmD9<!#^BFk", 3146, 145, 2166);
	}

	@Test(timeout = 4000)
	public void testTimePassThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.timePass((-2093));
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Cannot go back in time
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAddProfMemberThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addStudentMember("impl1.DuplicateDocumentEx", "impl1.DuplicateDocumentEx");
	    try {
	        library0.addProfMember("impl1.DuplicateDocumentEx");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Member with the same name exists
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testExtendThrowsException() throws Throwable {
	    Library library0 = new Library();
	    try {
	        library0.extend("impl1.Library", "KF<s=J*=3=V`");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // The document is not in member's loan
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testGetTotalPenaltyReturningNegative() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("/iTG80jSAK", 5);
	    library0.addProfMember("/iTG80jSAK");
	    library0.borrow("/iTG80jSAK", "/iTG80jSAK");
	    library0.timePass(5);
	    library0.timePass(5);
	    int int0 = library0.getTotalPenalty("/iTG80jSAK");
	    assertEquals((-38000), int0);
	}

	@Test(timeout = 4000)
	public void testExtendWithEmptyStringAndEmptyString() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("2|y}HK C[nCm=", 1358);
	    library0.addProfMember("2|y}HK C[nCm=");
	    library0.borrow("2|y}HK C[nCm=", "2|y}HK C[nCm=");
	    try {
	        library0.extend("", "");
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // The document is not in member's loan
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testReturnDocument() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("Ox!TydIC", 14);
	    library0.addProfMember("_P')%>lbj^1l");
	    library0.borrow("_P')%>lbj^1l", "Ox!TydIC");
	    library0.returnDocument("_P')%>lbj^1l", "Ox!TydIC");
	}

	@Test(timeout = 4000)
	public void testGetTotalPenaltyReturningPositive() throws Throwable {
	    Library library0 = new Library();
	    library0.addBook("2|2}HK C1cCm=", 1337);
	    library0.addProfMember("2|2}HK C1cCm=");
	    library0.borrow("2|2}HK C1cCm=", "2|2}HK C1cCm=");
	    library0.timePass(1337);
	    int int0 = library0.getTotalPenalty("2|2}HK C1cCm=");
	    assertEquals(6586000, int0);
	}

	@Test(timeout = 4000)
	public void testGetTotalPenalty() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("6]f2");
	    library0.addReference("_54P+')x>EXbyjU^1l", 1);
	    library0.addProfMember("_54P+')x>EXbyjU^1l");
	    library0.borrow("_54P+')x>EXbyjU^1l", "_54P+')x>EXbyjU^1l");
	    int int0 = library0.getTotalPenalty("6]f2");
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testAddReferenceThrowsException() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("hefUB", 1);
	    try {
	        library0.addReference("hefUB", 1);
	        fail("Expecting exception: Exception");
	    } catch (Exception e) {
	        //
	        // Document with the same title exists
	        //
	        // verifyException("impl1.Library", e);
	    }
	}

	@Test(timeout = 4000)
	public void testAvailableTitlesReturningListWhereIsEmptyIsFalse() throws Throwable {
	    Library library0 = new Library();
	    library0.addReference("/iTG80jSAK", 5);
	    List<String> list0 = library0.availableTitles();
	    assertTrue(list0.contains("/iTG80jSAK"));
	}

	@Test(timeout = 4000)
	public void testGetTotalPenaltyReturningZero() throws Throwable {
	    Library library0 = new Library();
	    library0.addProfMember("6]f2");
	    library0.addReference("_54P+')x>EXbyjU^1l", 1);
	    library0.addProfMember("_54P+')x>EXbyjU^1l");
	    library0.borrow("_54P+')x>EXbyjU^1l", "_54P+')x>EXbyjU^1l");
	    int int0 = library0.getTotalPenalty("6]f2");
	    assertEquals(0, int0);
	}

}
