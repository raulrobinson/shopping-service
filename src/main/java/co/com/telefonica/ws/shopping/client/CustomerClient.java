package co.com.telefonica.ws.shopping.client;

import co.com.telefonica.ws.shopping.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static co.com.telefonica.ws.shopping.config.ConfigurationConstants.CUSTOMER_URL;

@FeignClient(name = "customer-service", url = CUSTOMER_URL, fallback = CustomerHystrixFallbackFactory.class)
public interface CustomerClient {

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
