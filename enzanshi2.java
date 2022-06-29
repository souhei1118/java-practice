// 値段を計算する

// ランダムでりんごの値段や個数が変わるプログラム
public class Main {
	public static void main(String[] args) {
		int apple_price = (int)(Math.random() * 3 + 1) * 100; // リンゴの単価
		int apple_num = (int)(Math.random()* 10 + 1); // リンゴを買う数
		System.out.println("りんごの単価：" + apple_price + "円");
		System.out.println("りんごを買う数：" + apple_num + "個");

		int total = apple_price * apple_num;
		System.out.println("合計金額：" + total + "円");
	}
}
