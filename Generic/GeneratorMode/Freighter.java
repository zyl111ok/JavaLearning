import java.util.*;
//ªı¥¨¿‡
public class Freighter extends ArrayList<Product>{
	public Freighter(int nProduct){
		Generators.fill(this,Product.generator,nProduct);
	}
}