public class RemoveWhiteSpace {
    public static void main(String[] args){
        RemoveWhiteSpace   rw=new RemoveWhiteSpace();
      String s="Archit jain";
        System.out.println(rw.removespace(s));

    }
    public String removespace(String a){
        StringBuilder s=new StringBuilder();
        char[] m=a.toCharArray();
        for(char c:m){
            if(!Character.isWhitespace(c)){
                s.append(c);
            }
        }
        return s.toString();

    }
    
}
