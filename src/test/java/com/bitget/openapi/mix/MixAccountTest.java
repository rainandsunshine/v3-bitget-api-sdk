package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.request.mix.*;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.mix.MixHoldModeEnum;
import com.bitget.openapi.enums.mix.MixHoldSideEnum;
import com.bitget.openapi.enums.mix.MixMarginModeEnum;
import com.bitget.openapi.enums.mix.MixProductTypeEnum;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;

public class MixAccountTest extends BaseTest {

    private static String symbol = "BTCUSDT_UMCBL";
    private static String marginCoin = "USDT";
    // passed
    @Test
    public void account() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().account().getAccount(symbol, marginCoin);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void accounts() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().account().getAccounts(MixProductTypeEnum.UMCBL.getCode());
        System.out.println(JSON.toJSONString(result));
    }

    // passed
    @Test
    public void leverage() throws IOException {
        MixChangeLeverageReq build = MixChangeLeverageReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .leverage(25)
                .holdSide(MixHoldSideEnum.LONG.getCode())
                .build();
        ResponseResult res = bitgetRestClient.mix().bitget().account().leverage(build);
        System.out.println(JSON.toJSONString(res));
    }

    // passed
    @Test
    public void margin() throws IOException {
        MixAdjustMarginFixReq build = MixAdjustMarginFixReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .holdSide(MixHoldSideEnum.LONG.getCode())
                .amount(new BigDecimal("10"))
                .build();
        ResponseResult res = bitgetRestClient.mix().bitget().account().margin(build);
        System.out.println(JSON.toJSONString(res));
    }


    // passed
    @Test
    public void marginMode() throws IOException {
        AdjustMarginModeReq build = AdjustMarginModeReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .marginMode(MixMarginModeEnum.FIXED.getCode())
                .build();
        ResponseResult res = bitgetRestClient.mix().bitget().account().marginMode(build);
        System.out.println(JSON.toJSONString(res));
    }
    // passed
    @Test
    public void positionMode() throws IOException {
        AdjustHoldModeReq build = AdjustHoldModeReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .holdMode(MixHoldModeEnum.DOUBLE_HOLD.getCode())
                .build();
        ResponseResult res = bitgetRestClient.mix().bitget().account().positionMode(build);
        System.out.println(JSON.toJSONString(res));
    }

    //passed
    @Test
    public void openCount() throws IOException {
        MixOpenCountReq build = MixOpenCountReq.builder()
                .symbol(symbol)
                .marginCoin(marginCoin)
                .openPrice(new BigDecimal("30000"))
                .openAmount(new BigDecimal("99999"))
                .leverage(20)
                .build();
        ResponseResult result = bitgetRestClient.mix().bitget().account().openCount(build);
        System.out.println(JSON.toJSONString(result));
    }


}
