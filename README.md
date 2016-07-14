# openresty_lua_thrift

thrift_lua_ngx_test：java服务端

开启java：nuhup java -cp thrift_lua_ngx_test-1.0-SNAPSHOT-jar-with-dependencies.jar com.test.thrift.rpc.Server &

1，下载安装openresty

download https://openresty.org/download/openresty-x.y.z.a.tar.gz .
install openresty.

2，lualib里所有的内容直接放到openresty下的lualib中

3，把so文件放到系统里

cp lualib/*.so /usr/local/lib/
ldconfig

4，nginx配置文件添加配置

location = /lua_thrift{
            add_header 'Content-Type' 'text/html';
            content_by_lua '
                local cln = require "test.test_cln"
                ngx.say(cln.demoFunc());
            ';
}


To access web url http://127.0.0.1:8000/lua_thrift and get result.

1.111111
2.5555555