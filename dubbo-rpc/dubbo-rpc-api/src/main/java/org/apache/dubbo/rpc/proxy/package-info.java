/**
 * Proxy服务代理层：该层主要是对服务消费端使用的接口进行代理，把本地调用透明地转换为远程调用；
 * 另外对服务提供方的服务实现类进行代理，把服务实现类转换为Wrapper类，这是为了减少反射的调用。
 *
 * Proxy层的SPI扩展接口为ProxyFactory，Dubbo提供的实现类主要有JavassistProxyFactory（默认使用）和JdkProxyFactory，
 * 用户可以实现ProxyFactorySPI接口，自定义代理服务层的实现
 */
package org.apache.dubbo.rpc.proxy;