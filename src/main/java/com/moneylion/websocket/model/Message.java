package com.moneylion.websocket.model;

import lombok.Data;

@Data
public class Message {
    private String from;
    private String text;
}