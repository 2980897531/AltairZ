import org.junit.Test;
import static org.junit.Assert.*;

public class test2 {

    @Test
    public void testCase1() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 2}, {2, 0}};
        int[] scores = {0, 4};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }



    @Test
    public void testCase2() {//测试连接
        boolean[][] bbMatrix = {{true, true,  true, true},
                {true, true, true, true},
                {true, true,  true, true},
                {true, true,  true,  true}};
        int[][] bursts = {{2, 0}, {2, 1}, {2, 2}, {2, 3}};
        int[] scores = {0, 0, 0, 4};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }



    @Test
    public void testCase2n1() {//测试连接
        boolean[][] bbMatrix = {{true, true,  true, true},
                {true, true, true, true},
                {true, true,  true, true},
                {true, true,  true,  true}};
        int[][] bursts = {{2, 0}, {2, 1}, {2, 2}, {3, 3}};
        int[] scores = {0, 0, 0, 3};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }


    @Test
    public void testCase2n2() {//测试底端
        boolean[][] bbMatrix = {{true, true,  true, true},
                {true, true, true, true},
                {true, true,  true, true},
                {true, true,  true,  true}};
        int[][] bursts = {{3, 0}, {3, 1}, {3, 2}, {2, 3}};
        int[] scores = {0, 0, 0, 1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }


    @Test
    public void testCase3n1() {//测试长方形
        boolean[][] bbMatrix = {{true, true},
                {true, true},
                {true, true}};
        int[][] bursts = {{1, 0}, {1, 1}};
        int[] scores = {0, 2};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }


    @Test
    public void testCase3n2() {//测试不同root
        boolean[][] bbMatrix = {{true, true, false},
                {true, true, false},
                {true, true, true}};
        int[][] bursts = {{0, 1}, {0, 0}};
        int[] scores = {0, 5};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase3n2n2() {//测试不同root
        boolean[][] bbMatrix = {{true, true, false},
                {true, true, false},
                {true, true, true}};
        int[][] bursts = {{0, 0}, {0, 1}};
        int[] scores = {0, 5};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }


    @Test
    public void testCase3n3() {//测试钩型
        boolean[][] bbMatrix = {{true, false, false},
                {true, false, true},
                {true, true, true}};
        int[][] bursts = {{2, 1}};
        int[] scores = {2};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }



    @Test
    public void testCase3n4() {//测试长钩型
        boolean[][] bbMatrix = {{true, false, false},
                {true, false, true},
                {true, false, true},
                {true, false, true},
                {true, false, true},
                {true, true, true}};
        int[][] bursts = {{5, 1}};
        int[] scores = {5};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }


    @Test
    public void testCase3() {
        boolean[][] bbMatrix =
                {{true, true, true},
                        {true, true, false},
                        {true, false, false},
                        {true, true, false},
                        {false, true, true},
                        {false, false, true},
                        {true, false, true},
                        {true, true, true}};
        int[][] bursts = {{7, 1}, {6, 1}, {5, 0}, {4, 1}};
        int[] scores = {2, 0, 0, 4};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase11() {
        boolean[][] bbMatrix = {
                {true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2,3},{2,0},{2,1}};
        int[] scores = {0,4,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        bb.burstBubble(bursts);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase12() {
        boolean[][] bbMatrix = {
                {true, true,  false},
                {true, false, false},
                {true, true,  false},
                {true, true,  true}
        };
        int[][] bursts = {{2, 2},{2, 0},{2, 1}};
        int[] scores = {0,4,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase13() {
        boolean[][] bbMatrix = {
                {true, true,  true},
                {true, false, true},
                {true, true,  false},
                {true, true,  true}
        };
        int[][] bursts = {{0, 2},{1,0}};
        int[] scores = {1,5};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase14() {
        boolean[][] bbMatrix = {
                {true,false,false,false},
                {true, true,true,false},
        };
        int[][] bursts = {{1,0}};
        int[] scores = {2};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase15() {
        boolean[][] bbMatrix = {
                {true,false,false},
                {true,false,false},
                {true,true,false},
                {true,true,true},
        };
        int[][] bursts = {{0,0}};
        int[] scores = {6};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase16() {
        boolean[][] bbMatrix = {
                {true, true, false},
                {true, false, false},
                {true, true, false},
                {true, true, true}
        };
        int[][] bursts = {{2, 2}, {2, 0}, {2, 1}};
        int[] scores = {0,4,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase17() {
        boolean[][] bbMatrix = {
                {true, true, false,true},
                {true, false, false,false},
                {true, true, false,false},
                {true, true, true,false}
        };
        int[][] bursts = {{3, 0}};
        int[] scores = {0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase2X() {
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
    public void testCase3X() {
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
    public void testCase4X() {
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
    public void testCase5X() {
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
    public void testCase6X() {
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
    public void testCase7X() {
        boolean[][] bbMatrix = {{true, true,  false, true},
                {true, false, false, false},
                {true, true,  false, false},
                {true, true,  true,  false}};
        int[][] bursts = {{2, 1}, {3, 1},{2,0}};
        int[] scores = {0, 1,1};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase8X() {
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
    public void testCase9X() {
        boolean[][] bbMatrix = {{true, false},{true,true}};
        int[][] bursts = {{0,0},{1,0}};
        int[] scores = {2,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase10X() {
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
    public void testCase11X() {
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
    public void testCase12X() {
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
    public void testCase13X() {
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
    public void testCase16X() {
        boolean[][] bbMatrix = {{true,true,true,true}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

    @Test
    public void testCase17X() {
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
    public void testCase18X() {
        boolean[][] bbMatrix = {{true}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }
    @Test
    public void testCase19X() {
        boolean[][] bbMatrix = {{false}};
        int[][] bursts = {{0, 0},{0,0}};
        int[] scores = {0,0};
        BubbleBurst bb = new BubbleBurst(bbMatrix);
        assertArrayEquals(scores, bb.burstBubble(bursts));
    }

}
