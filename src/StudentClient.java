import java.io.*;
import java.net.*;
public class StudentClient
{
    public static void main(String[] args)
    {
        try
        {
// Establish connection with the server
            Socket socket = new Socket("127.0.0.1", 8000);
// Create an output stream to the server
            ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
// Create a Student object and send to the server
            StudentAddress s = new StudentAddress("Jack Black", "Sesame", "Gotham");
            toServer.writeObject(s);
        }
        catch (IOException ex) {ex.printStackTrace();}
    }
}
