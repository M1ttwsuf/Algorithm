package JAVA;

public class Exception03 {

    static void handlingException() {

        try {

            throw new Exception();

        } catch (Exception e) {

            System.out.println("호출된 메소드에서 예외가 처리됨!");

        }

    }



    public static void main(String[] args) {

        try {

            handlingException();

        } catch (Exception e) {

            System.out.println("main() 메소드에서 예외가 처리됨!");

        }

    }

}