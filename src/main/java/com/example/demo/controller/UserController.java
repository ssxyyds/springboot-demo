package com.example.demo.controller;


import com.example.demo.domain.Result;
import com.example.demo.domain.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ssx
 * @since 2023-06-17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 查询所有用户
     *
     * @return Result<List < User>>
     */
    @GetMapping("/list")
    public Result<List<User>> list() {
        return Result.success(userService.list());
    }

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return Result<User>
     */
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return Result<Boolean>
     */
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody User user) {
        return Result.success(userService.save(user));
    }

    /**
     * 修改用户
     *
     * @param user 用户信息
     * @return Result<Boolean>
     */
    @PostMapping("/update")
    public Result<Boolean> update(@RequestBody User user) {
        return Result.success(userService.updateById(user));
    }

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return Result<Boolean>
     */
    @GetMapping("/delete/{id}")
    public Result<Boolean> delete(@PathVariable Long id) {
        return Result.success(userService.removeById(id));
    }

}

