/**
 * Copyright 2004-2048 .
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.jsf.gd.util;

import com.ipd.fastjson.parser.Feature;
import com.ipd.fastjson.serializer.SerializerFeature;

import java.nio.charset.Charset;

/**
 * Title:常量类<br>
 * <p/>
 * Description: 各种常量和枚举<br>
 * <p/>
 */
public class Constants {

    /**
     * SAF版本，内部版本
     */
    public static final int DEFAULT_SAF_VERSION = 210;

    /**
     * 当前JSF版本，例如：<br>
     * 1.2.3-SNAPSHOT对应1230<br>
     * 1.2.3正式版对应1231
     */
    public static final int JSF_VERSION = 1611;

    /**
     * 当前Build版本，每次发布修改  //FIXME
     */
    public static final String JSF_BUILD_VERSION = "1.6.1_201611031800";

    /**
     * JSF协议头的魔术位
     public static final int MAGICCODE = 0xADCF;*/

    /**
     * JSF协议头的魔术位
     */
    public static final byte[] MAGICCODEBYTE = new byte[]{(byte) 0xAD, (byte) 0xCF};

    /*---------消息类型开始-----------*/
    public static final int REQUEST_MSG = 1;

    public static final int RESPONSE_MSG = 2;

    public static final int HEARTBEAT_REQUEST_MSG = 10;//connection heartbeat message

    public static final int HEARTBEAT_RESPONSE_MSG = 11;//connection heartbeat message

    public static final int SHAKEHAND_MSG = 6;

    public static final int SHAKEHAND_RESULT_MSG = 7;

    public static final int CALLBACK_REQUEST_MSG = 4;

    public static final int CALLBACK_RESPONSE_MSG = 5;
    /*---------消息类型结束-----------*/

    /*---------环境变量开始-----------*/
    public static final Boolean isWindows = CommonUtils.isWindows();

    public static final Boolean isLinux = CommonUtils.isLinux();

    public static final int CPU_CORES = CommonUtils.getCpuCores();
    /*---------环境变量结束-----------*/

    /**--------Config配置值相关开始---------*/
    /**
     * zookeeper注册中心
     */
    public static final String REGISTRY_PROTOCOL_ZK = "jdZooKeeper";
    /**
     * xml文件注册中心
     */
    public static final String REGISTRY_PROTOCOL_FILE = "fileRegistry";
    /**
     * JSF注册中心
     */
    public static final String REGISTRY_PROTOCOL_JSF = "jsfRegistry";

    /**
     * custom注册中心
     */
    public static final String REGISTRY_PROTOCOL_CUSTOM = "customRegistry";

    /**
     * 随机
     */
    public static final String LOADBALANCE_RANDOM = "random";

    /**
     * 轮询
     */
    public static final String LOADBALANCE_ROUNDROBIN = "roundrobin";

    /**
     * 最小调用
     */
    public static final String LOADBALANCE_LEASTACTIVE = "leastactive";

    /**
     * 一致性hash
     */
    public static final String LOADBALANCE_CONSISTENTHASH = "consistenthash";

    /**
     * 本地（本机器）优先
     */
    public static final String LOADBALANCE_LOCALPREF = "localpref";

    /**
     * 失败重试
     */
    public static final String CLUSTER_FAILOVER = "failover";

    /**
     * 失败忽略，快速失败
     */
    public static final String CLUSTER_FAILFAST = "failfast";

    /**
     * 分发全部
     */
    public static final String CLUSTER_BROADCAST = "broadcast";

    /**
     * 客户端可以指定调用地址，继承于failover
     */
    public static final String CLUSTER_TRANSPORT_PINPOINT = "pinpoint";

    /**
     * 客户端可以替换transport列表，继承于failover
     */
    public static final String CLUSTER_TRANSPORT_RESETTABLE = "resettable";

    /**
     * 默认consumer连provider超时时间
     */
    public static final int DEFAULT_CLIENT_CONNECT_TIMEOUT = 5000;

    /**
     * 默认consumer断开时等待结果的超时时间
     */
    public static final int DEFAULT_CLIENT_DISCONNECT_TIMEOUT = 10000;

    /**
     * 默认consumer调用provider超时时间
     */
    public static final int DEFAULT_CLIENT_INVOKE_TIMEOUT = 5000;

