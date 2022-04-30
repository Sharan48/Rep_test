package Sharan;

class Das {
	    public static void main(String[] args) {
	        int [] arr={1,2,3};
	        try
	        {
	            int n=1/0;
	            System.out.println(arr[4]);
	        }	        
	        catch(ArithmeticException e)
	        {
	            System.out.println("sd");
	        }
	        catch (ArrayIndexOutOfBoundsException f)
	        {
	            System.out.println("hjdfjkh");
	        }
	        	finally
	        	{
	        		System.err.println("sferg");
	        	}
	        }
	    }
