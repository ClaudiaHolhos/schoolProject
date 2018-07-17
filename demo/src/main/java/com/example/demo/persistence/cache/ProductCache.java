package com.example.demo.persistence.cache;

import com.example.demo.persistence.entities.Product;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class ProductCache  {

//    private static ProductCache instance;
//    private static Object lock = new Object();
//    private int elapsedSeconds;
//    private Map<String, List<Product>> cache = Collections.synchronizedMap(new HashMap<String, List<Product>>());
//
//    private ProductCache() {
//    }
//
//    public int getElapsedSeconds() {
//        return elapsedSeconds;
//    }
//
//    public void setElapsedSeconds(int elapsedSeconds) {
//        this.elapsedSeconds = elapsedSeconds;
//    }
//
//    public void putSoftwareProducts(List<Product> value) {
//        cache.put("software", value);
//    }
//
//    public void putHardwareProducts(List<Product> value) {
//        cache.put("hardware", value);
//    }
//
//    public List<Product> getSoftwareProducts() {
//        return cache.get("software");
//    }
//
//    public List<Product> getHardwareProducts() {
//        return cache.get("hardware");
//    }
//
//    public void clear(String cacheKey) {
//        cache.put(cacheKey, null);
//    }
//
//    public void clearCache() {
//        cache.clear();
//    }
//
//    public static ProductCache getInstance() {
//        if (instance == null) {
//            synchronized (lock) {
//                if (instance == null) {
//                    instance = new ProductCache();
//                    instance.runThread();
//                }
//            }
//        }
//        return instance;
//    }
//
//    @Override
//    public void run() {
//        //count seconds and reset when >30
//        try {
//            while (true) {
//                sleep(1000);
//                System.out.println("elapsed seconds "  + elapsedSeconds);
//                elapsedSeconds += 1;
//                if (elapsedSeconds > 29) {
//                    System.out.println("refreshed cache");
//                    elapsedSeconds = 0;
//                    this.clearCache();
//                  //  System.out.println("cleared cached products ");
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void updateProductCacheContents(List<Product> products) {
//        String category = products.get(0).getCategory();
//        cache.put(category,products);
//    }
//
//    public boolean empty() {
//        return cache.isEmpty();
//    }
//
//    private void runThread() {
//        Thread t = new Thread(instance);
//        t.start();
//    }
}