    /**
     * 默认连注册中心的超时时间
     */
    public static final int DEFAULT_REGISTRY_CONNECT_TIMEOUT = 20000;

    /**
     * 默认失败重试次数
     */
    public static final int DEFAULT_RETRIES_TIME = 0;

    /**
     * 线程池类型：固定线程池
     */
    public final static String THREADPOOL_TYPE_FIXED = "fixed";

    /**
     * 线程池类型：伸缩线程池
     */
    public final static String THREADPOOL_TYPE_CACHED = "cached";

    /**
     * 事件分发类型：all 所有消息都派发到业务线程池，包括请求，响应，连接事件，断开事件，心跳等。
     */
    public final static String DISPATCHER_ALL = "all";

    /**
     * 事件分发类型：direct 所有消息都不派发到线程池，全部在IO线程上直接执行。
     */
    public final static String DISPATCHER_DIRECT = "direct";

    /**
     * 事件分发类型：message 只有请求响应消息派发到线程池，其它连接断开事件，心跳等消息，直接在IO线程上执行。
     */
    public final static String DISPATCHER_MESSAGE = "message";

    /**
     * 事件分发类型：execution 只请求消息派发到线程池，不含响应，响应和其它连接断开事件，心跳等消息，直接在IO线程上执行。
     */
    public final static String DISPATCHER_EXECUTION = "execution";

    /**
     * 事件分发类型：connection 在IO线程上，将连接断开事件放入队列，有序逐个执行，其它消息派发到线程池。
     */
    public final static String DISPATCHER_CONNECTION = "connection";

    /**
     * 队列类型：普通队列
     */
    public final static String QUEUE_TYPE_NORMAL = "normal";

    /**
     * 队列类型：优先级队列
     */
    public final static String QUEUE_TYPE_PRIORITY = "priority";

    /**
     * 默认io线程池大小
     */
    public final static int DEFAULT_IO_THREADS = CPU_CORES + 1;

    /**
     * 默认服务端业务线程池大小
     */
    public final static int DEFAULT_SERVER_BIZ_THREADS = 200;

    /**
     * 默认服务端业务线程池队列大小
     */
    public final static int DEFAULT_SERVER_QUEUE = 0;

    /**
     * 默认权重 100
     */
    public final static int DEFAULT_PROVIDER_WEIGHT = 100;

    /**
     * 默认客户端线程池大小
     */
    public final static int DEFAULT_CLIENT_BIZ_THREADS = 20;

    /**
     * 默认客户端异步返回调用线程池大小
     */
    public final static int DEFAULT_CLIENT_CALLBACK_CORE_THREADS = 20;

    /**
     * 默认客户端异步返回调用线程池大小
     */
    public final static int DEFAULT_CLIENT_CALLBACK_MAX_THREADS = 200;

    /**
     * 默认客户端异步返回调用线程池队列大小
     */
    public final static int DEFAULT_CLIENT_CALLBACK_QUEUE = 256;

    /**
     * 默认协议类型:jsf
     */
    public final static ProtocolType DEFAULT_PROTOCOL_TYPE = ProtocolType.jsf;

    /**
     * 默认协议:jsf
     */
    public final static String DEFAULT_PROTOCOL = "jsf";

    /**
     * 默认序列话:msgpack
     */
    public final static CodecType DEFAULT_CODEC_TYPE = CodecType.msgpack;

    /**
     * 默认序列话:msgpack
     */
    public final static String DEFAULT_CODEC = "msgpack";

    /**
     * 代理类型：jdk
     */
    public final static String PROXY_JDK = "jdk";

    /**
     * 代理类型：javassist
     */
    public final static String PROXY_JAVASSIST = "javassist";

    /**
     * 默认字符集 utf-8
     */
    public final static Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    /**
     * 默认启动端口，包括不配置或者随机，都从此端口开始计算
     */
    public static final int DEFAULT_SERVER_PORT = 22000;

    /**
     * 默认发布路径 "/"
     */
    public static final String DEFAULT_SERVER_CONTEXT_PATH = "/";

    /**
     * 默认方法优先级为0
     */
    public static final int DEFAULT_METHOD_PRIORITY = 0;

