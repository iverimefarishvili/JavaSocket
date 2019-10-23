package ge.edu.btu.clientsocket;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Serializable {
    public static void main(String[] args) throws Exception {
        Socket socket;
        ObjectOutputStream objectOutputStream;
        System.out.println("shemoitanet ragac");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        socket= new Socket("localhost",8081);
        System.out.println("კავშირი დამყარებს პროცესშია!");



        objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(text);
        System.out.println("შეტყობინება გაიგზავნა!");
    }
}
