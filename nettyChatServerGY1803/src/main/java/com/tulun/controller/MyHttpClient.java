package com.tulun.controller;

import com.dtflys.forest.annotation.*;
import com.tulun.pojo.Msg;

public interface MyHttpClient {

    @Request(url="http://localhost:8080/insertMsg",type = "post")
    String insertMsg(@Body Msg msg);

    @Get(url = "http://localhost:8080/findByCondition?toUserId={0}&state={1}")
    String findByCondition(String toUserId,String state);


    @Put(url = "http://localhost:8080/updateMany")
    String updateMany(@Body("toUserId")String toUserId,@Body("state") String state);


}