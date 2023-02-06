package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.mix.*;
import com.bitget.openapi.service.mix.impl.*;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: mix api facade
 */
public class MixApiFacade {

    private final ApiClient apiClient;

    public MixApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     *
     * @return SpotEndpoint
     */
    public MixApiFacade.MixEndpoint bitget() {
        return new MixApiFacade.MixEndpoint(apiClient);
    }

    public static class MixEndpoint {
        private final ApiClient apiClient;

        MixEndpoint(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        /**
         * market service
         * @return
         */
        public MixMarketService market() {
            return new MixMarketServiceImpl(apiClient);
        }
        /**
         * account service
         */
        public MixAccountService account() {
            return new MixAccountServiceImpl(apiClient);
        }
        /**
         * position service
         * @return
         */
        public MixPositionService position() {
            return new MixPositionServiceImpl(apiClient);
        }
        /**
         * order service
         * @return
         */
        public MixOrderService order() {
            return new MixOrderServiceImpl(apiClient);
        }
        /**
         * plan service
         * @return
         */
        public MixPlanService plan(){ return new MixPlanServiceImpl(apiClient); };
        /**
         * trace service
         * @return
         */
        public MixTraceService trace(){ return new MixTraceServiceImpl(apiClient); };




    }
}
