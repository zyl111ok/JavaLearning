import java.util.regex.*;
import java.util.*;
public class RegexScanner implements Scannable{
	private String tmp;
	public static ScannerFactory scan=new ScannerFactory(){
		@Override
		public Scannable getScannable(){
			return new RegexScanner();
		}
	};
	private String testString="tom dog big";
	
	@Override
	public void Scan(){
		Scanner scan=new Scanner(testString);
		String pattern="[tdb][oi][mg]";
		while(scan.hasNext(pattern)){
			scan.next(pattern);
			MatchResult match=scan.match();
			tmp=match.group();
			System.out.print(tmp+" ");
		}
	}
	
	@Override
	public void printData(){
		System.out.println();
	}
	

}