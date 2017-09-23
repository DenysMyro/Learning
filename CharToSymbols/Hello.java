
/*created by Denys Myroshnychenko*/

public class Hello {
		/*Lines to be printed with converted arguments*/
		static String line1="";
		static String line2="";
		static String line3="";
		static String line4="";
		static String line5="";
		static String line6="";
		static String line7="";
		
	public static void main(String [] arg) {
		
		//read number of arguments and converst them to stars font
		for(int i=0;i<arg.length;i++){
			convert(arg[i]);
		}
		
		/*Display lines with converted arguments*/

		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);
		System.out.println(line7);
		
	}
	
	public static void convert (String string){	
	
		/*I did enough letters to print Myroshnychenko Denys Victorovich, but approach the same for whole alphabet */
	
		String a[] = {"    ***     ", "   ** **    ", "  **   **   ", " **     **  ", " *********  "," **     **  ",  " **     **  "};
		String b[] = {"********  ", "**     ** ", "**     ** ", "********  ", "**     ** ", "**     ** ", "********  "};
		String c[] = {"  ******  ", " **    ** ", " **       ", " **       ", " **       ", " **    ** ","  ******  "}; 
		String m[] = {"**     ** ", "***   *** ", "**** **** ", "** *** ** ", "**     ** ", "**     ** ", "**     ** "};
		String y[] = {"**    ** ", " **  **  ","  ****   ", "   **    ", "   **    ", "   **    ", "   **    "};
		String r[] = {"********  ", "**     ** ", "**     ** ", "********  ", "**   **   ", "**    **  ", "**     ** "};
		String o[] = {" *******  ", "**     ** ", "**     ** ", "**     ** ", "**     ** ", "**     ** ", " *******  "};
		String s[] = {" ******  ", "**    ** ", "**       ", " ******  ", "      ** ", "**    ** ", " ******  "};
		String h[] = {"**     ** ", "**     ** ", "**     ** ", "********* ", "**     ** ",  "**     ** ","**     ** "};
		String n[] = {"**    ** ", "***   ** ", "****  ** ", "** ** ** ", "**  **** ", "**   *** ", "**    ** "};
		String e[] = {"******** ", "**       ", "**       ","******** ","**       ", "**       ","******** "};
		String k[] = {"**    ** ", "**   **  ", "**  **   ", "*****    ", "**  **   ", "**   **  ", "**    ** "};
		String d[] = {"********  ", "**     ** ", "**     ** ", "**     ** ", "**     ** ", "**     ** ", "********  "};
		String v[] = {"**     ** ", "**     ** ", "**     ** ", "**     ** ", " **   **  ", "  ** **   ", "   ***    "};
		String i[] = {"**** ", " **  ", " **  ", " **  ", " **  ", " **  ", "**** "};
		String t[] = {"******** ", "   **    ", "   **    ", "   **    ", "   **    ", "   **    ", "   **    ",};
		
	
		switch(string) {
			case "a" :
				line1 += a[0];
				line2 += a[1];
				line3 += a[2];
				line4 += a[3];
				line5 += a[4];
				line6 += a[5];
				line7 += a[6];
				break;
			case "b" :
				line1 += b[0];
				line2 += b[1];
				line3 += b[2];
				line4 += b[3];
				line5 += b[4];
				line6 += b[5];
				line7 += b[6];
				break;
			case "c" :
				line1 += c[0];
				line2 += c[1];
				line3 += c[2];
				line4 += c[3];
				line5 += c[4];
				line6 += c[5];
				line7 += c[6];
				break;
			case "d" :
				line1 += d[0];
				line2 += d[1];
				line3 += d[2];
				line4 += d[3];
				line5 += d[4];
				line6 += d[5];
				line7 += d[6];
				break;
			case "m" :
				line1 += m[0];
				line2 += m[1];
				line3 += m[2];
				line4 += m[3];
				line5 += m[4];
				line6 += m[5];
				line7 += m[6];
				break;
			case "v" :
				line1 += v[0];
				line2 += v[1];
				line3 += v[2];
				line4 += v[3];
				line5 += v[4];
				line6 += v[5];
				line7 += v[6];
				break;
			case "y" :
				line1 += y[0];
				line2 += y[1];
				line3 += y[2];
				line4 += y[3];
				line5 += y[4];
				line6 += y[5];
				line7 += y[6];
				break;
			case "r" :
				line1 += r[0];
				line2 += r[1];
				line3 += r[2];
				line4 += r[3];
				line5 += r[4];
				line6 += r[5];
				line7 += r[6];
				break;
			case "o" :
				line1 += o[0];
				line2 += o[1];
				line3 += o[2];
				line4 += o[3];
				line5 += o[4];
				line6 += o[5];
				line7 += o[6];
				break;
			case "s" :
				line1 += s[0];
				line2 += s[1];
				line3 += s[2];
				line4 += s[3];
				line5 += s[4];
				line6 += s[5];
				line7 += s[6];
				break;	
			case "h" :
				line1 += h[0];
				line2 += h[1];
				line3 += h[2];
				line4 += h[3];
				line5 += h[4];
				line6 += h[5];
				line7 += h[6];
				break;
			case "n" :
				line1 += n[0];
				line2 += n[1];
				line3 += n[2];
				line4 += n[3];
				line5 += n[4];
				line6 += n[5];
				line7 += n[6];
				break;
			case "e" :
				line1 += e[0];
				line2 += e[1];
				line3 += e[2];
				line4 += e[3];
				line5 += e[4];
				line6 += e[5];
				line7 += e[6];
				break;
			case "k" :
				line1 += k[0];
				line2 += k[1];
				line3 += k[2];
				line4 += k[3];
				line5 += k[4];
				line6 += k[5];
				line7 += k[6];
				break;	
			case "i" :
				line1 += i[0];
				line2 += i[1];
				line3 += i[2];
				line4 += i[3];
				line5 += i[4];
				line6 += i[5];
				line7 += i[6];
				break;
			case "t" :
				line1 += t[0];
				line2 += t[1];
				line3 += t[2];
				line4 += t[3];
				line5 += t[4];
				line6 += t[5];
				line7 += t[6];
				break;
			default:
			//nothing happens here
				break;
		}
	}
}