    /**
     * 默认服务启动延迟
     */
    public static final int DEFAULT_PROVIDER_DELAY = -1;

    /**
     * 默认服务端 数据包限制
     */
    public final static int DEFAULT_PAYLOAD = 8 * 1024 * 1024;
    /**
     * 默认IO的buffer大小
     */
    public final static int DEFAULT_BUFFER_SIZE = 8 * 1024;
    /**
     * 最大IO的buffer大小
     */
    public final static int MAX_BUFFER_SIZE = 32 * 1024;
    /**
     * 最小IO的buffer大小
     */
    public final static int MIN_BUFFER_SIZE = 1 * 1024;

    /**
     * Consumer给Provider发心跳的间隔
     */
    public final static int DEFAULT_HEARTBEAT_TIME = 30000;

    /**
     * Consumer给Provider重连的间隔
     */
    public final static int DEFAULT_RECONNECT_TIME = 10000;

    /**--------Config配置值相关结束---------*/


    /**--------客户端相关开始---------*/
    /**
     * 客户端channelhandler名字
     */
    public static final String CLIENT_CHANNELHANDLE_NAME = "JSF_CLIENT_CHANNELHANDLE";

    /**--------客户端相关结束---------*/


    /**--------上下文KEY相关开始---------*/
    /**
     * 内部使用的key前缀，防止和自定义key冲突
     */
    public static final char INTERNAL_KEY_PREFIX = '_';
    /**
     * 内部使用的key：远程地址
     */
    public static final String INTERNAL_KEY_REMOTE = INTERNAL_KEY_PREFIX + "remote";
    /**
     * 内部使用的key：本地地址
     */
    public static final String INTERNAL_KEY_LOCAL = INTERNAL_KEY_PREFIX + "local";
    /**
     * 内部使用的key：耗时
     */
    public static final String INTERNAL_KEY_ELAPSED = INTERNAL_KEY_PREFIX + "elapsed";
    /**
     * 内部使用的key：结果
     */
    public static final String INTERNAL_KEY_RESULT = INTERNAL_KEY_PREFIX + "result";
    /**
     * 内部使用的key：已接受数据大小
     */
    public static final String INTERNAL_KEY_INPUT = INTERNAL_KEY_PREFIX + "input";
    /**
     * 内部使用的key：已发送数据大小
     */
    public static final String INTERNAL_KEY_OUTPUT = INTERNAL_KEY_PREFIX + "output";
    /**
     * 内部使用的key：监控是否开启，为true开启
     */
    public static final String INTERNAL_KEY_MONITOR = INTERNAL_KEY_PREFIX + "monitor";
    /**
     * 内部使用的key：接口
     */
    public static final String INTERNAL_KEY_INTERRFACE = INTERNAL_KEY_PREFIX + "interface";
    /**
     * 内部使用的key：alias
     */
    public static final String INTERNAL_KEY_ALIAS = INTERNAL_KEY_PREFIX + "alias";
    /**
     * 内部使用的key：返回值
     */
    public static final String INTERNAL_KEY_ONRETURN = INTERNAL_KEY_PREFIX + "onreturn";
    /**
     * 内部使用的key：调用协议
     */
    public static final String INTERNAL_KEY_PROTOCOL = INTERNAL_KEY_PREFIX + "protocol";
    /**
     * 内部使用的key：自动部署appId
     */
    public static final String INTERNAL_KEY_APPID = INTERNAL_KEY_PREFIX + "appId";
    /**
     * 内部使用的key：自动部署appName
     */
    public static final String INTERNAL_KEY_APPNAME = INTERNAL_KEY_PREFIX + "appName";
    /**
     * 内部使用的key：自动部署实例Id
     */
    public static final String INTERNAL_KEY_APPINSID = INTERNAL_KEY_PREFIX + "appInsId";
    /**
     * 内部使用的key：是否异步调用
     */
    public static final String INTERNAL_KEY_ASYNC = INTERNAL_KEY_PREFIX + "async";
    /**
     * 内部使用的key：请求是否keep-alive
     *
     * @since 1.6.0
     */
    public static final String INTERNAL_KEY_KEEPALIVE = INTERNAL_KEY_PREFIX + "keepAlive";

