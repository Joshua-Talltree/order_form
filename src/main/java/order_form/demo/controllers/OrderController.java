package order_form.demo.controllers;

import order_form.demo.models.Order;
import order_form.demo.repo.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final OrderRepository orderDao;


    public OrderController(OrderRepository orderDao) {
        this.orderDao = orderDao;
    }

    @GetMapping("/orders/create")
    public String createOrders(Model model) {
        model.addAttribute("order", new Order());
        return "create";
    }

    @PostMapping("/order/create")
    public String createAnOrder(@ModelAttribute Order orderToCreate) {
        orderDao.save(orderToCreate);
        return "redirect:/show";
    }


}
