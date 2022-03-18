package io.lfr;

import com.github.javafaker.Faker;
import io.lfr.models.Employee;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.InterruptException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class Producer {

    private static final Logger LOG = LoggerFactory.getLogger(Producer.class);

    public static void main(String[] args) {
        final Properties properties = loadConfig();
        final String topic = properties.getProperty("producer.topic");

        try (KafkaProducer<String, Employee> producer = new KafkaProducer<>(properties)) {
            while (true) {
                ProducerRecord<String, Employee> record = new ProducerRecord<>(topic, generateRandomEmployee());
                producer.send(record, ((recordMetadata, e) -> {
                    if (e != null) {
                        LOG.warn(e.getMessage());
                    } else {
                        LOG.info("Avro Message = " + record.value() + ", Offset = " + recordMetadata.offset());
                    }
                }));
            }
        } catch (InterruptException | IllegalArgumentException e) {
            LOG.error(e.getMessage());
        }
    }

    // prévoir de passer la config en paramètre
    private static Properties loadConfig() {
        final Properties properties = new Properties();
        InputStream producerConfigFile = Producer.class.getClassLoader().getResourceAsStream("producer.properties");
        try {
            properties.load(producerConfigFile);
        } catch (IOException e) {
            LOG.error("Error : " + e.getMessage());
        }
        return properties;
    }

    private static Employee generateRandomEmployee() {
        Faker faker = new Faker();
        return Employee.newBuilder()
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setAge(new Random().nextInt(19) + 40) // on aura que des employées d'un certain âge
                .build();
    }

}
