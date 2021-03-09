package orders_parser;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
