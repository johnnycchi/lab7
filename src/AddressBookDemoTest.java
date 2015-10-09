import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddressBookDemoTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void anEmptyDirectoryHasNoFred() 
    {
        AddressBook dir = new ArrayListAddressBook();
        assertNull(dir.get("Fred", "Phone"));
    }
    
    @Test
    public void remove() {
        AddressBook dir = new ArrayListAddressBook();
        dir.put("Johnny", "Email", "johnnycchi@gmail.com");
    }

}
