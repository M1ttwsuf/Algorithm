package BOJ.fibo.EX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum =0;
        long f1 =0;
        long f2 =0;
        for(int i = 1 ; i < N ; i++){
            sum = f1+f2;
            f1 = f2;
            f2 = sum;
        }
        System.out.println(sum);
    }
}
