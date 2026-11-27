public class SeatMap {
    static final int ROWS = 5, COLS = 8; // A~E행, 1~8번

    static int[] parse(String seat) {
        // TODO 2: B3을 {1, 2}로 바꾸세요. 형식이 틀리거나 범위를 벗어나면 null입니다.
        return null;
    }

    static String name(int r, int c) {
        // TODO 2: (1, 2)를 B3처럼 좌석 이름으로 바꾸세요.
        return "";
    }

    static void print(boolean[][] seats) {
        // TODO 2: 열 번호와 행 이름을 포함해 빈 좌석은 O, 예매된 좌석은 X로 출력하세요.
    }

    static int countEmpty(boolean[][] seats) {
        // TODO 2: false인 좌석의 개수를 반환하세요.
        return 0;
    }

    static String findConsecutive(boolean[][] seats, int n) {
        // TODO 2: A행부터 왼쪽 순으로, 같은 행에 n칸 연속으로 빈 첫 좌석을 찾으세요.
        // 없으면 null을 반환하세요.
        return null;
    }

    public static void main(String[] args) {
        boolean[][] seats = new boolean[ROWS][COLS];
        for (String s : new String[]{"A1", "A2", "A3", "B4"}) {
            int[] p = parse(s);
            if (p == null) {
                System.out.println("TODO 2: 먼저 parse를 완성한 뒤 다시 실행하세요.");
                return;
            }
            seats[p[0]][p[1]] = true;
        }
        print(seats);
        System.out.println("빈 좌석: " + countEmpty(seats));
        System.out.println("5칸: " + findConsecutive(seats, 5));
        System.out.println("6칸: " + findConsecutive(seats, 6));
        System.out.println("9칸: " + findConsecutive(seats, 9));
        System.out.println("F1: " + parse("F1"));
        System.out.println("A9: " + parse("A9"));
    }
}