package com.wxs.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/26 10:59
 */
@Component
public class AccessFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


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
        logger.info("zuul filter order 0");
        return 0;
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
        logger.info("AccessFilter run...");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        return null;
    }
}
