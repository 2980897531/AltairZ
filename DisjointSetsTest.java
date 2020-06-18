import org.junit.Test;
import static org.junit.Assert.*;

public class DisjointSetsTest {
	
    @Test
    public void testDS_1() {
        DisjointSets ds = new DisjointSets(4);
        ds.connect(1, 0);
        assertTrue(ds.isConnected(1, 0));
        assertEquals(2, ds.sizeOf(1));
        assertEquals(0, ds.parent(1));
        assertEquals(-2, ds.parent(0));
        ds.connect(3, 2);
        assertFalse(ds.isConnected(3, 1));
        ds.connect(3, 1);
        assertEquals(2, ds.parent(3));
        assertTrue(ds.isConnected(3, 1));
        assertEquals(0, ds.parent(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTest_1() {
        DisjointSets ds = new DisjointSets(5);
        ds.validate(10);
    }
	
	
	
	
	
}
