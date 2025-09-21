# High Level Design

Functional
Non Functional
Calculation
Core Entity
APIs
Diagram

# Networking

- > Physical -> Raw bits
- > Data link -> Frame -> Mac IP tcp http header data
- > Network -> Datagram -> IP, ICMP (Routing)
- > Transport -> Segments -> TCP/UDP (segments)
- > Session
- > Presentation
- > Application -> HTTPS

Self made
Network layer abstraction

- Application HTTP/Quic
- Transport TCP/UDP
- Network IP
- Link layer (Mac)

HTTPS
HTTP
Ws
WSS

TLS
SSL

3 way hand shake
TCP
IP
UDP
QUIC

## API Design

- Message Format (Translation protocol)

- gRPC
- Graph QL
- Rest
- Web socket
- Long polling
- Short Polling
- Server sent event
- WebRTC
- Webhooks

- Auth
- Pagination
- Versioning
- Header

Api Gateway

- Routing
- Authentication & Authorization (OAuth 2.0, JWT, RBAC)
- Rate Limiting,
- Throttling
- Quotas
- Caching
- Load balancing
- Aggregation

## Non Functional Requirement

- SCALE
- QPS
- Network Bandwidth
- Data storage
- CPU usage
- Active User
- Latency
- Throughput
- High Availability
- CAP and ACID

# CAP

Consistency -> Every read receives the most recent write or an error
Availability -> Every request received by a non-failing node in the system must result in a response.
Partition tolerance -> The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes.

# ACID (Consistency over availability)

Atomicity
Consistency State of data
Isolation of transaction
Durability of data

# BASE (availability and Eventual Consistency)

Basically Available
Soft state
Eventual Consistency

## Database

## Microservices Architecture

## Distributed Systems

=========================

Functional
Non Functional
Calculation
Core Entity
APIs
Diagram
Databases
Discuss Core concept
Resilience
Chaos Monkey
Trade offs

- Client
  - APIs
    - Auth
    - Cache
    - Pagination/ Sorting/ Filtering
    - Version Control
    - Network Details
- DNS
- CDN
- API gateway

  - Security
    - Authentication
    - Authorization
    - Oauth 2.0, Jwt, Rbac
  - Routing
  - LB
  - Rate Limit, Throttle, Quotas

- Web Server
- Service Worker
- Queue
- Read Apis
- Write Apis

Design For failure

- Discovery Server
- Circuit Breaker
  - Open Half Closed

Scaling

- Horizontal
- Vertical
- Sharding
- Partitioning

Latency
Throughput

Cache

- Hit
- Miss
- Eviction policy

Message Queue
Pub Sub

Logging, Tracing and Monitoring

Proxy / Reverse Proxy

Databases
SQL vs NO SQL
Indexing
Replication
Denormalization
Blop
GeoSpecial

CAP
PACELC

Databases
Index
LSM Trees + SSTables
B/B+Tree
Replication
1 leader
multi leader
leader less
Quoram
