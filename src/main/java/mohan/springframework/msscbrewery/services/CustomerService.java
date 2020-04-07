package mohan.springframework.msscbrewery.services;

import mohan.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
   public CustomerDto getCustomerById(UUID beerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void deleteByCustomerId(Long customerId);

    void updateCustomer(Long customerId, CustomerDto customerDto);
}
