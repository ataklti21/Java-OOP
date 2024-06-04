package com.atuka;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest();
        System.out.println(html + "-" + ip);
    }

    private String sendHttpRequest() {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
