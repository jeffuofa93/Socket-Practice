import java.io.*;
import java.net.*;
class StudentAddress implements java.io.Serializable
{
    private String name;
    private String street;
    private String city;
    public StudentAddress(String name, String street, String city)
    {
        this.name = name;
        this.street = street;
        this.city = city;
    }
    public String getName() {return name;}
    public String getStreet() {return street;}
    public String getCity() {return city;}
}
