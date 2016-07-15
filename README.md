# openresty_lua_thrift

thrift_lua_ngx_test：java Server端

启动Server端：nuhup java -cp thrift_lua_ngx_test-1.0-SNAPSHOT-jar-with-dependencies.jar com.test.thrift.rpc.Server &


1，下载安装openresty

2，lualib里所有的内容直接放到openresty下的lualib中

libthrift：官网提供的lua包

test：根据命令 thrift --gen lua rpc.thrift 生成的代码

lib*.so：libthrift/c/目录下编译后的so文件

3，把so文件放到系统里

```
cp lualib/*.so /usr/local/lib/
ldconfig
```

4，nginx配置文件添加配置

```
location = /lua_thrift{
            add_header 'Content-Type' 'text/html';
            content_by_lua '
                local cln = require "test.test_cln"
                ngx.say(cln.demoFunc());
            ';
}
```


5，访问 http://127.0.0.1:8090/lua_thrift 返回如下结果

```
1.111111
2.5555555
```