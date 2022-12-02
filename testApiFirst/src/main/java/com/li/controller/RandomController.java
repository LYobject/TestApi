package com.li.controller;

import com.alibaba.fastjson.JSONObject;
import com.li.utils.OkHttp;
import org.springframework.stereotype.Controller;

/**
 * @Author:李烨
 * @Description: TODO
 * @DateTime: 2022-11-27 18:41
 **/
@Controller
public class RandomController {

    public String TestApi(){
        OkHttp api = new OkHttp();
        api.run("https://api.uomg.com/api/rand.music?sort=新歌榜&format=json")
        //String run = api.run("https://api.uomg.com/api/rand.music?sort=新歌榜&format=json");
        System.out.println(run);
        JSONObject jsonObject = JSONObject.parseObject(run);

        System.out.println(jsonObject);
    }

}
