package BOJ.greed1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] c = new int[N];

        for(int i=0; i<N ; i++){
            c[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;

        for(int i=N-1 ; i>=0;i--){
            if(c[i] <= M ){
             count += (M/c[i]);
             M = M % c[i];
            }
        }
        System.out.println(count);
    }
}
