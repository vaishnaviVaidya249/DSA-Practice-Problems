public class ReverseWords {
    String[] a=str.split(" ");
		StringBuilder sb=new StringBuilder();
	    for(int i=a.length-1;i>=0;i--){

            

            sb.append(a[i]);

            sb.append(" ");

        

        }
		
		
		return sb.toString();
}
