package hw09;
class CRectangle{
	int width, height;
	public CRectangle(int w, int h) {
		width=w; height=h;
	}
	public CRectangle() {
		width=10; height=8;
	}
	public void show() {
		System.out.println(""+width);
		System.out.println(""+height);
	}
}
public class class01ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rec1= new CRectangle(5,2);
		 rec1.show();
		CRectangle rec2= new CRectangle();
		rec2.show();

	}

}
