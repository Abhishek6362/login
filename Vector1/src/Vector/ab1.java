package Vector;

import java.util.Vector;

public class ab1 {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add("hello");
		l1.add('a');
		l1.add(10);
		System.out.println(l1);
		l1.add(1,"hey hey");
		System.out.println(l1);
	}

}
