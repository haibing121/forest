package com.zhizus.forest.client.cluster.ha;

import com.zhizus.forest.client.cluster.lb.AbstractLoadBalance;
import com.zhizus.forest.common.ServerInfo;
import com.zhizus.forest.common.codec.Message;
import com.zhizus.forest.transport.NettyClient;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

/**
 * Created by Dempe on 2016/12/7.
 */
public class FailoverStrategy extends AbstractHAStrategy {

    public FailoverStrategy(GenericKeyedObjectPoolConfig config) {
        super(config);
    }

    @Override
    public Object call(Message message, AbstractLoadBalance<ServerInfo<NettyClient>> loadBalance) throws Exception {
        return null;
    }
}
