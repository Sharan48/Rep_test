package Sharan;

class Demo
{
	private int a=1;
	public int getA()
	{
		return a;
	}
	public void setA(int x)
	{
		a=x;
	}
}
class Asash
{
	public static void main(String[] args) {
		Demo h=new Demo();
		int k = h.getA();
		System.out.println(k);
		h.setA(4);
		int l = h.getA();
		System.out.println(l);
				
	}
}