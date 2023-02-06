package com.bitget.openapi.dto.request.spot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpotTransferReq implements Serializable {

    private String fromType;

    private String toType;

    private String amount;

    private String coin;

    private String clientOid;
}
