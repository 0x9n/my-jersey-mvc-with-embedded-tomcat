package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

/**
 * Created by tie303802 on 15/10/05.
 */
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        // MyApplication�N���X��Component�̌����Ώۂɒǉ�
        // JspMvcFeature�N���X�����l�H
        this.packages(MyApplication.class.getPackage().getName()).register(JspMvcFeature.class);
    }
}
