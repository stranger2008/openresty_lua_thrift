package com.test.thrift.rpc;

import com.test.thrift.TestService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.*;

/**
 * Created by lilianglin on 2016/7/12.
 */
public class Client {

    public static final String SERVER_IP = "localhost";
    public static final int SERVER_PORT = 8090;
    public static final int TIMEOUT = 30000;

    /**
     *
     * @param userName
     */
    public void startClient(String userName) {
        TTransport transport = null;
        try {
            transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
            // 协议要和服务端一致
            //TProtocol protocol = new TBinaryProtocol(transport);
            // TProtocol protocol = new TCompactProtocol(transport);
            TProtocol protocol = new TJSONProtocol(transport);
            RpcService.Client client = new RpcService.Client(
                    protocol);
            transport.open();


            ArgStruct argStruct = new ArgStruct();
            argStruct.setArgByte((byte)1);
            argStruct.setArgString("11111");
            argStruct.setArgI16((short)11);
            argStruct.setArgI32(11);
            argStruct.setArgI64(11L);
            argStruct.setArgDouble(11D);
            argStruct.setArgBool(true);
            Map<String,String> map = new HashMap<String,String>();
            map.put("111","111");

            Map<Integer,String> map1 = new HashMap<Integer,String>();
            map1.put(11,"111");

            Set<String> set = new HashSet<String>();
            set.add("111");

            Set<Long> set1 = new HashSet<Long>();
            set1.add(11L);

            List<String> list11 = new ArrayList<String>();
            list11.add("111");

            List<String> result = client.funCall(argStruct, (byte) 1, (short) 11, 11, 11L, 11D, "111", map, map1, set, set1, list11, true);
            System.out.println("Thrify client result =: " + result);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.startClient("Michael");

    }

}
