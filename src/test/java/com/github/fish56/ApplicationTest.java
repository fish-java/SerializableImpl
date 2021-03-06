package com.github.fish56;

import com.alibaba.fastjson.JSONObject;
import com.github.fish56.entity.Fish;
import com.github.fish56.entity.Sheep;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ApplicationTest {
    /**
     * 不实现序列化接口无法序列化
     *   但是为什么是这样的呢？？
     * @throws Exception
     */
    @Test
    public void serialFish() throws Exception{
        Fish fish = new Fish(23, "Jon");

        //输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("fish.out"));

        oos.writeObject(fish);
        oos.flush();
        oos.close();
    }

    @Test
    public void serialSheep() throws Exception{
        Sheep sheep = new Sheep(23, "Jon");

        //输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("sheep.out"));

        oos.writeObject(sheep);
        oos.flush();
        oos.close();
    }

    @Test
    public void parseFish() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("sheep.out"));
        Sheep sheep = (Sheep) ois.readObject();
        System.out.println(JSONObject.toJSONString(sheep));
        // {"id":23,"name":"Jon"}
    }
}
