//Box Swap/Add Example

class Box<T>
{
	private T obj;
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	
	}

}


public class Example02 {

	public static <T> void swapBox(Box<T> b1, Box<T> b2)
	{
		T temp;
		temp = b1.get();
		b1.set(b2.get());
		
		b2.set(temp);

	}

	public static <T extends Number> double add1(T a1, T a2)
	{
		double result;
		
		result = a1.doubleValue() + a2.doubleValue();
		
		return result;
		
	}
	
	public static <T extends Number> T add2(T a1, T a2)
	{
		T result = null;
		
		if (a1 instanceof Integer)
		{
			result = (T)(Integer)((Integer)a1 + (Integer)a2);
			
		}
		else if (a1 instanceof Double)
		{			
			result = (T)(Double)((Double)a1 + (Double)a2);
		}
				
		return result;
	}
	
	public static void main(String[] args) {
	
		Integer a1 = 1;
		Integer a2 = 5;
		
		Integer k = add2(a1, a2);
		
		Double d1 = 1.0;
		Double d2 = 2.2;
		
		Double z = add2(d1, d2);
		
		System.out.println(k);
		System.out.println(z);
	
		
	}

}
