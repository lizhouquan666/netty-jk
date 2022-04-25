package com.tulun.pojo;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class Msg {

    private String id;
    private String fromUserId;
    private String toUserId;
    private String data;
    private String filePath;
    private String sendTime;
    private String accepttime;
    private String state;


}
