package StreamAPI.CustomerPackage;

public class CustomerDTO
{
    private int id;
    private String name;
    private String email;
    private String address;

    public CustomerDTO(Customer customer)
    {
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.address = customer.getAddress();
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
