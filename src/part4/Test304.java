package part4;

import java.util.HashMap;

// 4. 모든 아나그램 찾기
// 설명
// S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
// 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

// 입력
// 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
// S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

// 출력
// S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

// 예시 입력 1 
// bacaAacba
// abc
// 예시 출력 1
// 3

public class Test304 {
    public void solution(String source, String target) {
        int answer = 0;
        int window_size = target.length();

        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for(char c : target.toCharArray()) {
            t_map.put(c, t_map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < window_size - 1 ; i++) {
            s_map.put(source.charAt(i), s_map.getOrDefault(source.charAt(i), 0) + 1);
        }
        int lt = 0;
        for(int i = window_size - 1 ; i < source.length(); i++) {
            s_map.put(source.charAt(i), s_map.getOrDefault(source.charAt(i), 0) + 1);
            // System.out.println(s_map.keySet());
            if (t_map.equals(s_map)) {
                answer++;
            }

            if (s_map.get(source.charAt(lt)) - 1 == 0) {
                s_map.remove(source.charAt(lt));
            } else {
                s_map.put(source.charAt(lt), s_map.get(source.charAt(lt)) - 1);
            }
            lt++;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        String str_1 = "bacaAacba";
        String str_2 = "abc";

        Test304 test304 = new Test304();
        test304.solution(str_1, str_2);

    }
}
