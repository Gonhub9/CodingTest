import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    class Solution {
        public int solution(int[] array) {
            if (array.length == 0) {
                return -1;
            }

            HashMap<Integer, Integer> countMap = new HashMap<>();

            for (int num : array) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            int mode = -1;
            boolean hasDuplicate = false;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mode = num;
                    hasDuplicate = false;  // 새로운 최빈값을 찾았으므로 중복 플래그 초기화
                } else if (count == maxCount) {
                    hasDuplicate = true;  // 동일한 빈도의 값이 있으므로 중복 플래그 설정
                }
            }

            return hasDuplicate ? -1 : mode;  // 중복된 최빈값이 있으면 -1, 그렇지 않으면 최빈값 반환
        }
    }

    class Solution {
        public int solution(int price) {
            if (price >= 500000) {
                return (int) (price * 0.8);
            } else if (price >= 300000) {
                return (int) (price * 0.9);
            } else if (price >= 100000) {
                return (int) (price * 0.95);
            } else {
                return price;
            }
        }
    }

    class Solution {
        public int solution(int hp) {
            int count = 0;

            count += hp / 5;
            hp %= 5;

            count += hp / 3;
            hp %= 3;

            count += hp / 1;
            hp %= 1;

            return count;
        }
    }

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String star = "";
                for (int j = 0; j <= i; j++) {
                    star += "*";
                }
                System.out.println(star);
            }
        }
    }
}