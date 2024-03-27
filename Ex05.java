package chap03;

public class Ex05 {

	public static void main(String[] args) {
		        
		        int tri = 10;
		        int a = 1;
		        int b = 1;
		        int c = 1;
		        Pita(a, b, c, tri);
		        
		    }
	static void Pita(int a, int b,int c, int tri) {
		 for (a = 1; a <= tri; a++) {
		      
	        	for (b = 1; b <= tri; b++) {
	      
	        		for (c = 1; c <= tri; c++) {
	     
	        			if (a * a + b * b == c * c) {
	    
	        				if (a + b + c <= 20) {
	                            System.out.println(a + ", " + b + ", " + c);
	                        }
	                    }
	                }
	            }
	        }
	}
		}
