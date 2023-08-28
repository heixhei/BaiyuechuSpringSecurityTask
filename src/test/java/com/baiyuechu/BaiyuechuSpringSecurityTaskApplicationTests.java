package com.baiyuechu;

import com.baiyuechu.dao.MenuMapper;
import com.baiyuechu.dao.UserMapper;
import com.baiyuechu.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
class BaiyuechuSpringSecurityTaskApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void testMenuMapper() {
        List<String> list = menuMapper.selectPermsByUserId(2L);
        System.out.println(list.toString());
    }
    @Test
    public void testPasswordEncoder() {
//        $2a$10$zsjxPhzbH./z8GebbZWWieY/a8U9EnAFcyzzxwSz29WLRieSqKZY6
//        $2a$10$V4EJaH0dOYI7HStM6LvLNOGkxYvRIXT8YrWGn17.qeUB.OjqhWuNy
        String s1 = new String("1234");
        String s2 = new String("1234");
        System.out.println(passwordEncoder.encode(s1));
        System.out.println(passwordEncoder.encode(s2));
//        System.out.println(passwordEncoder.matches("1234","$2a$10$V4EJaH0dOYI7HStM6LvLNOGkxYvRIXT8YrWGn17.qeUB.OjqhWuNy"));

    }
    @Test
    public void   taskUserMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
