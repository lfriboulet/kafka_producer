# A propos
C'est un petit projet pour réaliser des tests avec l'API **Kafka Producer** depuis un projet Maven classique. (aucun framework utilisé)

L'application permet de produire des records au **format Avro**.
Un plugin Maven est utilisé pour produire les records depuis le schéma Avro. Il s'agit de la méthode **Specific**,
c'est-à-dire:

1. Créer manuellement le schéma Avro (fichier avec l'extension .avsc)
2. Générer les classes Java depuis le schéma (le plugin Maven)

Les autres méthodes possibles sont Generic et Reflection.

# Pré-requis

### Environnement Kafka

Un cluster Kafka (brokers, zookeepers, schema-registry ...) est nécessaire, pour mes tests j'ai utilisé une solution basée sur des containers Docker.

Mon docker-compose est disponible sur ce dépôt suivant :

https://github.com/lfriboulet/kafka_cluster

### Création du Topic

Les brokers ayant la configuration **AUTO_CREATE_TOPICS_ENABLE** à false, les clients kafka ne peuvent pas créer à la volée le topic.

Il faut créer le Topic manuellement avec la commande suivante:

    kafka-topics  \
    --bootstrap-server kafka:9092, kafka2:9092, kafka3:9092 \
    --create \
    --topic employee-avro  \
    --partitions 6 \
    --replication-factor 3 \
    --config cleanup.policy=delete \
    --config min.insync.replicas=2


### Déployer le schéma Avro

- le schéma Avro sera déployer automatiquement par le producer car il n'y a pas de restrictions de configurer. En production il n'est pas recommandé de laisser ce type de configuration par défaut.
- il est possible de déployer le schéma Avro via les APIs exposées par schema-registry
- il est possible également de passer par l'interface graphique du projet AKHQ utilisé dans le docker-compose pour gérer son cluster Kafka

# Démarrer l'application

1. Cloner le projet
2. Compiler le projet
Cette étape est nécessaire si les classes Java pour générer ne sont pas présentes ou si le schéma Avro a été mise à jour.

    
    mvn clean compile
3. Créer le jar


    mvn package

4. Lancer l'application


    java - jar kafka-producer-1.0-SNAPSHOT.jar
# Ressources

https://www.slideshare.net/ConfluentInc/common-issues-with-apache-kafka-producer