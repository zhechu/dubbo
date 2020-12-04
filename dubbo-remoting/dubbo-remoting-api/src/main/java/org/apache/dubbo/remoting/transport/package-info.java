/**
 * Transport网络传输层：Mina和Netty抽象为统一接口。扩展接口为Channel，对应的实现有NettyChannel（默认）、MinaChannel等；
 *
 * 扩展接口Transporter对应的实现类有GrizzlyTransporter、MinaTransporter、NettyTransporter（默认实现）；
 *
 * 扩展接口Codec2对应的实现类有DubboCodec、ThriftCodec等
 */
package org.apache.dubbo.remoting.transport;