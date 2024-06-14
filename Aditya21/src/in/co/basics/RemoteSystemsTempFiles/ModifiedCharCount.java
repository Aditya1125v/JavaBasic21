package in.co.basics.RemoteSystemsTempFiles;

public class ModifiedCharCount {

	    public static void main(String[] args) {
	        String[] s = { "aniket", "Verma","Raman"};

	        for (String s1 : s) {
	            String s3 = s1.toLowerCase();

	            for (char a = 'a'; a <= 'z'; a++) {
	                int count = 0; // Reset count for each character 'a' to 'z'
	                
	                for (int i = 0; i < s3.length(); i++) {
	                    if ( s3.charAt(i)==a){
	                    	
	                        count++;
	                    }
	                }
	                
	                if (count != 0) {
	                    System.out.println(a + " = " + count);
	                }
	            }
	        }
	    }
	}


