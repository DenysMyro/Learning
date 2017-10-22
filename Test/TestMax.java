public class TestMax {

    public static void main (String [] args) {
        int cal [] = new int [args.length];
        for(int i=0;i<args.length;i++){
            cal [i]= Integer.parseInt(args[i]);
        }
		
        System.out.println("Maximum is: "+Calc.count(cal));
    }
}

class Calc {

    public static int count (int list []) {
        int max = list[0];
        for(int i=0;i<list.length;i++) {
            if(max<list[i]){
                max=list[i];
            }
        }
        return max;
    }
}
