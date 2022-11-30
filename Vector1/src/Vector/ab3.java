package Vector;

import java.util.Vector;

public class ab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector t1=new Vector();
		t1.add(10);
		t1.add(20);
		t1.add("hello");
		t1.add('a');
		System.out.println(t1);
		Vector t2=new Vector ();
		t2.add(40);
		t2.add(10);
		t2.add(60);
		t2.add("hello");
		System.out.println(t2);
		t1.addAll(t2);
		System.out.println(t1);
		System.out.println("see the difference");
		t1.addAll(1,t2);
		System.out.println(t1);
	}

}
