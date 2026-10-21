package com.sanedge.paymentgateway.gateway.dto.requests.topup;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(description = "Request untuk update status topup")
public class UpdateTopupStatus {

    private String topupId;

    @NotBlank(message = "Status wajib diisi")
    private String status;
}