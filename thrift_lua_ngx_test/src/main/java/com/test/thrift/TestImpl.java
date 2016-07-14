package com.test.thrift;

import org.apache.thrift.TException;

/**
 * Created by lilianglin on 2016/7/11.
 */
public class TestImpl implements TestService.Iface {

    @Override
    public String say(String request) throws TException {
        System.out.println(request + " one request come");
        return "Hi " + request + " welcome to my blog www.micmiu.com";
    }

}
