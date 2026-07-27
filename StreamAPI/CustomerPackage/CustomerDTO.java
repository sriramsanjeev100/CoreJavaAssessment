package StreamAPI.CustomerPackage;

public class CustomerDTO
{
    private int id;
    private String name;
    private String email;
    private String address;

    public CustomerDTO(int id, String name, String email, String address)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
