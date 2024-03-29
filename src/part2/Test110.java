package part2;

public class Test110 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = {{5,3,7,2,3},{3,7,1,6,1},{7,2,5,3,4},{4,3,6,4,1},{8,7,3,5,2}};

        // solution
        int answer = 0;
        // 12 ,3 , 6 , 9 방향으로 탐색
        // int[] dx = {-1,0,1,0};
        // int[] dy = {0,1,0,-1};
        // 모든 방향 탐색
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};

        boolean flag = true;
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++) {
                for(int k = 0; k < dx.length; k++) {
                    flag = true;
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // System.out.println("nx : " + nx + "  ny :" + ny);
                    if (nx < 0 || nx >= n){
                        continue;
                    }
                    if (ny < 0 || ny >= n) {
                        continue;
                    }
                    if(arr[i][j] < arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    answer++;
                }
            }
        }
        System.out.println("answer : " + answer );
    }
}
