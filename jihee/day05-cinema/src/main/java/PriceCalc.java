import java.util.Scanner;

public class PriceCalc {
    public static void main(String[] args) {
        // 인원 수, 나이들, 조조 여부(Y/N)를 읽습니다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        boolean early = sc.next().equals("Y");

        long total = 0;
        // TODO 1: if / else if로 구분과 기본 요금을 정하세요.
        // TODO 1: 조조 할인 후 구분과 금액을 출력하고 total에 더하세요.
        for (int age : ages) {

            int price = 0;
            String type;

            if (age <= 12) {
                price = 8000;
                type = "어린이";
            }
            else if (age <= 18) {
                price = 12000;
                type = "청소년";
            }
            else if (age <= 64) {
                price = 15000;
                type = "성인";
            }
            else {
                price = 7000;
                type = "경로";
            }

            if (early) price = price * 80/100;
            System.out.println(type + " " + price + "원" );
            total = total + price;
        }

        System.out.println();
        // TODO 1: 합계를 출력하세요. PDF 예시의 합계는 27200원입니다.
        // TODO 1: 10,000,000명 × 15,000원을 int와 long으로 각각 계산해 출력하세요.
        // 계산을 완성한 뒤 아래 임시 안내 줄을 지우세요.
        System.out.println("변경");
    }
}