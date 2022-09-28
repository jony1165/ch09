package class03;
class Caaa
{
	private int value;
	
	public Caaa()
	{
		value=10; //試填寫此處程式碼，使得呼叫此建構元時，value會被設為10
		System.out.println("value="+value);
	}
	public Caaa(int i) 
	{
		value = i;
		System.out.println("value="+value);
	}
}
public class class03 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa(); //沒有引數的建構元
		Caaa obj2 = new Caaa(12);//有引數的建構元
	}
}
