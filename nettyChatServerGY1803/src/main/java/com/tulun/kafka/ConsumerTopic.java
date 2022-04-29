package com.tulun.kafka;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.tulun.controller.Transfer;
import com.tulun.util.JsonUtils;
import com.tulun.util.SpringUtil;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerTopic {



    @KafkaListener(topics = {"192.168.110.52"})
    public void consumer52(String msg)
    {
        System.out.println("从kafka拿到的消息:"+msg);
        System.out.println("---------------------------");

        if (msg!=null)
        {
            ObjectNode objectNode = JsonUtils.getObjectNode(msg);
            //解析数据类型
            String id = objectNode.get("toUser").asText();
            String data = objectNode.get("data").asText();
            ChannelHandlerContext channelHandlerContext = Transfer.hashMap1.get(Integer.valueOf(id));
            channelHandlerContext.channel().writeAndFlush(id+":"+data);

        }




    }

}

/*    @RequestMapping("consumer40")
    @KafkaListener(topics = {"192.168.110.40"})
    public void consumer40(String msg)
    {
        System.out.println("从kafka拿到的消息:"+msg);
    }
    @RequestMapping("consumer145")
    @KafkaListener(topics = {"192.168.110.145"})
    public void consumer145(String msg)
    {
        System.out.println("从kafka拿到的消息:"+msg);
    }*/


