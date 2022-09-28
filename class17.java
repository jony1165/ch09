package class17;
class Namecard{
	private String name;
	private String address;
	private Phone data;
	/*constructor*/
	public Namecard(String na,String add,String s1,String s2) {
		name=na;
		address=add;
		data=new Phone(s1,s2);
	}
	class Phone{ //(a)
		private String company;
		private String cell;
		public Phone(String s1,String s2) { //(b)
			company=s1; cell=s2;
		}
	}	
	public void show() {
		System.out.println("好友姓名"+this.name);
		System.out.println("好友地址"+this.address);
		System.out.println("好友電話"+data.company);
		System.out.println("好友號碼"+data.cell);
	}
}
public class class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namecard first=new Namecard("Andy","123City","2345-6789","0922-336600");
		first.show();

	}

}
