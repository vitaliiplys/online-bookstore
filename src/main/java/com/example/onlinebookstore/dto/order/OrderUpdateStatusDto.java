package com.example.onlinebookstore.dto.order;

import com.example.onlinebookstore.model.Order;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderUpdateStatusDto {
    @NotNull
    private Order.Status status;
}
