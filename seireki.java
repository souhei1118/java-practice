// 西暦年から昭和年を求める
public class Main {
	public static void main(String[] args) {
		int seireki = (int)(Math.random() * 63 + 1926);
		System.out.print("西暦" + seireki + "年は");

		// 昭和年を計算
		int showa = 0;
		System.out.println("昭和" + showa + "年です。");
	}
}
