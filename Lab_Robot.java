import java.util.Scanner;
public class Lab_Robot {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char[][] grid = new char[n][m];
    int r = 0, c = 0;
    for(int i=0; i<n; i++){
        String s = sc.next();
        for(int j=0; j<m; j++){
            grid[i][j] = s.charAt(j);
            if(grid[i][j] == 'S'){
                r=i;
                c=j;
            }
        }
    }
    int k = sc.nextInt();
    String commands = sc.next();
    boolean[][] visited = new boolean[n][m];
    visited[r][c] = true;
    for(int i=0; i<k; i++){
        int nr = r;
        int nc = c;
        char ch = commands.charAt(i);
        if(ch == 'U'){
            nr--;
        }
        else if(ch == 'D'){
            nr++;
        }
        else if(ch == 'L'){
            nc--;
        }
        else if(ch == 'R'){
            nc++;
        }
        if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] != '#'){
            r = nr;
            c = nc;
            visited[r][c] = true;
        }
    }
    int count = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(visited[i][j]){
                count++;
            }
        }
    }
    System.out.println((r + 1) + " " + (c + 1));
    System.out.println(count);
    sc.close();
}
}
