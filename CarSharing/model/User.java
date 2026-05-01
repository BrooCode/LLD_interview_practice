package model;

import java.util.List;
import java.util.Map;

public class User extends Account {
    Map<String,String> address,addressId;
    List<Booking> booking;
}
