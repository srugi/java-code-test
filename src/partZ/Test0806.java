package partZ;
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Test0806 {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        int row = garden.length;
        int col = garden[0].length;
        
        int change_cnt = 0;
        do {
            change_cnt = 0;
            
            int[][] next_garden = new int[row][col];
            
            for (int i = 0 ; i < row; i++) {
                for (int j = 0 ; j < col ; j++) {
                    if (garden[i][j] == 1) {
                        next_garden[i][j] = 1;
                    } else if (garden[i][j] == 0) {
                        if ((i-1 >= 0) && (garden[i-1][j] == 1)) {
                            change_cnt++;
                            next_garden[i][j] = 1;
                        } else if ((j-1 > 0) && (garden[i][j-1] == 1)) {
                            change_cnt++;
                            next_garden[i][j] = 1;
                        } else if ((i+1 < row) && (garden[i+1][j] == 1)) {
                            change_cnt++;
                            next_garden[i][j] = 1;
                        } else if ((j+1 < col) && (garden[i][j+1] == 1)) {
                            change_cnt++;
                            next_garden[i][j] = 1;
                        } else {
                            next_garden[i][j] = 0;
                        }
                    }
                }
            }
            if (change_cnt > 0) {
                answer++;
                for (int i = 0 ; i < row; i++) {
                    garden[i] = next_garden[i].clone();
                }
            }
        } while (change_cnt > 0);
            
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Test0806 sol = new Test0806();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
    }    
}