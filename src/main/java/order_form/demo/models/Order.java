package order_form.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "new_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "orderNumber", length = 6, nullable = false)
    private Long orderNumber;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "totalPrice", columnDefinition = "FLOAT", length = 30, nullable = false)
    private Float totalPrice;

    public Order(Long id, Long orderNumber, String email, Float totalPrice) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.email = email;
        this.totalPrice = totalPrice;
    }

    public Order(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
