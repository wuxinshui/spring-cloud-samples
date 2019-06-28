package com.wxs.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/26 10:59
 */
@Component
public class AuthFilter extends ZuulFilter {

    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    /**
     * 过滤类型，决定在请求的哪个生命周期执行，pre表示被路由之前执行
     * pre:路由前 ； routing ：路由请求时 ； post ：在routing 和 error 之后 ； error：处理请求时发生错误时 ；
     *
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }


    /**
     * 过滤器的执行顺序，根据返回值依次执行
     *
     * @return
     */
    @Override
    public int filterOrder() {
        logger.info("zu");
        return 1;
    }


    /**
     * 判断过滤器是否需要执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器具体逻辑代码
     *
     * @return
     */
    @Override
    public Object run() {
        logger.info("AuthFilter run...");
        return null;
    }
}
