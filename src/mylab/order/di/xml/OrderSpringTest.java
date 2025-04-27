package mylab.order.di.xml;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderSpringTest {

    @Test
    public void testShoppingCart() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mylab-order-di.xml");
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");

        assertNotNull(shoppingCart);
        assertEquals(2, shoppingCart.getProducts().size()); // 2개 상품이 등록되어야 함
        System.out.println(shoppingCart);
    }

    @Test
    public void testOrderService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mylab-order-di.xml");
        OrderService orderService = (OrderService) context.getBean("orderService");

        assertNotNull(orderService);
        assertEquals(2000.00, orderService.calculateOrderTotal(), 0.01); // Laptop + Phone 합산
        System.out.println(orderService);
    }
}
