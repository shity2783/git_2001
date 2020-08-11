package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Git2001ApplicationTests {

    @Test
    void contextLoads() {
    }


    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("update in github");
	    System.out.println("update in local");
        System.out.println("update in idea");
        System.out.println("update in idea and git");
    }

    public void findAll(){
	System.out.println("开发者A的修改");
    }
	
}
