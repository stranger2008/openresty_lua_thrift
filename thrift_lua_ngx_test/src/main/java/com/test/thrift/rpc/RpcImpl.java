package com.test.thrift.rpc;

import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lilianglin on 2016/7/12.
 */
public class RpcImpl implements RpcService.Iface {
    @Override
    public List<String> funCall(ArgStruct argStruct, byte argByte, short argI16, int argI32, long argI64, double argDouble, String argString, Map<String, String> paramMapStrStr, Map<Integer, String> paramMapI32Str, Set<String> paramSetStr, Set<Long> paramSetI64, List<String> paramListStr, boolean argBool) throws TException {
        List<String> list = new ArrayList<String>();
        list.add("111111");
        list.add("5555555");
        return list;
    }
}
