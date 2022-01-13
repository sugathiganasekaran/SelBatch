package week3.day2;

public class Execute extends MultipleLanguage implements Language,Testool {

	public void ava() {
		System.out.println("Lear ava");
		
	}

	public void Selenium() {
		System.out.println("Lear Selenium");
		
	}
	


	@Override
	public void ruby() {
		System.out.println("Lear ruby");
	}
	
	public static void main(String[] args) {
		Execute e=new Execute();
		e.Python();
		e.Selenium();
		e.ruby();
		e.ava();

		
		
		
	}}		
