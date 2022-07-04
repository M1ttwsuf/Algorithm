package JAVA;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import JAVA.Library.Terminals;

public class test1 extends Terminals {
    public static void main(String[] args){
        InetAddress addr1 = null, addr2 = null;
        Terminal("호스트 이름을 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();

        try {
            addr1 = InetAddress.getByName(url);
            addr1 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            Terminal("UnknownHostException");
        } catch (Exception e) {
            Terminal("Exception");
        }

        try {
            TerminalII(url + "의 IP 주소 : ");
            Terminal(addr1.getHostAddress());
            TerminalII("로컬 IP 주소");
            Terminal(addr2.getHostAddress());
        } catch (Exception e) {
            TerminalII(url + "의 IP 주소 : ");
            Terminal(addr1.getHostAddress());
            TerminalII("로컬 IP 주소");
        }
    }
}