    /**
     * 隐藏的key前缀，隐藏的key只能在filter里拿到，在RpcContext里拿不到，不过可以设置
     */
    public static final char HIDE_KEY_PREFIX = '.';
    /**
     * 隐藏属性的key：token
     */
    public static final String HIDDEN_KEY_TOKEN = HIDE_KEY_PREFIX + "token";
    /**
     * 隐藏属性的key：monitor是否开启
     */
    public static final String HIDDEN_KEY_MONITOR = HIDE_KEY_PREFIX + "monitor";
    /**
     * 隐藏属性的key：指定远程调用地址
     */
    public static final String HIDDEN_KEY_PINPOINT = HIDE_KEY_PREFIX + "pinpoint";
    /**
     * 隐藏属性的key：consumer发布是否警告检查
     */
    public static final String HIDDEN_KEY_WARNNING = HIDE_KEY_PREFIX + "warnning";
    /**
     * 隐藏属性的key：consumer是否自动销毁（例如Registry和Monitor不需要自动销毁）
     */
    public static final String HIDDEN_KEY_DESTROY = HIDE_KEY_PREFIX + "destroy";
    /**
     * 隐藏属性的key：自动部署appId
     */
    public static final String HIDDEN_KEY_APPID = HIDE_KEY_PREFIX + "appId";
    /**
     * 隐藏属性的key：自动部署appName
     */
    public static final String HIDDEN_KEY_APPNAME = HIDE_KEY_PREFIX + "appName";
    /**
     * 隐藏属性的key：自动部署实例Id
     */
    public static final String HIDDEN_KEY_APPINSID = HIDE_KEY_PREFIX + "appInsId";
    /**
     * 隐藏属性的key：session
     */
    public static final String HIDDEN_KEY_SESSION = HIDE_KEY_PREFIX + "session";
	/**
     * 隐藏属性的key：目标机房信息
     */
    public static final String HIDDEN_KEY_DST_PARAM = HIDE_KEY_PREFIX + "dstParam";
    /**
     * 隐藏属性的key：对端的JSF版本
     */
    public static final String HIDDEN_KEY_DST_JSF_VERSION = HIDE_KEY_PREFIX + "dstJsfVer";
    /**
     * 隐藏属性的key：对端的语言
     */
    public static final String HIDDEN_KEY_DST_LANGUAGE = HIDE_KEY_PREFIX + "dstLan";

    /**--------上下文KEY相关结束---------*/

    /**--------配置项相关开始---------*/
    /**
     * 配置key:generic
     */
    public static final String CONFIG_KEY_GENERIC = "generic";
    /**
     * 配置key:async
     */
    public static final String CONFIG_KEY_ASYNC = "async";
    /**
     * 配置key:retries
     */
    public static final String CONFIG_KEY_RETRIES = "retries";

    /**
     * 配置key:timeout
     */
    public static final String CONFIG_KEY_TIMEOUT = "timeout";

    /**
     * 配置key:concurrents
     */
    public static final String CONFIG_KEY_CONCURRENTS = "concurrents";

    /**
     * 配置key:params
     */
    public static final String CONFIG_KEY_PARAMS = "parameters";

    /**
     * 配置key:onreturn
     */
    public static final String CONFIG_KEY_ONRETURN = "onreturn";

    /**
     * 配置key:weight
     */
    public static final String CONFIG_KEY_WEIGHT = "weight";

    /**
     * 配置key:safVersion
     */
    public static final String CONFIG_KEY_SAFVERSION = "safVersion";

    /**
     * 配置key:interface | interfaceId
     */
    public static final String CONFIG_KEY_INTERFACE = "interface";

    /**
     * 配置key:alias
     */
    public static final String CONFIG_KEY_ALIAS = "alias";

    /**
     * 配置key:dynamic
     */
    public static final String CONFIG_KEY_DYNAMIC = "dynamic";

    /**
     * 配置key:validation
     */
    public static final String CONFIG_KEY_VALIDATION = "validation";

    /**
     * 配置key:mock
     */
    public static final String CONFIG_KEY_MOCK = "mock";

    /**
     * 配置key:cache
     */
    public static final String CONFIG_KEY_CACHE = "cache";

    /**
     * 配置key:compress
     */
    public static final String CONFIG_KEY_COMPRESS = "compress";

