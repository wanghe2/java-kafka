package com.wang;

import com.wang.consumer.ConsumerOne;
import com.wang.consumer.ConsumerTwo;
import com.wang.produce.KafkaProducer;
import com.wang.util.KafkaProperties;

/**
* @author leicui bourne_cui@163.com
*/
public class MainKafka
{
    public static void main(String[] args)
    {
        KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);
        producerThread.start();
        ConsumerOne consumerThread = new ConsumerOne(KafkaProperties.topic);
        consumerThread.start();
        ConsumerTwo consumerThread2 = new ConsumerTwo(KafkaProperties.topic);
        consumerThread2.start();
    }
}