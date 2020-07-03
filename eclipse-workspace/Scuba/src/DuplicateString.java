
public class DuplicateString {
	public static void main (String args[]) {
		String str = "Selenium Training";
		int cnt = 0;
		char[] k = str.toCharArray();
		for(int i = 0; i<str.length();i++) {
			for(int j =i+1; j<str.length(); j++) {
				if (k[i]==k[j]) {
					System.out.println(k[j]);
					
				}
			}
				
			
		}
		
		
		
	}

}
