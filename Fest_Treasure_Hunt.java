import java.util.*;
public class Fest_Treasure_Hunt {
    static ArrayList<Integer>[] graph;
    static int bfs(int start, int end, int n){
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        Queen<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            if(u == end){
                return dist[u];
            }
            for(int v : graph[u]){
                if(dist[v] == -1){
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n + 1];
        for(int i = 1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        int k = sc.nextInt();
        int[] clue = new int[k];
        for(int i=0; i<k; i++){
            clue[i] = sc.nextInt();
        }
        int current = 1;
        int total = 0;
        for(int i=0; i<k; i++){
            int distance = bfs(current, clue[i], n);
            if(distance == -1){
                System.out.println(-1);
                return;
            }
            total += distance;
            current = clue[i];
        }
        System.out.println(total);
        sc.close();
    }
}
