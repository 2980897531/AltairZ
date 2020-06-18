public class DisjointSets {

    private int[] parent;

    /*
     * Returns the parent of element p.
     * If p is the root of a tree, returns the negative size
     * of the tree for which p is the root.
     */
    public int parent(int p) {
        return parent[p];
    }

    /* Prints the parents of the elements, separated by a space */
    public void printParent() {
        for (int element : parent) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
    *****  DO NOT CHANGE ANY INSTANCE VARIABLES ABOVE *****
    *****  DO NOT ADD ANY INSTANCE VARIABLES **************
	*****  DO NOT ADD ANY LIBRARIES ******** **************
    *****  VIOLATION = 0 MARKS IN PART A ******************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !

	private int findRootr(int ele){

	    if (parent[ele] < 0){
	        return ele;
        }
        parent[ele]=findRootr(parent[ele]);
	    return parent[ele];

    }
	
    /*
     ***** HELPER METHODS END *****
     */


    // COURSEWORK 3 PART A.1 Disjoint Sets CONSTRUCTOR

    /**
     * Creates a Disjoint Sets data structure with N elements,
     * 0 through N-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public DisjointSets(int N) {
		
		parent = new int[N];
		for (int i = 0; i < N; i++){
		    parent[i] = -1;
        }
		
    }


    // COURSEWORK 3 PART A.2 Disjoint Sets VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
		
		if (p < 0 || p > parent.length){
		    throw new IllegalArgumentException("Invalid element or index");
        }
		
    }


    // COURSEWORK 3 PART A.3 Disjoint Sets SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
		
		validate(p);
		return -parent[findRootr(p)];
		
    }


    // COURSEWORK 3 PART A.4 Disjoint Sets IS CONNECTED

    /**
     * Returns true iff elements p and q are connected.
     * @param p an element
     * @param q the other element
     * @return true if p and q are in the same set
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isConnected(int p, int q) {
		
		validate(p);
		validate(q);
		int rootp = findRootr(p);
		int rootq = findRootr(q);
		return rootp == rootq;
		
    }


    // COURSEWORK 3 PART A.5 Disjoint Sets CONNECT

    /**
     * Connects two elements p and q together,
     * by combining the sets containing them.
     * @param p an element
     * @param q the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void connect(int p, int q) {
		
		validate(p);
		validate(q);
		if (isConnected(p,q)){
		    return;
        }

		int rootp = findRootr(p);
		int rootq = findRootr(q);
		int weightp = -parent(rootp);
		int weightq = -parent(rootq);
		if (weightp <= weightq){
		    parent[rootp] = rootq;
		    parent[rootq] -= weightp;
		}
		else {
		    parent[rootq] = rootp;
		    parent[rootp] -= weightq;
        }
		
    }

//    public static void main(String[] args){
//
//        DisjointSets ds = new DisjointSets(4);
//        ds.connect(1, 0);
//        System.out.println(ds.sizeOf(1));
//        System.out.println(ds.parent(1));
//        System.out.println(ds.parent(0));
//        ds.connect(3, 2);
//        System.out.println(ds.isConnected(3, 1));
//        ds.connect(3, 1);
//        System.out.println(ds.parent(3));
//        System.out.println(ds.isConnected(3, 1));
//        System.out.println(ds.parent(2));
//
//    }
	
}
