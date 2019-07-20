package com.simple.socialnetwork.dao;

import com.simple.socialnetwork.models.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressDAO {
    private static List<Address> addresses = new ArrayList<Address>();

    static {
        addresses.add(new Address());
    }
}
