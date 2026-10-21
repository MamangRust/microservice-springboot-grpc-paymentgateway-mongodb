package com.sanedge.paymentgateway.gateway.dto.responses.user;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String createdAt;
    private String updatedAt;

    

}