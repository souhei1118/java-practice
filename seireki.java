// 西暦年から昭和年を求める
public class seireki {
	public static void main(String[] args) {
		int seireki = (int)(Math.random() * 20 + 1989);
		System.out.print("西暦" + seireki + "年は");

		// 昭和年を計算
		int showa = seireki - 1989;
		System.out.println("平成" + showa + "年です。");
	}
}
