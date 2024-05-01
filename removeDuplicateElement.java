import java.util.*; 
public class removeDuplicateElement {
    

	public static void main(String[] args) {
		String[] a={"ram","shyam","ram","sita","ravi"};
		HashMap<String,Integer> map=new HashMap<>();
	    for(String str: a){
		    map.put(str,map.getOrDefault(str,0)+1);
		}
		System.out.println(map);
		List <String> uniqueList=new ArrayList<>();
		for(String str:a){
		    if(map.get(str)==1){
		        uniqueList.add(str);
		    }
		}
		String []result=uniqueList.toArray(String[]::new);
		for(String b:result){
		    System.out.println(b);
		}
		}

}
    

