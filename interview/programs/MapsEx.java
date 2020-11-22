package interview.programs;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {

	public static void main(String[] args) {

		String str = "haiworldhiworld";
		char arr[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : arr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println(map);

	}
	
	

}
