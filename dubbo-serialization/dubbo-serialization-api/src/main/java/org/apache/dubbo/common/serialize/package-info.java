/**
 * Serialize数据序列化层：提供可以复用的一些工具，扩展接口为Serialization，
 * 对应的扩展实现有DubboSerialization、FastJsonSerialization、Hessian2Serialization、JavaSerialization等，
 *
 * 扩展接口ThreadPool对应的扩展实现有FixedThreadPool、CachedThreadPool、LimitedThreadPool等
 */
package org.apache.dubbo.common.serialize;