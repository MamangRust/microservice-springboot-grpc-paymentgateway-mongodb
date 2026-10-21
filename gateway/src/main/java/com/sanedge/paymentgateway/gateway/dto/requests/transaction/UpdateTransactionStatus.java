package com.sanedge.paymentgateway.gateway.dto.requests.transaction;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateTransactionStatus {

    private String transactionId;

    @NotBlank(message = "Status wajib diisi")
    private String status;
}