package com.example;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * /hello-mvc��URL�p�^�[���Ƀ}�b�`����JSP��ԋp����T���v���N���X
 */
@Path("hello-mvc")
public class MyResource {

    /**
     * /hello-mvc�ւ�GET���N�G�X�g���󂯎����JSP��ԋp����B
     * @return Viewable�C���X�^���X
     */
    @GET
    public Viewable helloworld() {
        return new Viewable("/hello-mvc");
    }
}
