package com.tulun;

import com.tulun.controller.MyHttpClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = Application.class)
public class springtets {
    @Autowired
    private MyHttpClient myClient;

        @Test
        public void test01(){
            /*Msg msg = new Msg();
            msg.setData("你爷爷的");
            String s = myClient.insertMsg(msg);
            System.out.println(s);*/
          //  String byCondition = myClient.findByCondition("3");
            //System.out.println(byCondition);

            String s = myClient.updateMany("3", "110");
            System.out.println(s);

        }



}
