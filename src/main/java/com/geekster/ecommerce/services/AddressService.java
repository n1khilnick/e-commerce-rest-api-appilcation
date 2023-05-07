package com.geekster.ecommerce.services;

import com.geekster.ecommerce.models.Address;
import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.repositories.IAddressDao;
import com.geekster.ecommerce.repositories.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressDao addressDao;

    public void createAddress(Address address) {
        addressDao.save(address);
    }

    public Iterable<Address> getAllAddresses() {
        return addressDao.findAll();
    }
}
