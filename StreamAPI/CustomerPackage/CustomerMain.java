package StreamAPI.CustomerPackage;

import java.util.Arrays;
import java.util.List;

public class CustomerMain
{
    public static void main(String[] args)
    {
        List<Customer> customers= Arrays.asList(
                new Customer(1,"Sriram","sriramsanjeev100@gmail.com","Trivandrum","pass123",true),
                new Customer(2,"Leo","leowinston12@gmail.com","Bengaluru","pass456",false),
                new Customer(3,"John","johnshibu@gmail.com","Kochi","pass789",true));

        List<CustomerDTO> dtoList = customers.stream()
                .map(c -> new CustomerDTO(
                        c.getId(),
                        c.getName(),
                        c.getEmail(),
                        c.getAddress()))
                .toList();

        dtoList.forEach(System.out::println);
    }
}
