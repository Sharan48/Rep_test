package Sharan;

class Asd
{
    public static void main(String[] args) {
		
        try {
            int a = 16;
            int b = 2;
            int i = a / b;
            int[] arr = {1, 3, 4,};
                System.out.println(arr[i]);
        
		}catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("caught");
            }

         catch (ArithmeticException d) {
            System.out.println("Sha");
        }
    }
}
    


