package com.bitget.openapi.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixQueryPlanEnum {

    PLAN( "plan"),
    PROFIT_LOSS( "profit_loss"),
    ;

    private final String value;

}
