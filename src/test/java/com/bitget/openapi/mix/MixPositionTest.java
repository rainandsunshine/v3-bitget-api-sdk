package com.bitget.openapi.mix;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.mix.MixProductTypeEnum;
import org.junit.Test;
import java.io.IOException;

public class MixPositionTest extends BaseTest {

    private static String symbol = "BTCUSDT_UMCBL";
    private static String marginCoin = "USDT";

    // passed
    @Test
    public void singlePosition() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().position().singlePosition(symbol, marginCoin);
        System.out.println(JSON.toJSONString(result));
    }
    // passed
    @Test
    public void allPosition() throws IOException {
        ResponseResult result = bitgetRestClient.mix().bitget().position().allPosition(MixProductTypeEnum.UMCBL.getCode(), marginCoin);
        System.out.println(JSON.toJSONString(result));
    }
}
