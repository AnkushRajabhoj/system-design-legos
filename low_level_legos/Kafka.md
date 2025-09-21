Producer
Consumer
Event

Kafka Cluster
Broker (Kafka server)

Topic
Partition
Offset

Consumer group
Replication factor

Rebalancing

- new consumer joins in consumer group
- consumer goes down
- new partition is added
- consumer is considered dead(not polling for some time)

Acks
0 : fast but no acks so no guarantee
1 : ack to only to leader
-1 (all): ack to all insync replicas
Retries
