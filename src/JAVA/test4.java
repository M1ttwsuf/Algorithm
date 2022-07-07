package JAVA;


interface Compare{
    public int compareTo(int a, int b);
}

public class test4 {
    public static void exec(Compare com) {
        int n = 10;
        int m = 20;
        int value = com.compareTo(n, m);
        System.out.println(value);
    }
    public static void main(String[] args) {
        exec((i,j)->{
            return i+j;
        });
    }
}