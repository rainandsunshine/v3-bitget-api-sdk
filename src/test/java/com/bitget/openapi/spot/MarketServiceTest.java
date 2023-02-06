package com.bitget.openapi.spot;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.BaseTest;
import com.bitget.openapi.dto.response.ResponseResult;
import com.bitget.openapi.enums.SpotDepthTypeEnum;
import org.junit.Test;
import java.io.IOException;

public class MarketServiceTest extends BaseTest {

    static String symbol = "btcusdt_spbl";

    static Integer limit = 50;

    static String period = "1min";

    static String after = "1624929806000";

    static String before = "1624933406000";

    //passed
    @Test
    public void fills() throws IOException {
        ResponseResult fills = bitgetRestClient.spot().bitget().market().fills(symbol, limit);
        System.out.println(JSON.toJSONString(fills));
    }

    //passed
    @Test
    public void depth() throws IOException {
        ResponseResult depth = bitgetRestClient.spot().bitget().market().depth(symbol, limit, SpotDepthTypeEnum.STEP0.getCode());
        System.out.println(JSON.toJSONString(depth));
    }

    //passed
    @Test
    public void ticker() throws IOException {
        ResponseResult ticker = bitgetRestClient.spot().bitget().market().ticker(symbol);
        System.out.println(JSON.toJSONString(ticker));
    }

    //passed
    @Test
    public void tickers() throws IOException {
        ResponseResult tickers = bitgetRestClient.spot().bitget().market().tickers();
        System.out.println(JSON.toJSONString(tickers));
    }

    //passed
    @Test
    public void candles() throws IOException {
        ResponseResult candles = bitgetRestClient.spot().bitget().market().candles(symbol, period, after, before, limit);
        System.out.println(JSON.toJSONString(candles));
    }

}
