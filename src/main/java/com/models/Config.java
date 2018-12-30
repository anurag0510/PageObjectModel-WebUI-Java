package com.models;

import java.util.Date;
import java.util.Map;

import lombok.Getter;

@Getter
public class Config {
    private Date released;
    private int timeout;
    private String browser;
    private boolean maximize;
    private Map<String, String> users;
    private int timeoutInSeconds;
    private int timeoutForWait;
    private int explicitTimeOut;
}