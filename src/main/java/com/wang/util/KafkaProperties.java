package com.wang.util;

public class KafkaProperties {
	public final static String zkConnect = "192.168.137.128:2181";
    public final static String groupId = "group1";
    public final static String topic = "topic1";
    final static String kafkaServerURL = "192.168.137.128";
    final static int kafkaServerPort = 9092;
    final static int kafkaProducerBufferSize = 64 * 1024;
    final static int connectionTimeOut = 20000;
    final static int reconnectInterval = 10000;
    final static String topic2 = "topic2";
    final static String topic3 = "topic3";
    final static String clientId = "SimpleConsumerDemoClient";
}
