import java.util.*; 
public class removeduplicatelement {
    
    

	public static void main(String[] args) {
		String[] a={"ram","shyam","ram","sita","ravi"};
	    Set<String> s=new HashSet<>();
	    for(String str:a){
	        s.add(str);
	    }
	    System.out.println(s);
		String []re= s.toArray(new String[0]);
		for(String m:re){
		    System.out.println(m);
		    
		}
		
		}

}

