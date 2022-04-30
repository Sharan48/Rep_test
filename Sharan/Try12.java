package Sharan;

class Try12
{
		static void mbl()throws OrderException
		{
			int i=500;
			if(i>=505)
			{
				System.out.println("afs");
			}
			else
			{
				throw new OrderException("sdg");
			}
		}
			public static void main(String[] args)
			{
				try
				{
					mbl();
				}
				catch(OrderException s)
				{
				System.out.println(s.klrhl());	
				}
		}
}
		class  OrderException extends Exception
		{
			String msg;
			 OrderException(String msg)
			 {
				 this.msg=msg;
			 }
			 public String klrhl()
			 {
				 return msg;
			 }
		}