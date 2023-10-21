package COM.CG.DAY3;
//import statement for scanner class
import java.util.Scanner;

public class ConstructorMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 101;
		String name = "Renuka";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();

	}

}
