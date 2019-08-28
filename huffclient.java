package june29;

public class huffclient {

	public static void main(String[] args) {
		huffman huff = new huffman(
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbccccd");
		System.out.println(huff.encode("a"));
		System.out.println(huff.decode("10101001"));
	}
}
