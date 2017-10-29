import java.util.Map;
import java.util.HashMap;

public class WordCount {
	public static void main (String [] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<args.length;i++){
			if(map.containsKey(args[i])){
				map.put(args[i], map.get(args[i])+1);
			} else {
				map.put(args[i], 1);
			}
		}
		
		for (String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}
}