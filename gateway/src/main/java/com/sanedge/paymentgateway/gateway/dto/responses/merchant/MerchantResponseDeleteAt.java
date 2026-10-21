package com.sanedge.paymentgateway.gateway.dto.responses.merchant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantResponseDeleteAt {
    private String id;
    private String name;
    private String userId;
    private String apiKey;
    private String status;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;

    
}