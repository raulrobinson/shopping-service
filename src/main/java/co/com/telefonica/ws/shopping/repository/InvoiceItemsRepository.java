package co.com.telefonica.ws.shopping.repository;

import co.com.telefonica.ws.shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
