package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryCurrencies
{
    private String countryName;
    private String currency;

    public CountryCurrencies(String countryName, String currency)
    {
        this.countryName = countryName;
        this.currency = currency;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public String getCurrency()
    {
        return currency;
    }

    public static void main(String[] args)
    {
        List<CountryCurrencies> list= Arrays.asList(
                new CountryCurrencies("India","Rupee"),
                new CountryCurrencies("USA","Dollar"),
                new CountryCurrencies("Dubai","Dirham")
        );

        Map<String,String> map = list.stream()
                .collect(Collectors.toMap(CountryCurrencies::getCountryName,CountryCurrencies::getCurrency));

        System.out.println(map);
    }
}
