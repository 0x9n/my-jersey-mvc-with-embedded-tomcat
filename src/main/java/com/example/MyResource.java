package com.example;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * /hello-mvcのURLパターンにマッチしてJSPを返却するサンプルクラス
 */
@Path("hello-mvc")
public class MyResource {

    /**
     * /hello-mvcへのGETリクエストを受け取ってJSPを返却する。
     * @return Viewableインスタンス
     */
    @GET
    public Viewable helloworld() {
        return new Viewable("/hello-mvc");
    }
}
