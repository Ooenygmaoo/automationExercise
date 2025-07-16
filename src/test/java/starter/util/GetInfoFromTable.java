package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.RegisterModel;

import java.util.List;

public class GetInfoFromTable {

    public static RegisterModel getRegisterdata(DataTable userReG) {
        List<List<String>> rows = userReG.asLists((String.class));
        String inputName = "";
        String email = "";
        String password = "";
        String days = "";
        String months = "";
        String year = "";
        String firstname = "";
        String lastname = "";
        String company = "";
        String address = "";
        String country = "";
        String state = "";
        String city = "";
        String zipcode = "";
        String mobile = "";
        for (List<String> columns : rows) {
            inputName = columns.get(0);
            email = columns.get(1);
            password = columns.get(2);
            days = columns.get(3);
            months = columns.get(4);
            year = columns.get(5);
            firstname = columns.get(6);
            lastname = columns.get(7);
            company = columns.get(8);
            address = columns.get(9);
            country = columns.get(10);
            state = columns.get(11);
            city = columns.get(12);
            zipcode = columns.get(13);
            mobile = columns.get(14);


        }


        RegisterModel registerModel = new RegisterModel();
        registerModel.setInputName(inputName);
        registerModel.setEmail(email);
        registerModel.setPassword(password);
        registerModel.setDays(days);
        registerModel.setMonths(months);
        registerModel.setYear(year);
        registerModel.setFirstname(firstname);
        registerModel.setLastname(lastname);
        registerModel.setCompany(company);
        registerModel.setAddress(address);
        registerModel.setCountry(country);
        registerModel.setState(state);
        registerModel.setCity(city);
        registerModel.setZipcode(zipcode);
        registerModel.setMobile(mobile);


        return  registerModel;
    }
}
