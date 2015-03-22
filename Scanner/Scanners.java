public class Scanners{
	public static void ScannerCustomer(ScannerFactory sf){
		Scannable scan=sf.getScannable();
		scan.Scan();
		scan.printData();
	}
	public static void main(String args[]){
		ScannerCustomer(DataScanner.scan);
		ScannerCustomer(RegexScanner.scan);
	}
}