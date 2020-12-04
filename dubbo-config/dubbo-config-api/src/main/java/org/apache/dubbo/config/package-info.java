/**
 * Service和Config层为API接口层，是为了让Dubbo使用方方便地发布服务和引用服务；
 * 对于服务提供方来说需要实现服务接口，然后使用ServiceConfigAPI来发布该服务；
 * 对于服务消费方来说需要使用ReferenceConfig对服务接口进行代理。
 *
 * Dubbo服务发布与引用方可以直接初始化配置类，也可以通过Spring配置自动生成配置类
 */
package org.apache.dubbo.config;