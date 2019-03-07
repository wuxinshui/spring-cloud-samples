package com.wxs.eureka.server;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/2/26 17:33
 */
public class Test {
    public static String parseDotSub(String jsonStr) {
        //格式化JSON，使JSON中的键值对换行
        //解析键值对，不替换值中的字符，只替换冒号之前KEY中的字符
        String regexDot = "\\w+(?=token)";
        jsonStr = jsonStr.replaceAll(regexDot, jsonStr);
        return jsonStr;
    }

    public static void main(String[] args) {
        String str = "{\"token\":\"3xROyFwTuNsWaMWf5naUtmnroXLTPGO9/M0zlZc+bvg=\",\"timestamp\":\"1551172007240\",\"lastLoginIp\":\"60.186.187.5\"}";
        String str1="{\"data\":[{\"itemId\":\"139748c7-6865-450f-8e6d-9b986bb1a2d6\",\"totalRankNum\":10,\"childList\":[{\"itemId\":\"7c68e459-463f-48de-beaa-f31d9dc3cbaa\",\"totalRankNum\":3,\"rankIds\":[\"33292332-f66c-4494-a072-4c91b442529d\",\"b4965a46-2bae-4d5d-8248-50c73013b834\",\"3f38b235-b765-4dff-a456-1f8a4469595c\"]},{\"itemId\":\"7321bf80-b289-4e28-baaf-bd29d1549240\",\"rankIds\":[\"b07b5838-5b5c-4225-894e-8de220a619eb\",\"27a9328d-320b-427c-9d78-1f1b922600c2\"]}]}]}";
        String regexDot = "\"itemId\":\"(.*?)\\\"";

        Pattern pattern = Pattern.compile(regexDot);
        Matcher matcher = pattern.matcher(str1);
        if (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(0));
        }
    }
}
