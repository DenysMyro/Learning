public class Test {
	
	public static void main (String [] args) {
		
		int cal [] = new int [args.length];
		int max = 0;
		
		for(int i=0; i<args.length;i++){
			cal[i] = Integer.parseInt(args[i]);
			if (max<cal[i]){
				max = cal [i];
			}
			
		}
		System.out.println("Max is "+max);
	}
}