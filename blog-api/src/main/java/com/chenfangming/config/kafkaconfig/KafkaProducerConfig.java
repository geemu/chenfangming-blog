package com.chenfangming.config.kafkaconfig;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Geemu
 * Email: cfmmail@sina.com
 * Date: 2018/1/4  10:49
 * Description: Kafka 生产者配置
 */
@Configuration
@EnableKafka
public class KafkaProducerConfig {

    @Value("${kafka.producer.bootstrap-servers}")
    private String bootstrapServerConfig;

    /**
     * @return ProducerFactory
     */
    @Bean
    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    /**
     * @return producerConfigs
     */
    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> propsMap = new HashMap<>(7);
        propsMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, this.bootstrapServerConfig);
        propsMap.put(ProducerConfig.RETRIES_CONFIG, 0);
        propsMap.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        propsMap.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        propsMap.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        propsMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        propsMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return propsMap;
    }

    /**
     * @return KafkaTemplate
     */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
