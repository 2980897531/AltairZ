import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleBurstTest {

    @Test
    public void testCase1() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {2, 0}};
        int[] scores = {0, 4};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase2() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {2, 1}};
        int[] scores = {0, 0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase3() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {3, 1}};
        int[] scores = {0, 1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase4() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {3, 0}};
        int[] scores = {0, 0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase5() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{3, 2}, {2, 0}};
        int[] scores = {0, 3};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase6() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{1, 0}, {2, 0}};
        int[] scores = {5, 0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase7() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 1}, {3, 1},{2,0}};
        int[] scores = {0,1,1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase8() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {0, 0}};
        int[] scores = {0, 6};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase9() {
        boolean[][] bbMatrix = {{true, false},{true,true}};
        int[][] bursts = {{0,0},{1,0}};
        int[] scores = {2,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase10() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {false, true, false, true},
                {true, true,  true, true},
                {true, false,  true,  false}};
        int[][] bursts = {{2, 3}, {0, 3}};
        int[] scores = {0, 1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase11() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {false, true, false, true},
                {true, true,  true, true},
                {true, false,  true,  false}};
        int[][] bursts = {{0, 1}, {1, 0}};
        int[] scores = {0, 0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase12() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {false, true, false, true},
                {true, true,  true, true},
                {true, false,  true,  false}};
        int[][] bursts = {{2, 2}, {1, 3}};
        int[] scores = {1, 1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase13() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {false, true, false, true},
                {true, true,  true, true},
                {true, false,  true,  false}};
        int[][] bursts = {{2, 3}, {0, 3},{0, 1}, {1, 0},{2, 2}, {1, 3}};
        int[] scores = {0,1,6,0,0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase16() {
        boolean[][] bbMatrix = {{true,true,true,true}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase17() {
        boolean[][] bbMatrix = {{true},
                {true},
                {true},
                {true}};
        int[][] bursts = {{2,0}, {0, 0}};
        int[] scores = {1, 1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase18() {
        boolean[][] bbMatrix = {{true}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase19() {
        boolean[][] bbMatrix = {{false}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));


    }
	
	
	
	
	
}
