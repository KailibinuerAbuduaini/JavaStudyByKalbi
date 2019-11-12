package Repl_Assignment_part_4;

public class repl_116_Utopian_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] year=new int[10];
    int growth=1;
    int treeSize=1;
    for(int i=0;i<year.length;i++) {
    	year[i]=i+1;
    
           if(i<3) {
        	   treeSize=year[i]*growth;
        	   System.out.println("year "+year[i]+" - growth"+growth+" cm");
        	   System.out.println("tree size: "+treeSize+" cm");
           }
           if(i>=3) {
        	   growth=2;
        	  treeSize +=2;
        	  System.out.println("year "+year[i]+" - growth"+growth+" cm");
       	       System.out.println("tree size: "+treeSize+" cm");
        	
           }
    }
}
}