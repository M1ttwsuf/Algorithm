package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*열개씩 끊어 출력하기*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = s.length();

        for(int i =0; i <N/10 ; i++){
            System.out.println(s.substring(i*10,(i+1)*10));

        }

        System.out.println(s.substring((N/10)*10));
    }
}
