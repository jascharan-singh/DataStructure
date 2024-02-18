import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Mannu", 1);
		map.put("Tanu", 10);
		map.put("Ali", 11);
		map.put("Baci", 13);
		map.put("Gopi", 17);
		map.put("Rehmat", 19);
		map.put("Rita", 40);
		for (String name: map.keySet()) {
			System.out.println(name+ " : "+ map.get(name) );
		}
		map.remove("Gopi");
		System.out.println("NewMap");
		for (String name: map.keySet()) {
			System.out.println(name+ " : "+ map.get(name) );
		}

		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.get("Mannu"));

	}


}


