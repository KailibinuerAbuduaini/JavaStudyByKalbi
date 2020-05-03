package Day036_StaticClassMembers;

public class Countable {
	
	
static int instanceCount=0;// before this is instance variable it belongs to object not class
	
//	later on we add static  make it usable in the  common place 
	
	
 public Countable() {
	 instanceCount++;
 }
 
 
 public int getinstanceCount() {
	 return  instanceCount;
 }
 
}
