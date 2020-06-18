public class BubbleBurst {

    private final boolean[][] bbMatrix;
    private final int row;
    private final int column;
	
	
	/*
    *****  DO NOT CHANGE ANY INSTANCE VARIABLES ABOVE *****
    *****  DO NOT ADD ANY INSTANCE VARIABLES **************
	*****  DO NOT ADD ANY LIBRARIES ******** **************
    *****  VIOLATION = 0 MARKS IN PART B ******************
     */	
	
	
	/*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !
	


    /*
     ***** HELPER METHODS END *****
     */
	
	
	// COURSEWORK 3 PART B.1 Bubble Burst CONSTRUCTOR
	
	/**
     * Perform deep copy of bbMatrix,
     * and initialize information about its size.
     * @param bbMatrix to be copied
     */
    public BubbleBurst(boolean[][] bbMatrix) {
		
		this.bbMatrix = bbMatrix;
		row = bbMatrix.length;
		column = bbMatrix[0].length;

    }
	
	// COURSEWORK 3 PART B.2 Bubble Burst BURSTBUBBLE

    /**
     * @param bursts an array of 2-element arrays representing the coordinates
     * (in [row, column] format) which the player chose in sequence.
     * @return an array where the i-th element is the number of bubbles that fall 
     * after the i-th bubble at coordinate bursts[i] is burst, if any.
     */
    public int[] burstBubble(int[][] bursts) {

        int[] scores = new int[bursts.length];

        // 复制集合
        boolean [][] copy = new boolean[row][];
        for(int i = 0; i < bbMatrix.length; i++){
            copy[i] = bbMatrix[i].clone();
        }

        // 删除消除的气球
        for (int i = 0; i < bursts.length; i++){
            int rowCoord = bursts[i][0];
            int columnCoord = bursts[i][1];
            copy[rowCoord][columnCoord] = false;
        }

        // 新建dsu
        DisjointSets dsu = new DisjointSets(row*column+1);
        int id;

        // 链接各个气球
        for (int rowIndex = 0; rowIndex < copy.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < copy[0].length; columnIndex++){
                id = rowIndex*column + columnIndex;
                if (copy[rowIndex][columnIndex]){
                    if (rowIndex == 0){
                        dsu.connect(id,row*column);
                    }
                    else {
                        if(copy[rowIndex-1][columnIndex]){
                            dsu.connect(id,id-bbMatrix[0].length);
                        }
                        if (columnIndex != 0 && copy[rowIndex][columnIndex-1]){
                            dsu.connect(id,id-1);
                        }
                    }
                }
            }
        }
        dsu.printParent();

        // 重新加入气球
        int finalnumber = dsu.sizeOf(row*column);
        int nownumber;
        int nextnumber;
        for (int hitIndex = bursts.length-1; hitIndex >= 0; hitIndex--){
            nextnumber = dsu.sizeOf(row*column);
            int hitRow = bursts[hitIndex][0];
            int hitColumn = bursts[hitIndex][1];
            int hitId = hitRow*column + hitColumn;
            if(bbMatrix[hitRow][hitColumn]){
                if (hitRow == 0) {
                    dsu.connect(hitId,row*column);
                    if (copy.length > 1 && copy[hitRow + 1][hitColumn]){
                        dsu.connect(hitId,hitId + column);
                    }
                }
                else {
                    if (copy[hitRow - 1][hitColumn]) {
                        dsu.connect(hitId,hitId - column);
                    }
                    if (hitColumn - 1 >= 0 && copy[hitRow][hitColumn - 1]) {
                        dsu.connect(hitId,hitId - 1);
                    }
                    if (hitColumn + 1 <= copy[0].length-1 && copy[hitRow][hitColumn + 1]) {
                        dsu.connect(hitId,hitId + 1);
                    }
                    if (hitRow + 1 <= copy.length-1 && copy[hitRow + 1][hitColumn]) {
                        dsu.connect(hitId,hitId + column);
                    }
                }

                // 加入新气球
                copy[hitRow][hitColumn] = true;
            }

            // 计算分数
            dsu.printParent();
            nownumber = dsu.sizeOf(row*column);
            if (hitIndex == bursts.length-1){
                if(nownumber - finalnumber > 1){
                    scores[hitIndex] = nownumber - finalnumber - 1;
                }
                else if (nownumber - finalnumber == 1){
                    scores[hitIndex] = 0;
                }
                else {
                    scores[hitIndex] = nownumber - finalnumber;
                }
            }
            else {
                if(nownumber - nextnumber > 1){
                    scores[hitIndex] = nownumber - nextnumber - 1;
                }
                else if (nownumber - nextnumber == 1){
                    scores[hitIndex] = 0;
                }
                else {
                    scores[hitIndex] = nownumber - nextnumber;
                }
            }
        }

        return scores;
    }

}
