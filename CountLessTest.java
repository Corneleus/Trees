package Trees;

public class CountLessTest {

	public static void main(String [] args){
		
		Golfer a = new Golfer("joe", 1);
		Golfer b = new Golfer("Bob", 2);
		Golfer c = new Golfer("george", 3);
		Golfer d = new Golfer("korriey", 4);
		Golfer e = new Golfer("yeirrok", 5);
		Golfer f = new Golfer("green", 0);
		Golfer g = new Golfer("billy", -1);
		Golfer h = new Golfer("george", 1);
		
		BinarySearchTree<Golfer> tree = new BinarySearchTree<Golfer>();		
		
		tree.add(a);
		tree.add(b);
		tree.add(c);
		tree.add(d);
		tree.add(e);
		tree.add(f);	
		tree.add(g);
		tree.add(h);
		
		
		System.out.println("Tree Size: " + tree.size());
		System.out.println("Count Less: " + countLess(tree, d));
		System.out.println("Min: " + min(tree));
		System.out.println("Max:  " + max(tree));	
	    System.out.println("Number of Leafs: " + tree.leafCount(tree));
		System.out.println("Number of Single parents: " + tree.singleParentCount(tree));
	 
	}
	
	static int countLess(BinarySearchTree<Golfer> tree, Golfer maxValue){//8.15
		  tree.reset(1);
		  int b = 0;
		  Golfer cur = tree.getNext(1);
		  for(int i = 0; i < tree.size()-1; i++) {
			  if(cur.compareTo(maxValue) <= 0)
				  b++;
			  cur = tree.getNext(1);
		  }
		  return b;
	  }
	  
	  static Golfer min(BinarySearchTree<Golfer> tree){//8.16
		  tree.reset(1);
		  Golfer min =  tree.getNext(1);
		 /* Golfer cur =  tree.getNext(1);
		  if(cur.compareTo(min) == -1)
			  min = cur;
		  for(int i = 0; i < tree.size()-2; i++) {
			  cur =  tree.getNext(1);
			  if(cur.compareTo(min) == -1){
				  min = cur;
			  }
			  
		  }*/
		return min;
	  }
	 static Golfer max(BinarySearchTree<Golfer> tree){//8.17
		  tree.reset(1);
		  Golfer max = tree.getNext(1);
		  Golfer cur = tree.getNext(1);
		  if(max.compareTo(cur) == -1)
			  max = cur;
		  for(int i = 0; i <  tree.size()-2; i++) {
			  cur =  tree.getNext(1);
			  if(max.compareTo(cur) == -1){
				  max = cur;	  
			  }
		  }
		return max;
	  }
}
