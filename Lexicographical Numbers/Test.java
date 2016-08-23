import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> lexicalOrder = new Solution().lexicalOrder(13);
		for (int i : lexicalOrder) {
			System.out.println(i);
		}
	}
}
