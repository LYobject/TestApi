import com.alibaba.fastjson.JSONObject;

import utils.OkHttpApi;

import java.io.IOException;

/**
 * @Author:李烨
 * @Description: TODO
 * @DateTime: 2022-11-27 18:29
 **/
public class TestApi {

    public static void main(String[] args) throws IOException {
        OkHttpApi api = new OkHttpApi();
        String run = api.run("https://api.uomg.com/api/rand.music?sort=新歌榜&format=json");
        System.out.println(run);
        JSONObject jsonObject = JSONObject.parseObject(run);

        System.out.println(jsonObject);
        //Object data = jsonObject.getObject("data");
        //System.out.println(data);
        System.out.println("hello,world");
    }
}
