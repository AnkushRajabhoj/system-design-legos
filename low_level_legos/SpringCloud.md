# Spring Cloud

Multiple small focused application
Loosely coupled
Independently Deployable

Decentralized
Distributed
Scaled, deployed, updated separately based on demand

Small team,
Multiple team can work without affecting other,
in long run reduce time to market
Can be in different languages
Failure does not effect entire system (ideally)

Communication via lightweight protocols
Organized around business capabilities

## Challenges

Increased Complexity
Managing multiple services
Latency
Load balancing
network reliability
consistency

Managing transaction and consistency across service
handling communication
Monitoring
Logging
Tracing

## ---

Api gateway
Load balancer

Discovery Server -> Register server -> Eureka Server/Client

Config server
open feign
Resilience4j
distributed tracing
centralized logs

CAP

- Consistency
- Availability
- Partition Tolerance

PACELC

monorepo

# Discovery (8671)

Server
Client
Server Registration
Heartbeat server(client) -> eureka server
Service Discovery
Health check
Eviction

## API Gateway

Route
Predicate

- method
- path
- header

Filter

- Web filter -> modifying request and response
- AddRequestHeader
- AddResponseHeader
- RedirectTo
- StripPrefix
- RemoveRequestHeader

Security - Authentication and Authorization
Routing - Routing, request response manipulation, circuit breaker
Observability -> metric aggregation,logging, tracing
Filtering
Load balancing

Downstream

Resilience

Retry
RateLimiter
Circuit Breaker
Bulkhead
