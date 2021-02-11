package day13;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();//own order
		h.add(3);
		h.add(6);
		h.add(20);
		h.add("java");
		h.add("Hello");
		System.out.println("hashSet "+h);
		LinkedHashSet lh=new LinkedHashSet();//own order
		lh.add(3);
		lh.add(6);
		lh.add(20);
		lh.add("java");
		lh.add("Hello");
		System.out.println("LinkedhashSet "+lh);
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(16);
		t.add(5);
		t.add(14);
		System.out.println("TreeSet "+t);

		TreeSet t1=new TreeSet();
		t1.add(new String("Hello"));
		t1.add("Hi");
		t1.add("Apple");
		System.out.println("TreeSet1 "+t1);


		TreeSet<StringBuffer> t2=new TreeSet<StringBuffer>();
		t2.add(new StringBuffer("Hello"));
		t2.add(new StringBuffer("Apple"));
		

		System.out.println("TreeSet2 "+t2);




	}

}
