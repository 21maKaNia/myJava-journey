import java.math.BigInteger;

public class BinTest2 {

	public static void main(String[] args) {
		BigInteger bina = new BigInteger("1111",2);
				
		System.out.println("Binary  a : "+Integer.toBinaryString(bina.intValue()));
		System.out.println("Integer a : "+bina.intValue());
	}
}
