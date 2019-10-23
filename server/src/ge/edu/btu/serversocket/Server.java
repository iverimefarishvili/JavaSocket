package ge.edu.btu.serversocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket;
        Socket socket;
        ObjectInputStream objectInputStream;


        serverSocket=new ServerSocket(8081);
        System.out.println("სერვერი შეიქმნა!");
        socket = serverSocket.accept();
        System.out.println("კავშირი დამყარდა!");

        objectInputStream=new ObjectInputStream(socket.getInputStream());
        String message=(String) objectInputStream.readObject();
        System.out.println("მიღებული შეყობინებაა:"+message);

        objectInputStream.close();
        socket.close();

        System.out.println("კავშირის დასასრული!");
    }
}
