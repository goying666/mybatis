
import com.zujuba.domain.userLogin;
import com.zujuba.mapper.userServerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testUse {
    /**
     * MyBatis SqlSessionFactory * SqlSessionFactory????SqlSession????????????SqlSession??????????commit?rollback?close???? * @return
     */
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

//    public static void main(String[] args) {
//        //创建一个sql的会议，标准格式；
//        SqlSession sqlSession = getSessionFactory().openSession();
////        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        //创建pojo的接口类，并用sql会议赋值，标准格式；
////        userbasicMapper userbasicmapper = sqlSession.getMapper(userbasicMapper.class);
//        userServerMapper usmapper = sqlSession.getMapper(userServerMapper.class);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
////        //创建要写入的实例；
//        userLogin userlogin = new userLogin();
//        userlogin.setname("date");
//        userlogin.setlogintime(new Date());
//        usmapper.addUserLogin(userlogin);
//
//        sqlSession.commit();
//
////        userbasic userNow = new userbasic();
//////        userNow.setid(11);
////        userNow.setage(100);
////        userNow.setname("gaogaoyanyan");
////        //使用接口方法将数据写入；
////        userbasicmapper.adduserbaseic(userNow);
////        sqlSession.commit();
//////        for (int i=0 ; i<10000;i++){
//////            try {
//////                System.out.println("select name number is : " + userMapper.findByName("gaogaoyanyan"+i));
//////            } catch (Exception e) {
//////                User usernew = new User();
////////        usernew.setId(13);
//////                usernew.setAge(100);
//////                usernew.setName("gaogaoyanyan"+i);
//////                System.out.println(i + " is : " + userMapper.adduser(usernew));
//////
//////                sqlSession.commit();
//////            }
//////        }
////
//        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
////
//////        User user = userMapper.findById("2");
//////        System.out.println(user.getName());
//////        System.out.println(user.getAge());
//    }

}
