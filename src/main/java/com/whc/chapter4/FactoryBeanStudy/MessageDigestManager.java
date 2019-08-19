package com.whc.chapter4.FactoryBeanStudy;

import java.security.MessageDigest;

/**
 * author : whc
 * createTime:2019/8/19  21:41
 */
public class MessageDigestManager {

    private MessageDigest messageDigest1;
    private MessageDigest messageDigest2;

    public MessageDigest getMessageDigest1() {
        return messageDigest1;
    }

    public void setMessageDigest1(MessageDigest messageDigest1) {
        this.messageDigest1 = messageDigest1;
    }

    public MessageDigest getMessageDigest2() {
        return messageDigest2;
    }

    public void setMessageDigest2(MessageDigest messageDigest2) {
        this.messageDigest2 = messageDigest2;
    }


    public MessageDigestManager() {
    }

    public MessageDigestManager(MessageDigest messageDigest1, MessageDigest messageDigest2) {
        this.messageDigest1 = messageDigest1;
        this.messageDigest2 = messageDigest2;
    }


    public void digest(String msg){
        System.out.println("Using 1 : ");
        useDigest(msg,messageDigest1);
        System.out.println("*****************************");
        System.out.println("Using 2");
        useDigest(msg,messageDigest2);
    }

    /**
     * 使用 message Digest 进行的 加密转换操作 ：
     *      此方法中 用到了 MessageDigest 中的主要的操作思路
     * @param msg
     * @param messageDigest
     */
    public void useDigest(String msg,MessageDigest messageDigest){

        System.out.println("Using alogrithm : "+messageDigest.getAlgorithm());
        messageDigest.reset();
        //1.转换
        byte[] input = msg.getBytes();
        //2.预处理
        messageDigest.update(input);
        //3.转换完成
        byte[] out =  messageDigest.digest();
        //4.把转换完成的字节转成字符串，打印出来
        String outmsg = convertToHexString(out);
        System.out.println(outmsg);
    }

    /**
     * 将 字节数组，转换成 字符串的一个方法，抄的,不过还挺好用的
     * 这个可以用来进行加密操作的呀
     * @param data
     * @return
     */
    public  String convertToHexString(byte data[]) {
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            strBuffer.append(Integer.toHexString(0xff & data[i]));
        }
        return strBuffer.toString();
    }
}
