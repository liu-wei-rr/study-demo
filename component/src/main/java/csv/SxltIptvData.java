package csv;

import com.opencsv.bean.CsvBindByPosition;

/**
 * @author liuw
 * @date 2020/9/8
 */
public class SxltIptvData {

    @CsvBindByPosition(position = 0)
    private String user_account;
    @CsvBindByPosition(position = 1)
    private String mac_address;
    @CsvBindByPosition(position = 2)
    private String city_info;
    @CsvBindByPosition(position = 3)
    private String customer_name;
    @CsvBindByPosition(position = 4)
    private String contact_number;
    @CsvBindByPosition(position = 5)
    private String address;
    @CsvBindByPosition(position = 6)
    private String operation_code;
    @CsvBindByPosition(position = 7)
    private String extend_field1;
    @CsvBindByPosition(position = 8)
    private String extend_field2;

    /*@CsvBindByName(column = "user_account")
    private String user_account;
    @CsvBindByName(column = "mac_address")
    private String mac_address;
    @CsvBindByName(column = "city_info")
    private String city_info;
    @CsvBindByName(column = "customer_name")
    private String customer_name;
    @CsvBindByName(column = "contact_number")
    private String contact_number;
    @CsvBindByName(column = "address")
    private String address;
    @CsvBindByName(column = "operation_code")
    private String operation_code;
    @CsvBindByName(column = "extend_field1")
    private String extend_field1;
    @CsvBindByName(column = "extend_field2")
    private String extend_field2;*/

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public String getCity_info() {
        return city_info;
    }

    public void setCity_info(String city_info) {
        this.city_info = city_info;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperation_code() {
        return operation_code;
    }

    public void setOperation_code(String operation_code) {
        this.operation_code = operation_code;
    }

    public String getExtend_field1() {
        return extend_field1;
    }

    public void setExtend_field1(String extend_field1) {
        this.extend_field1 = extend_field1;
    }

    public String getExtend_field2() {
        return extend_field2;
    }

    public void setExtend_field2(String extend_field2) {
        this.extend_field2 = extend_field2;
    }

    @Override
    public String toString() {
        return "SxltIptvData{" +
                "user_account='" + user_account + '\'' +
                ", mac_address='" + mac_address + '\'' +
                ", city_info='" + city_info + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", contact_number=" + contact_number +
                ", address='" + address + '\'' +
                ", operation_code=" + operation_code +
                ", extend_field1='" + extend_field1 + '\'' +
                ", extend_field2='" + extend_field2 + '\'' +
                '}';
    }
}
