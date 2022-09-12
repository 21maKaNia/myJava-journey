public class BinTest {
	public static void main(String[] args) {
		int bina = 7;
		int binb = 15;
				
		System.out.println("Binary unshifted a (-1): "+Integer.toBinaryString(bina));
		System.out.println("Binary   shifted a (-1): "+Integer.toBinaryString(bina >> 2));

		System.out.println("Binary unshifted b (1): "+Integer.toBinaryString(binb));
		System.out.println("Binary   shifted b (1): "+Integer.toBinaryString(binb >> 2));
	}
}
