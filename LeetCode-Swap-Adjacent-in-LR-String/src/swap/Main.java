package swap;

public class Main {
	public static void main(String[] args){
		String start = "RXXLRXRX";
		
		String end = "XRLXXRXR";
		
		System.out.println("start: " + start + " end: " + end);
		
		System.out.println("Solutoin: " + canTransform(start, end));
	}
	
    public static boolean canTransform(String start, String end) {
        int l = 0;
        
        int r = 0;
        
        int n = start.length();
        
        // if the length does not equal to each other, return false
        if(start.length() != end.length()){
            return false;
        }
        
        for (int i = 0; i < n; i++){
            if (start.charAt(i) == 'R')
            { 
                r++; 
                l = 0;
            }

            if (end.charAt(i) == 'R') 
            { 
                r--; 
                l = 0;
            }

            if (end.charAt(i) == 'L') 
            { 
                l++; 
                r = 0;
            }
            
            if (start.charAt(i) == 'L') 
            {
                l--; 
                r = 0;
            }
            
            // if l or r less than zero, return false
            if (l < 0 || r < 0){
                return false;
            }
        }
        
        // If l or r does not equal to 0, return false
        if (l != 0 || r != 0){
          return false;  
        }
        
        return true;
    }
}
