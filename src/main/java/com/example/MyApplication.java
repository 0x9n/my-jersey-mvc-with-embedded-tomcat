package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

/**
 * Created by tie303802 on 15/10/05.
 */
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        // MyApplicationクラスをComponentの検索対象に追加
        // JspMvcFeatureクラスも同様？
        this.packages(MyApplication.class.getPackage().getName()).register(JspMvcFeature.class);
    }
}
