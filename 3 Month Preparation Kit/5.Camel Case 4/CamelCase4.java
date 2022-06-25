import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        String name,newName;
        int n;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
        	
        	name = scan.nextLine();
        	StringBuilder mName = new StringBuilder(name);
        	
        	if(mName.charAt(0) == 'C') {
        	
        		if(mName.charAt(2) == 'C') {
        			
        			mName.replace(4, 5, Character.toString(Character.toUpperCase(mName.charAt(4))));
        			for(int i=5;i<mName.length();i++) {
        				
        				if(Character.isWhitespace(mName.charAt(i))) {
        					mName.replace(i, i+1, Character.toString(Character.toUpperCase(mName.charAt(i+1))));
        					mName.delete(i+1, i+2);
        				}
        			}
        				
    			}
        		else if(mName.charAt(2) == 'M') {
        			for(int i=4;i<mName.length();i++) {
        				
        				if(Character.isWhitespace(mName.charAt(i))) {
        					mName.replace(i, i+1, Character.toString(Character.toUpperCase(mName.charAt(i+1))));
        					mName.delete(i+1, i+2);
        				}
        			}
        			mName.append("()");
        			
        		}
        		else if(mName.charAt(2) == 'V') {
        		
        			for(int i=4;i<mName.length();i++) {
        				
        				if(Character.isWhitespace(mName.charAt(i))) {
        					mName.replace(i, i+1, Character.toString(Character.toUpperCase(mName.charAt(i+1))));
        					mName.delete(i+1, i+2);
        				}
        			}
        		}
        		mName.delete(0, 4);
        		newName = mName.toString();
        		System.out.println(newName);
        	}
        	
        		
        	
        	else if(mName.charAt(0) == 'S') {
        		n = mName.length();
        		
        		
        		for(int i=5;i<n;i++) {
    				
    				if(Character.isUpperCase(mName.charAt(i))) {
    					mName.insert(i," ");
    					i++;
    				}
    			}
        		
        		if(mName.charAt(2) == 'C') {
        			
        			
        			
        		}
        		else if(mName.charAt(2) == 'M') {
        			mName.delete(mName.length()-2, mName.length());
        		}
        		else if(mName.charAt(2) == 'V') {
        			
        		}
        		mName.delete(0, 4);
        		newName = mName.toString();
        		newName = newName.toLowerCase();
        		System.out.println(newName);
        		
        	}
        	
        	
        	
        	
        }
 
        
    }
        
        
}
