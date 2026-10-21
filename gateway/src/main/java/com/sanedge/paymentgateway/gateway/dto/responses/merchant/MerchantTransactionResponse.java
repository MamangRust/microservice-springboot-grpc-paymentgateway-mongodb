package com.sanedge.paymentgateway.gateway.dto.responses.merchant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantTransactionResponse {
    private String id;
    private String cardNumber;
    private Long amount;
    private String paymentMethod;
    private String merchantId;
    private String merchantName;
    private String transactionTime;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;

    
}