    /**
     * 配置key:priority
     */
    public static final String CONFIG_KEY_PRIORITY = "priority";

    /**
     * 配置key:jsfVersion
     */
    public static final String CONFIG_KEY_JSFVERSION = "jsfVersion";

    /**
     * 配置key:crosslang 是否支持跨语言
     */
    public static final String CONFIG_KEY_CROSSLANG = "crossLang";

    /**
     * 配置key:serialization
     */
    public static final String CONFIG_KEY_SERIALIZATION = "serialization";

    /**--------配置项相关结束---------*/


    /**--------系统参数相关开始---------*/
    /**
     * 全局配置的key
     */
    public static final String GLOBAL_SETTING = "global_setting";
    /**
     * 全局设置：全局注册中心心跳间隔
     */
    public static final String SETTING_REGISTRY_HEARTBEAT_INTERVAL = "reg.hb.interval";
    /**
     * 全局设置：全局注册中心检测间隔
     */
    public static final String SETTING_REGISTRY_CHECK_INTERVAL = "reg.ck.interval";
    /**
     * 全局设置：全局服务列表备份文件地址
     */
    public static final String SETTING_REGISTRY_BACKUP_DIR = "reg.bk.dir";
    /**
     * 全局设置：全局监控发送间隔
     */
    public static final String SETTING_MONITOR_SEND_INTERVAL = "mntr.send.interval";
    /**
     * 全局设置：全局监控是否开启
     */
    public static final String SETTING_MONITOR_GLOBAL_OPEN = "mntr.send.open";

    /**
     * 全局设置：全局高级操作密码
     */
    public static final String SETTING_SERVER_SUDO_PASSWD = "srv.sudo.passwd";

    /**
     * 全局设置：全局高级操作的白名单
     */
    public static final String SETTING_SERVER_SUDO_WHITELIST = "srv.sudo.whitelist";

    /**
     * 全局设置：全局是否开启压缩
     */
    public static final String SETTING_INVOKE_CP_OPEN = "invoke.compress.open";

    /**
     * 全局设置：全局压缩启动的大小（大于此值才启动压缩）
     */
    public static final String SETTING_INVOKE_CP_SIZE = "invoke.compress.size";

    /**
     * 接口级设置：监控是否开启
     */
    public static final String SETTING_MONITOR_OPEN = "mntr.p.open";
    //public static final String SETTING_MONITOR_CONSUMER_OPEN = "g.mntr.c.o";
    /**
     * 接口级设置：监控白名单
     */
    public static final String SETTING_MONITOR_WHITELIST = "mntr.whitelist";
    /**
     * 接口级设置：监控耗时分布（客户端）单位毫秒，逗号隔开
     */
    public static final String SETTING_MONITOR_ELASPED_METRIC = "mntr.elasped.metric";
    /**
     * 接口级设置：监控切分间隔，单位分钟
     */
    public static final String SETTING_MONITOR_SLICE_INTERVAL = "mntr.slice.interval";
    /**
     * 接口级设置：远程调用的token
     */
    public static final String SETTING_INVOKE_TOKEN = "invoke.token";
    /**
     * 接口级设置：是否开启黑白名单
     */
    public static final String SETTING_INVOKE_WB_OPEN = "invoke.wb.open";
    /**
     * 接口级设置：调用白名单
     */
    public static final String SETTING_INVOKE_WHITELIST = "invoke.whitelist";
    /**
     * 接口级设置：调用黑名单
     */
    public static final String SETTING_INVOKE_BLACKLIST = "invoke.blacklist";
    /**
     * 接口级设置：模拟的调用返回结果
     */
    public static final String SETTING_INVOKE_MOCKRESULT = "invoke.mockresult";
    /**
     * 接口级设置：app限流
     */
    public static final String SETTING_INVOKE_APPLIMIT = "invoke.applimit";

