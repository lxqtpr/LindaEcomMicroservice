package dev.lxqtpr.linda.orderservice.dto.customers;

import lombok.Data;

@Data
public class ResponseCustomerDto {
    private String id;

    private String firstname;

    private String lastname;

    private String email;

    private Address address;
}