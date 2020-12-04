/**
 * Monitor监控层：用来统计RPC调用次数和调用耗时时间，扩展接口为MonitorFactory，对应的实现类为DubboMonitorFactroy。
 *
 * 用户可以实现该层的MonitorFactory扩展接口，实现自定义监控统计策略
 */
package org.apache.dubbo.monitor;