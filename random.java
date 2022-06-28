// 数の表示とサイコロ
public class random {
	public static void main(String[] args) {
	    double rand = Math.random() * 100 +1;
		System.out.println(rand);
		int number = (int)rand;
		System.out.println(number);
		System.out.println("あなたは" + number + "番です");
	}
}