    /**
     * 接口级设置:provider端限流
     *
     * @since 1.6.0
     */
    public static final String SETTING_INVOKE_PROVIDER_LIMIT = "invoke.provider.limit";
    /**
     * 接口级设置：路由是否开启
     */
    public static final String SETTING_ROUTER_OPEN = "router.open";
    /**
     * 接口级设置：路由规则
     */
    public static final String SETTING_ROUTER_RULE = "router.rule";
    /**
     * 接口级设置: 分组路由（参数和分组的映射关系）
     *
     * @since 1.6.0
     */
    public static final String SETTING_MAP_PARAM_ALIAS = "map.param.alias";
    /**
     * 接口级设置：Provider侧的的数据发送，是否开启批量提交功能（RingBuffer）
     */
    public static final String SETTING_TRANSPORT_PROVIDER_BATCH = "transport.provider.ringbuffer";
    /**
     * 接口级设置：Consumer侧的数据发送，是否开启批量提交功能（RingBuffer）
     */
    public static final String SETTING_TRANSPORT_CONSUMER_BATCH = "transport.consumer.ringbuffer";

    /**
     * 自定义设置：callback的线程池初始大小
     */
    public static final String SETTING_CALLBACK_POOL_CORE_SIZE = "callback.pool.coresize";
    /**
     * 自定义设置：callback的线程池最大大小
     */
    public static final String SETTING_CALLBACK_POOL_MAX_SIZE = "callback.pool.maxsize";
    /**
     * 自定义设置：callback的线程池队列
     */
    public static final String SETTING_CALLBACK_POOL_QUEUE = "callback.pool.queue";
    /**
     * 自定义设置：序列化是否检测Object的类型（父子类检查）
     */
    public static final String SETTING_SERIALIZE_CHECK_CLASS = "serialize.check.class";
    /**
     * 自定义设置：客户端是否使用epoll（针对linux）
     */
    public static final String SETTING_TRANSPORT_CONSUMER_EPOLL = "transport.consumer.epoll";
    /**
     * 自定义设置：检查系统时间（针对linux）
     */
    public static final String SETTING_CHECK_SYSTEM_TIME = "check.system.time";
    /**
     * 自定义设置：监控服务直连（仅供测试）
     */
    public static final String SETTING_MONITOR_SEND_URL = "monitor.send.url";
    /**
     * 自定义设置：json序列化是否填充值为null，返回值为null的属性
     * @deprecated Use Constants#SETTING_JSON_SERIALIZER_FEATURES
     */
    @Deprecated
    public static final String SETTING_JSON_SERIALIZE_FILL_EMPTY = "json.serialize.fill.empty";
    /**
     * 自定义设置：json序列化的时候，开启的特性
     *
     * @see SerializerFeature
     * @since 1.6.0
     */
    public static final String SETTING_JSON_SERIALIZER_FEATURES = "json.serializer.features";
    /**
     * 自定义设置：json解析的时候，开启的特性
     *
     * @see Feature
     * @since 1.6.0
     */
    public static final String SETTING_JSON_PARSER_FEATURES = "json.parser.features";
    /**
     * 自定义设置: 是否忽略Consumer变化时最终的删除命令，默认false
     *
     * @since 1.6.0
     */
    public static final String SETTING_CONSUMER_PROVIDER_NULLABLE = "consumer.provider.nullable";
    /**
     * 自定义设置: 调用时是否传送app信息，默认true
     *
     * @since 1.6.0
     */
    public static final String SETTING_INVOKE_SEND_APP = "invoke.send.app";
    /**
     * 自定义设置: 是否开启批量注册, 默认true
     *
     * @since 1.6.0
     */
    public static final String SETTING_REGISTRY_REGISTER_BATCH = "registry.register.batch";
    /**
     * 自定义设置：序列化是否检测循环引用类型
     *
     * @since 1.6.0
     */
    public static final String SETTING_SERIALIZE_CHECK_REFERENCE = "serialize.check.reference";
    /**
     * 自定义设置：Server是否开启http的keepAlive特性
     *
     * @since 1.6.0
     */
    public static final String SETTING_HTTP_KEEP_ALIVE = "http.keepAlive";

    /**--------系统参数相关结束---------*/

    /**
     * 服务协议
     */
    public enum ProtocolType {

        consumer(0),
        @Deprecated saf(1),
        jsf(1),
        rest(2),
        dubbo(3),
        webservice(4),
        jaxws(5),
        @Deprecated jaxrs(6),
        @Deprecated hessian(7),
        @Deprecated thrift(8),
        http(9);

        private int value;

        private ProtocolType(int mvalue) {
            this.value = mvalue;
        }

        public int value() {
            return value;
        }

