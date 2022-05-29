package com.jdw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jdw.mapper.MyUserMapper;
import com.jdw.mapper.UserMapper;
import com.jdw.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MyUserMapper myUserMapper;

    //测试查询
    @Test
    void testSelect() {
        //查询所有用户
        List<User> userList = userMapper.selectList(null);
        //输出查询到的用户
        userList.forEach(System.out::println);
    }

    //测试插入
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("李四");
        user.setAge(32);
        user.setEmail("212121212@qq.com");
        //新增用户
        int count = userMapper.insert(user);
        System.out.println("新增的用户数量为: " + count);
    }

    //测试更新
    @Test
    public void testUpdateByID() {
        User user = new User();
        user.setId(5L);
        user.setName("李四");
        user.setAge(7);
        //更新用户
        int i = userMapper.updateById(user);
        System.out.println("更新的数据行数为：" + i);
    }

    //测试删除
    @Test
    public void testDeleteByID() {
        //删除用户
        int i = userMapper.deleteById(666);
        System.out.println("删除的用户数为： " + i);
    }

    //测试自定义SQL
    @Test
    public void testDiySql() {
        System.out.println(myUserMapper.selectAllUsers());
    }

    //测试自定义分页
    @Test
    public void testSelectMyPage(){
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.like("name", "小");
        Page<User> page = new Page<>(1,2);
        IPage<User> mapIPage = myUserMapper.selectMyPage(page, wrapper);

        System.out.println("总页数: "+mapIPage.getPages());
        System.out.println("总记录数: "+mapIPage.getTotal());
        List<User> records = mapIPage.getRecords();
        records.forEach(System.out::println);
    }


    //测试乐观锁
    @Test
    public void testOptimisticLocker2() {
        User user1 = userMapper.selectById(3L);
        User user2 = userMapper.selectById(3L);

        user1.setAge(111);
        if(userMapper.updateById(user1) > 0 ){
            System.out.println("user1 更新成功");
        } else {
            System.out.println("user1 更新失败，该记录已被其他人修改！");
        }

        user2.setAge(222);
        if(userMapper.updateById(user2) > 0 ){
            System.out.println("user2 更新成功");
        } else {
            System.out.println("user2 更新失败，该记录已被其他人修改！");
        }
    }

    //查询单用户
    @Test
    public void testSelectBatchId() {
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    //查询指定多用户
    @Test
    public void testSelectBatchIds() {
        //Arrays.asList()创建了一个固定大小的集合
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));//参数Collection的集合
        users.forEach(System.out::println);
//        [Arrays.asList()详解](https://blog.csdn.net/kzadmxz/article/details/80394351)
    }

    //条件查询，-- HashMap
    @Test
    public void testSelectByMap() {
        HashMap<String, Object> map = new HashMap<>();
        //定义查询条件
        map.put("name", "小蒋"); //where k = v
        map.put("age", 3);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    //测试分页查询
    @Test
    public void testPage() {
        Page<User> page = new Page<>(1,5); //开启拦截器后，会注册一个page对象  当前页，每页条数
        //方法源码：   <P extends IPage<T>> P selectPage(P page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println); //获取分页后的数据
        System.out.println(page.getTotal()); //获取记录总数
    }
    //删除测试
    @Test
    public void testDeleteById(){
        userMapper.deleteById(1L);
//        userMapper.delete(null);//全部删除
    }
    @Test
    public void testDeleteBatchIds(){
        userMapper.deleteBatchIds(Arrays.asList(1,2,3));
    }
    @Test
    public void test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","小夏");
        userMapper.deleteByMap(map);
    }
}
