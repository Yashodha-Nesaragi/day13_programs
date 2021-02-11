package day13;
import java.util.HashSet;
import java.util.LinkedHashSet;

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
		

	}

}
