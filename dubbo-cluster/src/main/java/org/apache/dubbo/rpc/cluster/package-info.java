/**
 * Cluster路由层：封装多个服务提供者的路由规则、负载均衡、集群容错的实现，并桥接服务注册中心；
 * 扩展接口Cluster对应的实现类有FailoverCluster（失败重试）、FailbackCluster（失败自动恢复）、
 * FailfastCluster（快速失败）、FailsafeCluster（失败安全）、ForkingCluster（并行调用）等；
 *
 * 负载均衡扩展接口LoadBalance对应的实现类为RandomLoadBalance（随机）、RoundRobinLoadBalance（轮询）、
 * LeastActiveLoadBalance（最小活跃数）、ConsistentHashLoadBalance（一致性Hash）等。
 *
 * 用户可以实现该层的一系列扩展接口，自定义集群容错和负载均衡策略
 */
package org.apache.dubbo.rpc.cluster;