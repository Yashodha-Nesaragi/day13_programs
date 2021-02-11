package day13;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(12);
		o1.add(30);
		o1.add(40);
		o1.add(50);
		System.out.println("elements are:"+o1);
		Collections.sort(o1);
		System.out.println("after sorting"+o1);
		Collections.sort(o1);
		Collections.reverse(o1);
		System.out.println("after reverse "+o1);
		Collections.sort(o1);
		System.out.println("after sorting"+o1);
		System.out.println("min value "+Collections.min(o1));
		System.out.println("max value "+Collections.max(o1));
		int index=Collections.binarySearch(o1,80);
		System.out.println("element found at "+index);

	}

}
