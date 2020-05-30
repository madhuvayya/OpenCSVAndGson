import com.opencsv.bean.CsvBindByName;

public class CSVUser {

    @CsvBindByName
    private String name;

    @CsvBindByName(column = "email",required = true)
    private String email;

    @CsvBindByName(column = "phone")
    private String phone;

    @CsvBindByName
    private String country;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
