public class Sort {
	public static void main (String [] args) {
		
		int list [] = new int [args.length];
		int temp;
		
		for(int i=0; i<args.length;i++){
			list[i] = Integer.parseInt(args[i]);
		}
		
		for(int j=list.length;j>0; j--){
			for(int i=0;i<j;i++){
				if (i!=list.length-1){	
					if(list[i]>list[i+1]) {
						temp = list [i+1];
						list [i+1] = list[i];
						list[i] = temp;
					}
				}	
			}
		}
		
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}
	
	}
}