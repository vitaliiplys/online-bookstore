package com.example.onlinebookstore.dto.order;

import com.example.onlinebookstore.dto.orderitem.OrderItemResponseDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;

@Data
public class OrderResponseDto {
    private Long id;
    private Long userId;
    private Set<OrderItemResponseDto> orderItems;
    private BigDecimal total;
    private LocalDateTime orderDate;
    private String status;
}
