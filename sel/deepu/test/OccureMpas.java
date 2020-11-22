package sel.deepu.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccureMpas {

	public static void main(String[] args) {
		String st="hhllooowworrldd";
		char[] ch=st.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c:ch){
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}
			else{
				hm.put(c, hm.get(c)+1);
			}
		}
		System.out.println(hm);
		

	}

}
