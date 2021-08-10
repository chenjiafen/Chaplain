package com.chenjiafeng.service;

import com.chenjiafeng.dao.UserDao;
import com.chenjiafeng.dao.UserRepository;
import com.chenjiafeng.entity.Article;
import com.chenjiafeng.entity.User;
import com.chenjiafeng.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author chenjiafeng2
 * @create 2021-07-06 15:15
 * @desc
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    BCryptPasswordEncoder encoder;//加密
    @Autowired
    IdWorker idWorker;


    //登录方法
    public User login(User user) {
        User loginUser = userDao.findByMobile(user.getMobile());

        //2 使用工具类比对密码是否一致 -> (参数1:明文密码 参数2:密文密码)
        if (loginUser!=null && encoder.matches(user.getPassword(), loginUser.getPassword())) {
            //不一致 => 密码错误=> 返回null
            return loginUser;
        }else{
            throw new RuntimeException("登陆失败");
        }

    }

    /**
     * 新增用户
     *
     * @param user
     */
    public void add(User user) {
        user.setId(idWorker.nextId() + "");
        String newpassword = encoder.encode(user.getPassword());//加密后的
        user.setPassword(newpassword);
        userDao.save(user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    public void deleteById(String id) {
        if (!Objects.isNull(id)) {
            userDao.deleteById(id);
        }
    }
//    @Autowired
//    UserRepository userRepository;
//    public Article getById(String id){
//        return userRepository.findOne(id);
//    }
//
//    public void save(Article userInfo){
//        userRepository.save(userInfo);
//    }
}