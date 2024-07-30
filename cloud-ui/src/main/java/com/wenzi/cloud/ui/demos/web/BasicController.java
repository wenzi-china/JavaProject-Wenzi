/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wenzi.cloud.ui.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 623692325@qq.com
 */
@Controller
public class BasicController {

    private static User globalUser;

    private String globalName;

    private Integer globalAge;

    // http://127.0.0.1:8083/hello?name=lisi
    //通过网关访问地址为  http://127.0.0.1:8084/cloud-service/hello?name=lisi
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return "Hello " + name;
    }

    // http://127.0.0.1:8083/user
    //通过网关访问地址为  http://127.0.0.1:8084/cloud-service/user
    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        globalUser = new User();
        globalUser.setName(globalName);
        globalUser.setAge(globalAge);
        return globalUser;
    }

    // http://127.0.0.1:8083/save_user?name=wenzi&age=11
    //通过网关访问地址为  http://127.0.0.1:8084/cloud-service/save_user?name=wenzi&age=11
    @RequestMapping("/save_user")
    @ResponseBody
    public String saveUser(User u) {
        return "user will save: name=" + u.getName() + ", age=" + u.getAge();
    }

    // http://127.0.0.1:8083/html
    //通过网关访问地址为  http://127.0.0.1:8084/cloud-service/html
    @RequestMapping("/html")
    public String html() {
        return "index.html";
    }

    @ModelAttribute
    public void parseUser(@RequestParam(name = "name", defaultValue = "unknown user") String name
            , @RequestParam(name = "age", defaultValue = "12") Integer age, User user) {
        user.setName("zhangsan");
        user.setAge(18);
        globalName = name;
        globalAge = age;
    }
}
