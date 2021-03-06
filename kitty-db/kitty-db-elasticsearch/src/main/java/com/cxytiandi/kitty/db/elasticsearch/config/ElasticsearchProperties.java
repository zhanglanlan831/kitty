package com.cxytiandi.kitty.db.elasticsearch.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2020-03-09 21:12
 */
@Data
@ConfigurationProperties(prefix = "kitty.es")
public class ElasticsearchProperties {

    /**
     * ES地址
     */
    private String hostname;

    /**
     * ES端口
     */
    private int port;

}