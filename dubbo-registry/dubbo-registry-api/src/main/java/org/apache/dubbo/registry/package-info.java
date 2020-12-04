/**
 * Registry服务注册中心层：服务提供者启动时会把服务注册到服务注册中心，消费者启动时会去服务注册中心获取服务提供者的地址列表，
 * Registry层主要功能是封装服务地址的注册与发现逻辑，扩展接口Registry对应的扩展实现为ZookeeperRegistry、RedisRegistry、
 * MulticastRegistry、DubboRegistry等。
 *
 * 扩展接口RegistryFactory对应的扩展接口实现为DubboRegistryFactory、DubboRegistryFactory、RedisRegistryFactory、ZookeeperRegistryFactory
 *
 * 扩展接口Directory实现类有RegistryDirectory、StaticDirectory，用来透明地把Invoker列表转换为一个Invoker；
 *
 * 用户可以实现该层的一系列扩展接口，自定义该层的服务实现
 */
package org.apache.dubbo.registry;