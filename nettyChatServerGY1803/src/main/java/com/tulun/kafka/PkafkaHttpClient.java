package com.tulun.kafka;

import com.dtflys.forest.annotation.Get;

public interface PkafkaHttpClient {

   /* @Get(url = "http://localhost:8087/producer?id={0}")
    String kafka52(String id);

    @Get(url = "http://localhost:8087/producer?id={0}")
    String kafka40(String id);

    @Get(url = "http://localhost:8087/producer?id={0}")
    String kafka145(String id);*/

    @Get(url = "http://192.168.110.52:8088/producer?host={0}&msg{1}")
    String kafkap(String host, String msg);




}