        public static ProtocolType valueOf(int value) {
            ProtocolType p;
            switch (value) {
                case 1:
                    p = jsf;
                    break;
                case 2:
                    p = rest;
                    break;
                case 9:
                    p = http;
                    break;
                case 3:
                    p = dubbo;
                    break;
                case 4:
                    p = webservice;
                    break;
                case 5:
                    p = jaxws;
                    break;
                case 6:
                    p = jaxrs;
                    break;
                case 7:
                    p = hessian;
                    break;
                case 8:
                    p = thrift;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown protocol type value: " + value);
            }
            return p;
        }
    }

    /**
     * 序列化方式类型,兼容1.x版本
     */
    public enum CodecType {

        @Deprecated dubbo(1),
        hessian(2),
        java(3),
        @Deprecated compactedjava(4),
        json(5),
        @Deprecated fastjson(6),
        @Deprecated nativejava(7),
        @Deprecated kryo(8),
        msgpack(10),
        @Deprecated nativemsgpack(11),
        protobuf(12);

        private int value;

        private CodecType(int mvalue) {
            this.value = mvalue;
        }

        public int value() {
            return value;
        }

        public static CodecType valueOf(int value) {
            CodecType p;
            switch (value) {
                case 10:
                    p = msgpack;
                    break;
                case 2:
                    p = hessian;
                    break;
                case 3:
                    p = java;
                    break;
                case 12:
                    p = protobuf;
                    break;
                case 5:
                    p = json;
                    break;
                case 1:
                    p = dubbo;
                    break;
                case 11:
                    p = nativemsgpack;
                    break;
                case 4:
                    p = compactedjava;
                    break;
                case 6:
                    p = fastjson;
                    break;
                case 7:
                    p = nativejava;
                    break;
                case 8:
                    p = kryo;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown codec type value: " + value);
            }
            return p;
        }
    }

    /**
     * enum for head key number
     */
    public enum HeadKey {

        timeout((byte) 1, Integer.class), // 请求超时时间
        //interfaceId((byte) 2, String.class),
        //alias((byte) 3, String.class),
        //methodName((byte) 4, String.class),
        callbackInsId((byte) 5, String.class), // 回调函数对应的实例id
        //compress((byte) 6, String.class),
        jsfVersion((byte) 7, Short.class), // 客户端的JSF版本
        srcLanguage((byte) 8, Byte.class), // 请求的语言（针对跨语言 1c++ 2lua）
        responseCode((byte) 9, Byte.class), // 返回结果（针对跨语言 0成功 1失败）
        ;

        private byte keyNum;
        private Class type;


        private HeadKey(byte b, Class clazz) {
            this.keyNum = b;
            this.type = clazz;
        }

        public byte getNum() {
            return this.keyNum;
        }

        public Class getType() {
            return this.type;
        }

        public static HeadKey getKey(byte num) {
            HeadKey key = null;
            switch (num) {
                case 1:
                    key = timeout;
                    break;
                /*case 2:
                    key = interfaceId;
                    break;
                case 3:
                    key = alias;
                    break;
                case 4:
                    key = methodName;
                    break;*/
                case 5:
                    key = callbackInsId;
                    break;
                /*case 6:
                    key = compress;
                    break;*/
                case 7:
                    key = jsfVersion;
                    break;
                case 8:
                    key = srcLanguage;
                    break;
                case 9:
                    key = responseCode;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown head key value: " + num);
            }
            return key;

        }

    }

    /**
     * 压缩算法类型
     */
    public enum CompressType {

        NONE((byte) 0), snappy((byte) 1);//, lzo((byte)2), zlib((byte)3), gzip((byte)4);

        private byte value;

        private CompressType(byte mvalue) {
            this.value = mvalue;
        }

        public byte value() {
            return value;
        }

        public static CompressType valueOf(byte value) {
            CompressType p;
            switch (value) {
                case 0:
                    p = NONE;
                    break;
                case 1:
                    p = snappy;
                    break;
                /*case 2:
                    p = lzo;
                    break;
                case 3:
                    p = zlib;
                    break;
                case 4:
                    p = gzip;
                    break;*/
                default:
                    throw new IllegalArgumentException(
                            "Unknown compress type value: " + value);
            }
            return p;
        }
    }
}