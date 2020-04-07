package mohan.springframework.msscbrewery.services;

import mohan.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("MOHAN").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name(customerDto.getName()).build() ;
    }

    @Override
    public void deleteByCustomerId(Long customerId) {

    }

    @Override
    public void updateCustomer(Long customerId, CustomerDto customerDto) {

    }
}
