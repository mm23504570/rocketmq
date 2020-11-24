package org.apache.rocketmq.common.protocol.header;

import org.apache.rocketmq.remoting.CommandCustomHeader;
import org.apache.rocketmq.remoting.annotation.CFNotNull;
import org.apache.rocketmq.remoting.exception.RemotingCommandException;

public class QuerySlaveFallBehindMasterResponseHeader  implements CommandCustomHeader {

    @CFNotNull
    private Long slaveFallBehindMaster;
    @Override
    public void checkFields() throws RemotingCommandException {

    }

    public Long getSlaveFallBehindMaster() {
        return slaveFallBehindMaster;
    }

    public void setSlaveFallBehindMaster(Long slaveFallBehindMaster) {
        this.slaveFallBehindMaster = slaveFallBehindMaster;
    }
}
