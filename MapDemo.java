package day13;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h = new HashMap();
		h.put("Sachin", "Sachin is opening batsman");
		h.put("rahul", "middle order");
		h.put("pant", "wicket keeper middle order");
		h.put("rahul", "head coach");

		System.out.println(h);
		System.out.println(h.get("Sachin"));
		System.out.println(h.containsKey("pant"));

		System.out.println("getting keys "+h.keySet());
		System.out.println("getting values "+h.values());

		System.out.println("both keyy and value "+h.entrySet());
		h.clear();
		System.out.println(h);

	}

}
