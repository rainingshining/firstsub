package com.test.firstsub.test;

import com.test.firstsub.model.User;
import com.test.firstsub.util.EntityBuilder;

public class BuilderTest {

    public static void main(String[] args) {
        User user = EntityBuilder.of(User::new)
                .with(User::setName, "Risa")
                .with(User::setAge, 18)
                .with(User::setId, 1)
                .with(User::setSex, "female")
                .with(User::setRemark, "Woo, functional interface")
                .build();
        System.out.println(user.toString());
    }
}
