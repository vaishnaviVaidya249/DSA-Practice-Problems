public class ReverseWords {
    public static void main(String[] args) {
        String str="i am learning";
        String[] a=str.split(" ");
		StringBuilder sb=new StringBuilder();
	    for(int i=a.length-1;i>=0;i--){

            

            sb.append(a[i]);

            sb.append(" ");

        

        }
		
		
		System.out.println(sb.toString());
    }
}
        
    
		
		
	
    
// String input="I am Learning";
//         char arr[]=input.toCharArray();
//         List<Character> l=new ArrayList<>();
//         for(char i:arr){
//             l.add(i);
//         }
//         Collections.reverse(l);
//         ListIterator it=l.listIterator();
//         while(it.hasNext()){
//             System.out.print(it.next());
//         }
        
        //String arr[]=input.split(" ");
       
        
        // for(int i=arr.length-1;i>0;i--){
        //     res+=arr[i]+" ";
            
        // }
        // System.out.println(res+arr[0]);
     
        
        
