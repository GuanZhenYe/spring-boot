package com.example.web;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * zookeeper test
 * <p>
 * Created by hp on 2018/2/24.
 */
public class Test {

    public static void main(String[] args) {

        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.75.132:2181", 5000, null);
            zooKeeper.create("/zk_test", "init".getBytes(), ZooDefs.Ids.CREATOR_ALL_ACL, CreateMode.EPHEMERAL);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }


    }
}
