import java.io.*;
import java.net.*;

class StudentServer {
    private ObjectInputStream inputFromClient;

    public static void main(String[] args) {
        new StudentServer();
    }

    public StudentServer() {
        try {
// Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started ");
            while (true) {
// Listen for a new connection request
                Socket socket = serverSocket.accept();
// Create an input stream from the socket
                inputFromClient = new ObjectInputStream(socket.getInputStream());
// Read from input
                Object object = inputFromClient.readObject();
                StudentAddress sa = (StudentAddress) object;
                System.out.println(sa.getName() + sa.getStreet() + sa.getCity());
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                inputFromClient.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}