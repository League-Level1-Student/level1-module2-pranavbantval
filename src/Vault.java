import java.util.Random;

public class Vault {
	Random r = new Random();
	private int code = r.nextInt(1000001);
 JamesBond x = new JamesBond();
 public boolean tryCode(int i){
	Boolean b;
	if(this.code==i) {
		b=true;
	}
	else {
		b=false;
	}
	return b;
	
}
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond x = new JamesBond();
	
	
		System.out.println(x.findCode(v));
	
}
}
class JamesBond{
	int i;
	public int findCode(Vault v){
		for ( i = 0; i < 1000000; i++) {
			if(v.tryCode(i)==true) {
				
				break;
			}
			
			
		}
		return i;
	}
}
